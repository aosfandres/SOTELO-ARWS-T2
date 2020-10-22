const api = (() =>{
	
    const getCity = (city,callback) =>{
        axios.get('/weather/' + city).then(res=>{
            callback(res);
        }) 
    }

    return{
        getCity:getCity
    }
})();
