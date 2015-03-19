"use strict";

function replaceATag(str) {

    str = str.replace(/(<a)/g, '[URL');
    str = str.replace(/(>\b)/g, ']');
    str = str.replace(/(<\/a>)/g, '[/URL]');
    str = str.replace('><', '>\n\t<');
    str = str.replace('>[', '>\n\t\t[');
    str = str.replace(']<', ']\n\t<');
    str = str.replace('><', '>\n<');
    console.log(str);
}

replaceATag(
    '<ul>' +
    '<li>' +
    '<a href=http://softuni.bg>SoftUni</a>' +
    '</li>' +
    '</ul>'
);