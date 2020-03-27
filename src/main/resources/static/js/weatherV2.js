$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
        items:1,
        loop:true,
        margin:10,
        autoWidth:true,
        autoplay:true,
        autoplayTimeout:3000,
        autoplayHoverPause:true,
        nav:true,
        responsive:{
            0:{
                items:1
            },
            600:{
                items:3
            },
            1000:{
                items:5
            }
        }
    });

    // Get the element with id="defaultOpen" and click on it
    document.getElementById("defaultOpen").click();

});

function checkStatus(){
    var checkBox = document.getElementById('timeMachine');

    if(checkBox.checked){
        date.disabled = this.checked;
    } else {
        document.getElementById('date').disabled = !this.checked;
        document.getElementById('date').value = "";
    }
}

function openTab(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}