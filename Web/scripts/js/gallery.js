var images = new Array("../images/img1.jpg","../images/img2.jpg","../images/img3.jpg")
var cur_image_upper = 0;
var cur_image_lower = 0;

function previmage() {
    document.getElementById("upper").src= images[(++cur_image_upper)%3];
}

function nextimage() {
    document.getElementById("upper").src= images[(--cur_image_upper)%3];
}

function timedlower() {
    document.getElementById("lower").src= images[(++cur_image_lower)%3];
}

setInterval("timedlower()", 1000);