// Original array
let numbers = [1, 2, 3, 4, 5];

// Using for loop to double each number
console.log("Using for loop to double each number:");
for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i] * 2);
}

// Using while loop to filter even numbers
console.log("\nUsing while loop to filter even numbers:");
let j = 0;
while (j < numbers.length) {
  if (numbers[j] % 2 === 0) {
    console.log(numbers[j]);
  }
  j++;
}

// Using do-while loop to find the first number greater than 3
console.log("\nUsing do-while loop to find the first number greater than 3:");
let k = 0;
do {
  if (numbers[k] > 3) {
    console.log(numbers[k]);
    break;
  }
  k++;
} while (k < numbers.length);
