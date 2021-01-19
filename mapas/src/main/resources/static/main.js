var data
function setData(data) {
  this.data = data
}

function initMap() { 
  // map configuration
  const myLatLng = { lat:-16.3988084, lng:-71.5390997 };
  var map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: myLatLng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  });
  var marker;
  
  
  // set markers to map
  data.forEach(element => {
    console.log(element.latitud);
    var lat = parseInt(element.latitud)
    var lng = parseInt(element.longitud)
    marker = new google.maps.Marker({
      position: new google.maps.LatLng(lat, lng),
      map: map,
      title: "Hello World"
    });
  });

}
