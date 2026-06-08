package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lnr;

    private String shorttitle;
    private String description;
    
    private Double latitude;
    private Double longitude;

    // --- Getter und Setter ---

    public Long getLnr() {
        return lnr;
    }

    public void setLnr(Long lnr) {
        this.lnr = lnr;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}