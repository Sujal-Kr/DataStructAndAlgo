let arr=[1,2,3,4,5,6,89,34,232]
// console.log(arr);
arr.splice(3,3)
let temp=arr.slice(1,5)
// console.log("Retrival",temp)


// contact
let odd=[1,3,5,7,9]
let even=[2,4,6,8]
const merge=odd.concat(even)
// console.log(merge)
// 
for(let i=0; i<merge.length; i++) {
    // console.log(merge.indexOf(merge[i]));
}
let lang=["java","javascript","python","c#"]
// console.log(lang.indexOf("python"));

console.log(checkEven(5));
function checkEven(num){
    return num%2==0?true:false
}
let table=[2,4,6]
const printTable=(item)=>{
    let i=1;
    console.log("Table of ",item);
    while(i<=10){
        console.log(item*i);
        i++
    }
}
table.forEach(printTable)
