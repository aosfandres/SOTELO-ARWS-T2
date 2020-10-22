const app = (() =>{
    
    const getCity = (city) =>{
        api.getCity(city,relleno);
    }
	const relleno = (res) =>{
        //console.info(res.data)
		let datos = res.data;
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
   
    return{
        getCity:getCity
    }
})();
