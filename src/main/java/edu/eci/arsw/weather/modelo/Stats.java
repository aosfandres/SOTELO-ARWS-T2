package edu.eci.arsw.weather.modelo;

public class Stats {
	
    private double temp;
    private double temp_min;
    private double temp_max;
    private double pressure;
    private double humidity;


    public Stats(double temperature, double minTemperature, double maxTemperature, double presure, double humidity) {
        this.temp = temperature;
        this.temp_min = minTemperature;
        this.temp_max = maxTemperature;
        this.pressure = presure;
        this.humidity = humidity;
    }
    
    public Stats() {
    }
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
