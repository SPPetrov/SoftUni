"use strict";
function convertToKnot (kmPerHour){
    var knots = kmPerHour*0.5399568034557235;
    knots = knots.toFixed(2);
    console.log(knots);
}

convertToKnot(20);
convertToKnot(112);
convertToKnot(400);


