"use strict";

function sortLetters(str, isAscending) {
    var arrLetter = [];
    for (var i = 0; i < str.length; i++) {
        arrLetter[i] = str[i];
    }

    if(isAscending){
        arrLetter = arrLetter.sort(function(a,b){return a.toLowerCase() > b.toLowerCase()});
    }else{
        arrLetter = arrLetter.sort(function(a,b){return a.toLowerCase() < b.toLowerCase()});
    }

    var sortedStr = arrLetter.join("");

    return sortedStr;

}

console.log(sortLetters('HelloWorld', true));
console.log(sortLetters('HelloWorld', false));
