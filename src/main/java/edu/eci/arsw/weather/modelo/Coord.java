package edu.eci.arsw.weather.modelo;

public class Coord {
    private double lon;
    private double lat;

    public Coord() {
    }

    /*
     * Constructor para data
     * 
     * @param lon
     * @param lat
     */
    public Coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
