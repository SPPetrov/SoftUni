"use strict";

function solve(input) {
    var validScore = input.filter(function (a) {
        if (a >= 0 && a <= 400) {
            return a;
        }
    });

    var scaleValidScore = validScore.map(function (a) {
        return Number((a * 0.8).toFixed(1));
    });

    scaleValidScore = scaleValidScore.sort(function (a, b) {
        return a > b;
    });

    console.log(scaleValidScore);

}

solve([200, 120, 23, 67, 350, 420, 170, 212, 401, 615, -1]);