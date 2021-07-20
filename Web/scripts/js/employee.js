const Person = require('./person.js').Person;
//const Person = require('./person.js');

class Employee extends Person {
    constructor (name, age, salary) {
        super(name, age);
        this.salary = salary;
    }

    getSalary = () => this.salary;

    print() {
        super.print();
        console.log('Salary: '+this.salary);
    }
}

let e = new Employee('Polo', 21, 3000);
e.print();