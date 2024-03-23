// Original array
let numbers = [1, 2, 3, 4, 5];

// Using map() to double each number
const doubledNumbers = numbers.map(num => num * 2);

console.log("Doubled numbers:", doubledNumbers);

// Using filter() to get only even numbers
const evenNumbers = numbers.filter(num => num % 2 === 0);

console.log("Even numbers:", evenNumbers);

// Using reduce() to calculate the sum of all numbers
const sum = numbers.reduce((acc, curr) => acc + curr, 0);

console.log("Sum of numbers:", sum);

// Using find() to find the first number greater than 3
const greaterThanThree = numbers.find(num => num > 3);

console.log("First number greater than 3:", greaterThanThree);

// Using some() to check if any number is greater than 5
const hasNumberGreaterThanFive = numbers.some(num => num > 5);

console.log("Any number greater than 5?", hasNumberGreaterThanFive);

// Using every() to check if all numbers are less than 10
const allNumbersLessThanTen = numbers.every(num => num < 10);

console.log("Are all numbers less than 10?", allNumbersLessThanTen);

// Using includes() to check if the array includes number 3
const includesThree = numbers.includes(3);

console.log("Does the array include number 3?", includesThree);

// Using indexOf() to find the index of number 4
const index = numbers.indexOf(4);

console.log("Index of number 4:", index);

// Using splice() to remove number 2 from the array
const removedItem = numbers.splice(1, 1);

console.log("Array after removing number 2:", numbers);

// Pushing a new number to the end of the array
numbers.push(6);

console.log("Array after pushing 6:", numbers);

// Popping the last number from the array
const poppedNumber = numbers.pop();

console.log("Popped number:", poppedNumber);
console.log("Array after popping:", numbers);

// Slicing the array to get a subset
const slicedArray = numbers.slice(1, 3);

console.log("Sliced array:", slicedArray);

// Shifting (removing) the first number from the array
const shiftedNumber = numbers.shift();

console.log("Shifted number:", shiftedNumber);
console.log("Array after shifting:", numbers);

// Unshifting (adding) a number to the beginning of the array
numbers.unshift(0);

console.log("Array after unshifting 0:", numbers);
