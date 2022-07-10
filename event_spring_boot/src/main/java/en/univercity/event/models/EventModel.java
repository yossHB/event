package en.univercity.event.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Event")
public class EventModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String details;
    private Date date;


    public void Event(Long id, String name, String description, String details, Date date) {
        this.id=id;
        this.name = name;
        this.description=description;
        this.details=details;
        this.date=date;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public List<EventModel> getEventsList(Date date){
        return null;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", details='" + details + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
