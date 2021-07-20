class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    getName = () => this.name;
    getAge = () => this.age;

    print() {
        console.log('Name: '+this.name+'\tAge: '+this.age);
    }
}

//let p1 = new Person('Polo', 21);
//p1.print();

module.exports = {Person};
//module.exports = Person;