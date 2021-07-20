function check() {
    var criterion;
    var radios = document.getElementsByName("criteria");
    for (var i=0;i<radios.length;i++) {
        if (radios[i].type === 'radio' && radios[i].checked) {
            criterion = radios[i].value;
            break;
        }
    }
    var textvalue = document.getElementById("searchtext").value;
    console.log(criterion+"   "+textvalue);

    if (textvalue===null || textvalue=="") {
        alert('Please enter a search string!');
    }

    if (document.getElementById("case").checked) {
        alert("Checking for "+textvalue+" with criteria "+criterion+" with case matching!");
    }
    else
    {
        alert("Checking for "+textvalue+" with criteria "+criterion);
    }
}

function reset() {
    document.getElementById("searchform").reset();
}