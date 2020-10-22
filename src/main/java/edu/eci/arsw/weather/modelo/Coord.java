package edu.eci.arsw.weather.modelo;

public class Coord {
	
    private double longitud;
    private double latitud;

    public Coord() {
    }

    public Coord(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLat(double latitud) {
        this.latitud = latitud;
    }
}
