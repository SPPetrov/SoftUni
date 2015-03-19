"use strict";

function solve(input) {

    var output = input.filter(function (a) {
        return !isNaN(a);
    });

    var sortedOutput = output.sort(function (a, b) {
        return a > b;
    });

    var maxCount = 0;
    var frequentNumber = 0;

    for (var i = 0; i < output.length; i++) {
        var count = 1;
        for (var j = i+1; j < output.length; j++) {
            if(output[i] === output[j]){
                count++;
            }
            if(count > maxCount){
                maxCount = count;
                frequentNumber = output[i];
            }
        }
    }

    var minNumber = sortedOutput[0];
    var maxNumber = sortedOutput[sortedOutput.length-1];

    console.log('Min number: ' + minNumber);
    console.log('Max number: ' + maxNumber);
    console.log('Most frequent number: ' + frequentNumber);
    console.log(sortedOutput.reverse());

}

solve(["Pesho",
    2,
    "Gosho",
    12,
    2,
    "true",
    9,
    undefined,
    0,
    "Penka",
    { bunniesCount : 10},
    [10, 20, 30, 40]
]);
