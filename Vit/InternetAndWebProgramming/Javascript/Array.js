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


// Higher Order functions....
// map
const updatedFilter=merge.map((item)=>{
    return item+10
})
console.log("Updated array using map",updatedFilter)
// reduce
const ans=table.reduce((acc,item)=>{
    return acc+=item
},0)
console.log("The sum  of the array is ",ans)

// filter
console.log(merge)
const filteredArr=merge.filter(item=>{
    return item%2==0
})
console.log("New filtered array is ",filteredArr)



// Some healthy experiments...
const help=[34,56,78,90,12]
console.log(help)
help.forEach(printHelp)
function printHelp(item,index,arr){
    arr[index]=item+" calling for help";
}
console.log("hi iam here",help);