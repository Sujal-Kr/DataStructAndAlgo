class tree{
    constructor(name){
        this.name = name
    }
    getName(){
        return this.name
    }
    setName(name){
        this.name = name
    }
}
x=new tree("sujal")
console.log(x.getName())
x.setName("shikhar")
console.log(x.getName())

function baseFun(n){
    return function (num){
       console.log(n+num) 
    }
}
const base=baseFun(10)
base(56)