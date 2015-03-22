"use strict";

function extractObjects(array) {

    var outputObject = [];
    for (var i in array) {
       if(typeof array[i] === "object" && !Array.isArray(array[i] )){
           outputObject.push(array[i]);
       }
    }

    return outputObject;
}

console.log (extractObjects([
        "Pesho",
        4,
        4.21,
        { name : 'Valyo', age : 16 },
        { type : 'fish', model : 'zlatna ribka' },
        [1,2,3],
        "Gosho",
        { name : 'Penka', height: 1.65}
    ]));

