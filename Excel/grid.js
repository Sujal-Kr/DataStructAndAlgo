const rows=100
const cols=26 
let temp=65
const colcontainer=document.querySelector(".address-column-cont")
const rowcontainer=document.querySelector(".address-row-cont")
const cellscontainer=document.querySelector(".cells-cont")
const addressbar=document.querySelector(".address-bar")
for(let i=0;i<rows;i++){
    let row_address=document.createElement("div")
    row_address.innerText=i+1
    colcontainer.appendChild(row_address)
    row_address.setAttribute("class","address-col")
}

for(let i=0;i<cols;i++){
    const col_address=document.createElement("div")
    col_address.innerText=String.fromCharCode(temp++)
    rowcontainer.appendChild(col_address)
    col_address.setAttribute("class","address-row")
}


for(let i=0;i<rows;i++){
    let row_cont=document.createElement("div")
    row_cont.setAttribute("class","row-cont")
    for(let j=0;j<cols;j++){
        let cell=document.createElement("div")
        row_cont.appendChild(cell)
        cell.setAttribute("class","cell")
        cell.setAttribute("contenteditable","true")
        cell.setAttribute("spellcheck","false")
        cell.setAttribute("rid",i)
        cell.setAttribute("cid",j)
        addaddress(cell,i,j)
    }
    cellscontainer.appendChild(row_cont)
}
// adding event linstener for each cell to display thier address in the address bar
function addaddress(cell,i,j){
    cell.addEventListener("click",(e)=>{
        const row=i+1
        const col=String.fromCharCode(65+j)
        addressbar.value=`${col}${row}`
    })
}
