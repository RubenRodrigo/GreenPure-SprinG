var latitud;
var longitud;
function setLatitud(latitud) {
  this.latitud = parseInt(latitud);
}
function setLongitud(longitud) {
  this.longitud = parseInt(longitud);
}

function initMap() {
  // map configuration
  const myLatLng = { lat: latitud, lng: longitud };
  var map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: myLatLng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
  });
  var marker;

  // set markers to map
  marker = new google.maps.Marker({
    position: new google.maps.LatLng(myLatLng),
    map: map,
    title: "Hello World",
  });
}
