package edu.eci.arsw.weather.httpconnectionservices;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface HTTPWeatherService {
    public JSONObject getWeatherByCity(String name) throws UnirestException;
}
