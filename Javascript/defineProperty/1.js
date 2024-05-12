const obj = {
    name: "monish",
    age: "24"
}

// make the age not changeably.
Object.defineProperty(obj,"age", {
    get(){
        // write some logic when you get value
        // return this.age ; never do this as it will lead to infinite loop
    },
    set(newAge){
        // this.age = newAge; never do this as it will lead to infinite loop
        // write some logic when you set value
        console.log(newAge)
    }
});

obj.age = "27";
console.log(obj.age);
console.log(obj.name);

/*
basically when we use the get and setters methods inside the define property we can never use this.property the Object is defining 
for example we can never use this.age in the above define property;
*/