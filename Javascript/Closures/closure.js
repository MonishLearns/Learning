
// we have achieved encapsulation through closures
// All the variables defined inside the inner functions will have access to variables of the outer function
function Counter(){
    let count =0;
    return function(){
        count = count+1;
        return count;
    }
}

const counter = Counter();
console.log(counter());
console.log(counter());
console.log(counter());