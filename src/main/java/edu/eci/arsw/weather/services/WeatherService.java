package edu.eci.arsw.weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.weather.modelo.City;
import edu.eci.arsw.weather.modelo.Weather;

import java.util.List;

public interface WeatherService {
    City getStatsByCity(String name) throws UnirestException;
} 
