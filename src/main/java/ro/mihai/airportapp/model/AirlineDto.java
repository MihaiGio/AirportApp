package ro.mihai.airportapp.model;

public class AirlineDto {

    private String name;
    private String callsign;
    private String country;
    private Boolean active;

    public AirlineDto() {
    }

    public AirlineDto(String name, String callsign, String country, Boolean active) {
        this.name = name;
        this.callsign = callsign;
        this.country = country;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
