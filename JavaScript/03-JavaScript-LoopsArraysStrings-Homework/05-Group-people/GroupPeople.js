

function Person(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}



var people = [
    new Person("Scott", "Guthrie", 38),
    new Person("Scott", "Johns", 36),

    new Person("Jesse", "Liberty", 57),
    new Person("Jon", "Skeet", 38),
    new Person("Scott", "Hanselman", 39)
];

function groupBy(criteria){

    var output = {};
    for (var i = 0; i < people.length; i++) {
        var key = "Group " + people[i][criteria];
        if(output[key] === undefined){
           output[key] = [];
        }

       output[key].push(people[i].firstName +" " + people[i].lastName +"(age "+people[i].age +")");

    }
    return console.log(output);


}

groupBy('firstName');