package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ObservationSmell {

    @Id
    private Long id;

    /* * CODE SMELL: Long Parameter List
     * Eine Methode mit zu vielen Parametern
     * SonarQube wird hier sofort ein "Major Issue" werfen.
     */
    
    
//    
//    public void updateObservationDetails(String name, String latin, double weight, double size, 
//                                          int age, String gender, String locTitle, String locDesc, 
//                                          double lat, double lng, String date, String time) {
//    }
//    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}