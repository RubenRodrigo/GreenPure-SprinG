var data;
var myLatLng = { lat: -16.3988084, lng: -71.5390997 };

var GOOD_AIR = 30;
var MODERATE_AIR = 50;
var REGULAR_AIR = 70;
var CALIDAD_ESTADO = "NaN";

function setData(data) {
  this.data = data;
}
function setLatLng(myLatLng) {
  this.myLatLng = myLatLng;
}

function initMap() {
  // map configuration
  var map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: myLatLng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
  });

  // set markers to map
  data.forEach((element) => {
    var classInfo = headerColorCalidad(element.calidadAVG);
    var contentString = `    
      <div id="infoWindow">
        <div>
          <h6><strong>${element.ciudad}</strong>, ${element.distrito}</h6>
        </div>
        <div>
          <div class="infoWindow">
            <div class="${classInfo}-window p-2">
              <h3>${element.calidadAVG}</h3> 
            </div>
            <div class="${classInfo}-window-data p-2" style="cursor: pointer" onclick='infoWindowListener(${element.idDistrito})'>
              <h5>Bueno</h5> 
            </div>
          </div>
        </div>
      </div>
    `;
    var lat = parseFloat(element.latitud);
    var lng = parseFloat(element.longitud);
    var infowindow = new google.maps.InfoWindow({
      content: contentString,
    });

    const marker = new google.maps.Marker({
      position: new google.maps.LatLng(lat, lng),
      map: map,
      title: "Hello World",
    });

    marker.addListener("click", () => {
      infowindow.open(map, marker);
    });
  });
}

function headerColorCalidad(calidadAVG){
var estado = ""
		if(calidadAVG >= 0 && calidadAVG <= GOOD_AIR) {
			estado = "header-data-good";
		} else if(calidadAVG > GOOD_AIR && calidadAVG <=MODERATE_AIR) {
			estado = "header-data-moderate";
		} else if(calidadAVG > MODERATE_AIR && calidadAVG <= REGULAR_AIR) {
			estado = "header-data-regular";
		} else if(calidadAVG > REGULAR_AIR) {
			estado = "header-data-bad";
		} else {
			estado = "NaN";
		}
	return estado
}

function infoWindowListener(id){
	location.href=`/distrito/${id}`
}
