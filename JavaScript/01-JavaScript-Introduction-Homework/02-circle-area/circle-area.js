
function calcCircleArea(r){
    var area = Math.PI*Math.pow(r,2);
    document.write("<p>r = " + r + "; area = " + area + ";</p>" );
}

var inputDate = [7, 1.5, 20];

for (var index in inputDate) {
    calcCircleArea(inputDate[index]);

}