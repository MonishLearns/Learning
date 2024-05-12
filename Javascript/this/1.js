


function calculate()
{
    this.ans =0;
    this.add = function(n){
        this.ans+=n;
        return this;
    }
    this.sub = function(n){
        this.ans-=n;
        return this;
    }
    this.mul = function(n){
        this.ans*=n;
        return this;
    }
    this.div = function(n){
        this.ans/=n;
        return this;
    }

    this.valueOf = function() {
        return this.ans;
    }
}

function compute() {
    return new calculate();
}





ans = compute().add(200).sub(100).mul(2).div(100).valueOf();
console.log(ans); // 2

ans1 = compute();
console.log(ans1);
ans2 = compute().add(200);
console.log(ans2);
// calculate {
//     ans: 0,
//     add: [Function (anonymous)],
//     sub: [Function (anonymous)],
//     mul: [Function (anonymous)],
//     div: [Function (anonymous)],
//     valueOf: [Function (anonymous)]
//   }