package edu.eci.arsw.weather.modelo;

public class Weather {
    private int id;
    private String main;
    private String description;

    public Weather() {
    }
    
    
    /*
     * Constructor para data 
     * 
     * @param id
     * @param main
     * @param description
     */
    
    public Weather(int id, String main, String description) {
        this.id = id;
        this.main = main;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
