package edu.eci.arsw.weather.httpconnectionservices.impl;

import com.mashape.unirest.http.HttpResponse;
import edu.eci.arsw.weather.httpconnectionservices.HTTPWeatherService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class HttpWeatherService implements HTTPWeatherService {

    @Override
    public JSONObject getWeatherByCity(String name) throws UnirestException {
        HttpResponse<String> response = Unirest
                .get("https://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=697d67ec4492f42e5940d426333aa066")
                .asString();
        return new JSONObject(response.getBody());
    }
}
 