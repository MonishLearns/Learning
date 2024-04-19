console.log(10=="10"); // true changes the type before conversion
console.log(10==="10"); // false check the value and also type
console.log(NaN===NaN); // false
console.log(Object.is(NaN,NaN)); // true