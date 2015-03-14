"use strict";

function quadratic_equation(a, b, c) {
    if (a !== 0) {
        var discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            var x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            var x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            console.log("x1 = " + x1);
            console.log("x2 = " + x2);
        } else if (discriminant === 0) {
            var x = -b / 2 * a;
            console.log("x = " + x);
        } else {
            console.log("No real rots");
        }
    }
}

quadratic_equation(2, 5, -3);
quadratic_equation(2, -4, 2);
quadratic_equation(4, 2, 1);