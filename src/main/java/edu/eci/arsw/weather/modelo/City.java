package edu.eci.arsw.weather.modelo;

public class City {

    private Coord coord;
    private String name;
    private int timezone;
    private Clouds clouds;
    private Stats Stats;
    private int visibility;
    private int cod;
    private Weather weather;
    private Wind wind;
 
   

    public City( Stats Stats, Weather weather, Wind wind, String name, int timezone, Coord coord, Clouds clouds, int visibility, int cod) {
        this.coord = coord;
        this.clouds = clouds;
        this.Stats = Stats;
        this.weather = weather;
        this.wind = wind;
        this.name = name;
        this.timezone = timezone;
        this.visibility = visibility;
        this.cod = cod;
    }
    
    public City() {
    }
    public Coord getCoord() {
        return coord;
    }
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Stats getMainStats() {
        return Stats;
    }

    public void setMainStats(Stats mainStats) {
        this.Stats = mainStats;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
