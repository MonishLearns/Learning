// Inheritance in js is totally different compared to other languages.
// prototypal inheritance is like one object trying to access the properties of another object

let object = {
    name: "monish",
    place: "Bagepalli",
    getIntro: function() {
        console.log(this.name + " from " + this.place);
    }
}
object.getIntro(); // monish from Bagepalli

// in javascript whenever you create objects, the js bind a lot of functions and properties to that objects.
// an example would be when we create a function, we get apply,call,bind automatically
// js in the background uses the concept called prototype to achieve this.

// we have something called as __proto__ , this is how js easily assigns the properties like the above example

const arr = [1,2,3];
console.log(arr.__proto__);

// never do this in the code like above

// let try to add a new functions like apply, call, bind to all the functions

Function.prototype.myCustomBind = function() {
    console.log("monishreddybs");
}

function fun() {

}
fun.myCustomBind(); // monishreddybs

// This is like add a new function to the parent class and all the child classes automatically get access

