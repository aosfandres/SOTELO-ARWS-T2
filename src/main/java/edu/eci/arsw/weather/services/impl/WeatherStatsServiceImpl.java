package edu.eci.arsw.weather.services.impl;


import edu.eci.arsw.weather.httpconnectionservices.HTTPWeatherService;
import org.json.JSONObject;
import edu.eci.arsw.weather.modelo.*;
import edu.eci.arsw.weather.services.WeatherService;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherStatsServiceImpl implements WeatherService {
    @Autowired
    private HTTPWeatherService weatherService;
    @Override
    public City getStatsByCity(String name) throws UnirestException {
    	City ciudad = new City();
        JSONObject object = weatherService.getWeatherByCity(name);
        Coord coord = formatObject("coord",object,Coord.class);
        Clouds clouds = formatObject("clouds",object,Clouds.class);
        Stats mainStats = formatObject("main",object,Stats.class);
        JSONObject objectWeather = object.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapWeather(objectWeather);
        setCityWeatherStats(ciudad,coord,clouds,mainStats,weather,object);
        return null;
    }
    
    private void setCityWeatherStats(City ciudad, Coord coord, Clouds clouds, Stats mainStats, Weather weather, JSONObject object) {
    	//settear modelos
    	ciudad.setCoord(coord);
    	ciudad.setWeather(weather);
    	ciudad.setMainStats(mainStats);
    	ciudad.setClouds(clouds);
    	ciudad.setName(object.getString("name"));
    	ciudad.setTimezone(object.getInt("timezone"));
        ciudad.setCod(object.getInt("cod"));
        ciudad.setVisibility(object.getInt("visibility"));
    }

    private Weather mapWeather(JSONObject objectWeater) {
        Gson gson = new Gson();
        return gson.fromJson(objectWeater.toString(),Weather.class);
    }
    private <T> T formatObject(String objectName, JSONObject object, Class objectClass){
        Gson gson = new Gson();
        String stringObject =  object.getJSONObject(objectName).toString();
        T formattedObject = (T) gson.fromJson(stringObject,objectClass);
        return formattedObject;
    }
    
}
