// Variable declaration
function hoistingExample(){
    console.log(myVar);
    var myVar = 10; // Reference Error when using const, let but gives undefined when using var
    console.log(myVar);
}
hoistingExample();

// Function Declarations Hoisting

hoistMe(); // Outputs: "I'm hoisted!"
function hoistMe() {
  console.log("I'm hoisted!");
}

// Function Expression

hoistMe1(); // Throws a TypeError
var hoistMe1 = function () {
  console.log("I'm not hoisted!");
};