{
    var a=10;
}
console.log(a); // 10

{
    let b=10;
}
console.log(b); // ReferenceError: b is not defined

// This is why we say let and const are blocked scope where var is not.