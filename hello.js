class Person {
    constructor(name) {
        this.name = name;
        console.log(new.target);
    }
}
 
class Employee extends Person {
    constructor(name, title) {
        super(name);
        this.title = title;
    }
}
 
let john = new Person('John Doe'); // Person
let lily = new Employee('Lily Bush', 'Programmer');