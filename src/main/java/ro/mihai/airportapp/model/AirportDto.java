package ro.mihai.airportapp.model;

import java.math.BigDecimal;

public class AirportDto {

    private Long id;
    private String name;
    private String city;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public AirportDto() {
    }

    public AirportDto(Long id, String name, String city, String country, BigDecimal latitude, BigDecimal longitude) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
