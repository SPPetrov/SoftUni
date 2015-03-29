
var HTMLGen = {

    createParagraph : function (id, text){
        var paragraph = document.createElement("p");
        paragraph.innerHTML = text;
        var element = document.getElementById(id);
        element.appendChild(paragraph);
    },

    createDiv : function (id, nameOfClass ) {
        var div = document.createElement("div");
        div.setAttribute('class', nameOfClass);
        var element = document.getElementById(id);
        element.appendChild(div);
    },

    createLink : function (id, text, url){
        var link = document.createElement("a");
        link.setAttribute('href', url);
        link.innerHTML = text;
        var element = document.getElementById(id);
        element.appendChild(link);
    }

}



HTMLGen.createParagraph('wrapper', 'Soft Uni');
HTMLGen.createDiv('wrapper', 'section');
HTMLGen.createLink('book', 'C# basics book', 'http://www.introprogramming.info/');
