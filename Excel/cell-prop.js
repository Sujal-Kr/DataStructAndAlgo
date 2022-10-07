// This JS file is for storage purpose
let DBsheet=[]
for(let i=0;i<rows;i++){
    let rowSheet=[]
    for(let j=0;j<cols;j++){
        cellprop={
            bold:false,
            italic:false,
            underline:false,
            alignment:"none",
            fontFamily:"Monospace",
            fontSize:"12",
            fontColor:"#000000",
            BgColor:"#ecf0f1",
            data:"",
            formula: "",
            children:[],
        }
        rowSheet.push(cellprop)
    }
    DBsheet.push(rowSheet)
}

// localStorage.setItem("Excel",JSON.stringify(DBsheet)
// bold eventListener
const bold=document.querySelector(".bold")
const italic=document.querySelector(".italic")
const underline=document.querySelector(".underline")
const rightalign=document.querySelector(".right")
const leftalign=document.querySelector(".left")
const centeralign=document.querySelector(".center")
const align=document.querySelectorAll(".align")
const fontfamily=document.querySelector(".fontfamily")
const fontsize=document.querySelector(".fontsize")
const fontcolor=document.querySelector(".font-color-prop")
const bgcolor=document.querySelector(".BGcolor-prop")
const activecolor="#ffdf00"
const nonactivecolor="#ecf0f1"
bold.addEventListener("click",(e)=>{
    let address= addressbar.value
    let [cell,cellprop]=activecell(address)

    // Modification
    cellprop.bold= !cellprop.bold // change ing data (object of the partcular cell) 
    cell.style.fontWeight= cellprop.bold ? "bold":"normal" // change in the UI
    bold.style.backgroundColor= cellprop.bold?activecolor:nonactivecolor // change in the UI
})
italic.addEventListener("click",(e)=>{
    let address= addressbar.value
    let [cell,cellprop]=activecell(address)

    // Modification
    cellprop.italic= !cellprop.italic // change ing data (object of the partcular cell) 
    cell.style.fontStyle= cellprop.italic?"italic":"normal" // change in the UI
    italic.style.backgroundColor= cellprop.italic?activecolor:nonactivecolor // change in the UI
})
underline.addEventListener("click",(e)=>{
    let address=addressbar.value
    let [cell,cellprop]=activecell(address)

    // Modification
    cellprop.underline= !cellprop.underline // change ing data (object of the partcular cell) 
    cell.style.textDecoration= cellprop.underline?"underline":"none" // change in the UI
    underline.style.backgroundColor= cellprop.underline?activecolor:nonactivecolor // change in the UI
})
fontsize.addEventListener("change",(e)=>{
    let address=addressbar.value
    let [cell,cellprop]=activecell(address)
    cellprop.fontSize=fontsize.value
    cell.style.fontSize=cellprop.fontSize + "px"
    fontsize.value=cellprop.fontSize

})
fontfamily.addEventListener("change",(e)=>{
    let address=addressbar.value
    let [cell,cellprop]=activecell(address)
    cellprop.fontFamily=fontfamily.value
    cell.style.fontFamily=cellprop.fontFamily
    fontfamily.value=cellprop.fontFamily
  
})
fontcolor.addEventListener("change",(e)=>{
    let address= addressbar.value
    let [cell,cellprop]=activecell(address)
    cellprop.fontColor=fontcolor.value
    cell.style.color=fontcolor.value
    fontcolor.value=cellprop.fontColor
})
bgcolor.addEventListener("change",(e)=>{
    let address=addressbar.value
    let [cell,cellprop]=activecell(address)
    cellprop.BgColor=bgcolor.value
    console.log(bgcolor.value)
    bgcolor.value=cellprop.BgColor
    cell.style.backgroundColor=bgcolor.value
})
for(let i=0;i<align.length;i++){
    
    align[i].addEventListener("click",(e)=>{
        let address=addressbar.value
        let [cell,cellprop]=activecell(address)
        let alignvalue=e.target.classList[0]
        cellprop.alignment=alignvalue
        switch(alignvalue){ 
            case "left":leftalign.style.backgroundColor=activecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=nonactivecolor
                        break;
            case "center":leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=activecolor
                            break;
            case "right": leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=activecolor
            centeralign.style.backgroundColor=nonactivecolor
            break;
            default : leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=nonactivecolor
        }
        cell.style.textAlign=cellprop.alignment

        
    })
}
let allcells= document.querySelectorAll(".cell")
for(let i=0;i<allcells.length;i++){
    addlistenertoattachcellprop(allcells[i])
}
function addlistenertoattachcellprop(cell){
    // make 
    cell.addEventListener("click",(e)=>{
        let [rid,cid]=decodecellid(addressbar.value)
        let cellprop=DBsheet[rid][cid]
        // make ui changes
        cell.style.fontWeight= cell.style.fontWeight= cellprop.bold ? "bold":"normal"
        cell.style.fontStyle= cellprop.italic?"italic":"normal" 
        cell.style.textDecoration= cellprop.underline?"underline":"none"
        cell.style.fontFamily=cellprop.fontFamily
        cell.style.color=cellprop.fontColor
        cell.style.backgroundColor=cellprop.BgColor

        // apply UI in porperties 
        bold.style.backgroundColor= cellprop.bold?activecolor:nonactivecolor
        italic.style.backgroundColor= cellprop.italic?activecolor:nonactivecolor
        underline.style.backgroundColor= cellprop.underline?activecolor:nonactivecolor
        fontfamily.value=cellprop.fontFamily
        fontcolor.value=cellprop.fontColor
        fontfamily.value=cellprop.fontFamily
        fontsize.value=cellprop.fontSize
        formulabar.value=cellprop.formula

        switch(cellprop.alignment){ //apply UI
            case "left":leftalign.style.backgroundColor=activecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=nonactivecolor
                        break;
            case "center":leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=activecolor
                            break;
            case "right": leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=activecolor
            centeralign.style.backgroundColor=nonactivecolor
                    break;
            default :leftalign.style.backgroundColor=nonactivecolor
            rightalign.style.backgroundColor=nonactivecolor
            centeralign.style.backgroundColor=nonactivecolor
        }
    })
}



function activecell(address){
    let [rid,cid]=decodecellid(address)
    // access cell and storage object   
    let cell=document.querySelector(`.cell[rid="${rid}"][cid="${cid}"]`)
    let cellprop=DBsheet[rid][cid]
    return [cell,cellprop]
}

function decodecellid(address){
    let rid=Number(address.slice(1)-1)//row -id 1-> 0
    let cid=Number(address.charCodeAt(0))-65// col-id A-> 65
    return[rid,cid]
}