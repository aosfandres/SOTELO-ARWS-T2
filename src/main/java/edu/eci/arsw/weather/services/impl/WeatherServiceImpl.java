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
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private HTTPWeatherService weatherService;
    @Override
    public City getStatsByCity(String name) throws UnirestException {
    	City cityWeather = new City();
        JSONObject object = weatherService.getWeatherByCity(name);
        Coord coord = formatObject("coord",object,Coord.class);
        Clouds clouds = formatObject("clouds",object,Clouds.class);
        Stats mainStats = formatObject("main",object,Stats.class);
        JSONObject objectWeather = object.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapWeather(objectWeather);
        Wind wind = formatObject("wind",object,Wind.class);
        setCityWeatherStats(cityWeather,wind,coord,clouds,mainStats,weather,object);
        return cityWeather;
    }
    
    private void setCityWeatherStats(City cityWeather,Wind wind, Coord coord, Clouds clouds, Stats mainStats, Weather weather, JSONObject object) {
        cityWeather.setCoord(coord);
        cityWeather.setWeather(weather);
        cityWeather.setWind(wind);
        cityWeather.setMainStats(mainStats);
        cityWeather.setClouds(clouds);
        cityWeather.setName(object.getString("name"));
        cityWeather.setTimezone(object.getInt("timezone"));
        cityWeather.setCod(object.getInt("cod"));
        cityWeather.setVisibility(object.getInt("visibility"));

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
