$(document).ready(function(){
    // Get the element with id="defaultOpen" and click on it
    document.getElementById("defaultOpen").click();
    initMap();
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

function initMap() {
    var macarte = null;

    // Leaflet ne récupère pas les cartes (tiles) sur un serveur par défaut. Nous devons lui préciser où nous souhaitons les récupérer. Ici, openstreetmap.fr

    var osm = L.tileLayer ('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',    {
            attribution: 'données © <a href="//osm.org/copyright">OpenStreetMap</a>/ODbL - rendu <a href="//openstreetmap.fr">OSM France</a>',
            minZoom: 1,
            maxZoom: 20
        });

    var mapTemp = 'https://tile.openweathermap.org/map/temp_new/{z}/{x}/{y}.png?appid=' + openweatherAPIKey;
    var mapClouds = 'https://tile.openweathermap.org/map/clouds_new/{z}/{x}/{y}.png?appid=' + openweatherAPIKey;
    var mapRain = 'https://tile.openweathermap.org/map/precipitation_new/{z}/{x}/{y}.png?appid=' + openweatherAPIKey;
    var mapWind = 'https://tile.openweathermap.org/map/wind_new/{z}/{x}/{y}.png?appid=' + openweatherAPIKey;

    var baseMaps = {
            "Standard": osm
        };

    var tempLayer = L.tileLayer(mapTemp);
    var cloudsLayer =  L.tileLayer(mapClouds);
    var rainLayer  =  L.tileLayer(mapRain);
    var windLayer  =  L.tileLayer(mapWind);

    var overlayMaps = {
        "Temperature" : tempLayer,
        "Nuages" : cloudsLayer,
        "Pluie" : rainLayer,
        "Vent" : windLayer
    }

    macarte = L.map("map", {
          layers: [osm]
    }).setView([lat, long], 5);

    L.control.layers(baseMaps, overlayMaps).addTo(macarte);

    // Nous ajoutons un marqueur
    var marker = L.marker([lat, long]).addTo(macarte);
}

//http://maps.openweathermap.org/maps/2.0/weather/TA2/{z}/{x}/{y}?appid=931ae6314b44bbd4f20fc59acbe499df