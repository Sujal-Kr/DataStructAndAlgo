const first="num"
const second="msdsdun"

function check(first, second) {

    let one=first.split("").sort().join("")
    let two=second.split("").sort().join("")
    console.log(one, two)
    if(one===two) {

        return true
    }
    else{
       return false
    }
}

console.log(check(first, second))