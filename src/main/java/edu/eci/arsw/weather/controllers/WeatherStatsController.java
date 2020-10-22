package edu.eci.arsw.weather.controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.modelo.City;
import edu.eci.arsw.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherStatsController {
	
    @Autowired
    private WeatherService weatherStatsService;
    @GetMapping("/{name}")
    public ResponseEntity<?> getWeatherByCity(@PathVariable String name){
        Map<String,String> error= new HashMap<>();
        try{
            City data = weatherStatsService.getStatsByCity(name);
            System.out.println(data);
            return new ResponseEntity<>(data, HttpStatus.OK);
        }catch (UnirestException e){
            error.put("error", e.getMessage());
            return  new ResponseEntity<>(error,HttpStatus.FORBIDDEN);
        }
    }
}
