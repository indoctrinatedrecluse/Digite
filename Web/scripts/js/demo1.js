function add(a, b) {
    return a+b;
}

var sub = function(a,b) {
    return a-b;
}

var multi = (a,b) => a*b;

var sayHello = () => "Hello Javascript";

/*console.log(sayHello());
console.log(add(10,20));
console.log(sub(10,5));
console.log(multi(10,10));*/

module.exports = {add, sub, multi, sayHello};