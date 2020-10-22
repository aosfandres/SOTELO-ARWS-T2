const app = (() =>{
    
    const getCity = (city) =>{
        api.getCity(city,relleno);
    }
	const relleno = (res) =>{
        //console.info(res.data)
		let datos = res.data;
		imprimirMapa(datos.coord)
		$("#tablee").empty();
		var row = "<tr><td>"+ datos.name +
		"</td> <td>"+datos.timezone+
		"</td> <td>"+datos.visibility+
		"</td> <td>"+datos.weather.main+
		"</td> <td>"+datos.weather.description+
		"</td> <td>"+datos.mainStats.temp_min+
		"</td> <td>"+datos.mainStats.temp_max+
		"</td> <td>"+datos.mainStats.pressure+
		"</td> <td>"+datos.mainStats.humidity+
		"</td> </tr>";
		$("#tablee").append(row)
    }
 
	const init = () =>{
        initMap();
    }
    var initMap = () => {
        map = new google.maps.Map(document.getElementById("map-canvas"), {
            zoom: 2,
            center: {lat: 35.717, lng: 139.731},
        });
    }

    function imprimirMapa(coordenadas) {
        lugar = [];
        bounds = new google.maps.LatLngBounds();
        var position = new google.maps.LatLng(coordenadas.lat, coordenadas.lon);
        lugar.push( new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP
            })
        );
        bounds.extend(position);
        map.fitBounds(bounds);
        map.setZoom(4);
    }
	
    return{
        getCity:getCity,
		init:init
		
    }
})();
