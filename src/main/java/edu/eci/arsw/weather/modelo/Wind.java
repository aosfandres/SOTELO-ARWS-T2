package edu.eci.arsw.weather.modelo;

public class Wind {
    private double speed;
    private double deg;

    
    /*
     * Constructor para data 
     * 
     * @param speed
     * @param deg
     */
    public Wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
