for(let i=0;i<rows;i++){
    for(let j=0;j<cols;j++){
        let cell= document.querySelector(`.cell[rid="${i}"][cid="${j}"]`)
        cell.addEventListener("blur",(e)=>{
            let address= addressbar.value
            let  [activeCell , cellprop]=activecell(address)
            let entereddata= activeCell.innerText
            cellprop.data=entereddata
        })
    }
} 

const formulabar=document.querySelector('.formula-bar')
formulabar.addEventListener("keydown",(e)=>{
    let inputFormula=formulabar.value
    if(e.key=="Enter" && inputFormula){
        let evaluatedvalue=evaluateFormula(inputFormula)
        // set UI andd cell properties
        setcellUIandcellprop(evaluatedvalue,inputFormula)
        addchildtoparent(inputFormula)
        console.log(DBsheet);
    }
})

function addchildtoparent(exp){
    let childaddress=addressbar.value
    let encodedexp= exp.split(" ")
    for(let i=0;i<encodedexp.length;i++){
        let asciivalue= encodedexp[i].charCodeAt(0)
        if(asciivalue>=65&&asciivalue<=90){
            let [cell,parentcellprop]=activecell(encodedexp[i])
            parentcellprop.children.push(childaddress)
        }
    }
}

function evaluateFormula(exp){
    let encodedexp= exp.split(" ")
    for(let i=0;i<encodedexp.length;i++){
        let asciivalue= encodedexp[i].charCodeAt(0)
        if(asciivalue>=65&&asciivalue<=90){
            let [cell,cellprop]=activecell(encodedexp[i])
            encodedexp[i]=cellprop.data
        }
    }
    let decodedexp=encodedexp.join(" ")
    return eval(decodedexp)
}
function setcellUIandcellprop(evaluatedvalue, exp){
    let address= addressbar.value
    let [cell,cellprop]= activecell(address)
    cell.innerText=evaluatedvalue
    cellprop.data=cell.innerText
    cellprop.formula=exp
}