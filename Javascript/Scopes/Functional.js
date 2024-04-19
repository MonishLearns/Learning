function sum1(){
    console.log(c); // Reference error: c is not defined.
}
function sum(a,b){
    var c = 10;
    sum1();
}
sum();

let c =5;
function sum3(){
    console.log(c); // 5
}
function sum2(a,b){
    var c = 10;
    sum1();
}
sum3();