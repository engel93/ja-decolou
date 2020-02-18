package model;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle implements BaseEntity{

    @Id
    @GeneratedValue(generator = "vehicle_seq", strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "identifier")
    private String identifier;

    public Vehicle(Long id, String name, String identifier) {
        this.id = id;
        this.name = name;
        this.identifier = identifier;
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
