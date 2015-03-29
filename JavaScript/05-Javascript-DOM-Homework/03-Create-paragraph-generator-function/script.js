
function createParagraph(id, text){
    var paragraph = document.createElement("p");
    paragraph.innerHTML = text;
    var element = document.getElementById(id);
    element.appendChild(paragraph);
}

createParagraph('wrapper', 'Some text');