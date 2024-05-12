/*
    write a code to define an object which has age property and that age property should always be 24 and can never be changable
*/

const person = {
    name:"monishreddy",
    age: "24",
}

person.age = "25";

Object.defineProperty(person,"age",{
    writable: false
});

person.age="27";

console.log(person.age); // 25