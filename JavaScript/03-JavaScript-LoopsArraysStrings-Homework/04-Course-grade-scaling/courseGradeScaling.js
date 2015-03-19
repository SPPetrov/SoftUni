function solve(input) {

    var output = [];
    for (var index in input) {
        input[index].score = parseFloat(((Number(input[index].score))*1.1).toFixed(1));

        if(input[index].score > 100){
            input[index].hasPassed = true;
        }else{
            input[index].hasPassed = false;
        }
    }

    output = input.filter(function(a){
        return a.hasPassed === true;
    })

    output.sort(function (a, b){
        return a.name > b.name;
    });

    console.log(JSON.stringify(output));



}

solve([
    {
        'name' : 'Пешо',
        'score' : 91
    },
    {
        'name' : 'Лилия',
        'score' : 290
    },
    {
        'name' : 'Алекс',
        'score' : 343
    },
    {
        'name' : 'Габриела',
        'score' : 400
    },
    {
        'name' : 'Жичка',
        'score' : 70
    }

])