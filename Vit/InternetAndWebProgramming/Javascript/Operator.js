// Assignment Operators
let a = 5;
let b = 10;
let c = a + b;
console.log("Initial values:", a, b, c);

a += 2; // Equivalent to: a = a + 2;
b -= 3; // Equivalent to: b = b - 3;
c *= 4; // Equivalent to: c = c * 4;
console.log("After assignment operations:", a, b, c);

// Arithmetic Operators
let num1 = 10;
let num2 = 3;

let addition = num1 + num2;
let subtraction = num1 - num2;
let multiplication = num1 * num2;
let division = num1 / num2;
let modulus = num1 % num2;

console.log("Addition:", addition); 
console.log("Subtraction:", subtraction); 
console.log("Multiplication:", multiplication); 
console.log("Division:", division); 
console.log("Modulus:", modulus); 

// Conditional (Ternary) Operator
let x = 15;
let y = (x > 10) ? "Greater than 10" : "Less than or equal to 10";
console.log("Conditional operator result:", y);

// Bitwise Operators
let binaryNum1 = 5; // Binary: 101
let binaryNum2 = 3; // Binary: 011

let bitwiseAND = binaryNum1 & binaryNum2;
let bitwiseOR = binaryNum1 | binaryNum2;
let bitwiseXOR = binaryNum1 ^ binaryNum2;
let bitwiseNOT = ~binaryNum1;

console.log("Bitwise AND:", bitwiseAND); 
console.log("Bitwise OR:", bitwiseOR);  
console.log("Bitwise XOR:", bitwiseXOR); 
console.log("Bitwise NOT of binaryNum1:", bitwiseNOT); 

// Logical Operators
let p = true;
let q = false;

console.log("Logical AND:", p && q); 
console.log("Logical OR:", p || q);  
console.log("Logical NOT of p:", !p);
