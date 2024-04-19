// In JavaScript the value of this not refer to the function in which it is used or it’s scope but is determined mostly by the invocation context of function (context.function()) and where it is called.
// every function will automatically have access to this keyword in javascript
const obj = {
    name: "monish",
    lastname: "reddy",
}
let greeting = function(a,b) {
    return `${a},${b},${this.name},${this.lastname}`;
}

console.log(greeting(1,2)); // 1,2,undefined
console.log(greeting.call(obj,1,2)); // 1,2,monish

// apply and call are both same, except apply takes an array of arguments

console.log(greeting.apply(obj,[1,2])); // 1,2,monish

// bind is to separate the binding obj and the argumemts

let bound = greeting.bind(obj);
let bound1 = greeting.bind(obj,1,2);
console.log(bound(1,2)); // 1,2,monish
console.log(bound1()); // 1,2,monish