package model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@Entity
public class Medcin  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String adresse;

    private String matricule;

    private int salaire;

    @Temporal(TemporalType.DATE)
    private Date datenaissance;

    @Temporal(TemporalType.DATE)
    private Date dateembauche;

    @ManyToOne
    @JoinColumn(name = "service")
    private Service service;


    @JoinTable(
            name = "medcin_specialite",
            joinColumns = @JoinColumn(name = "specialite"),
            inverseJoinColumns = @JoinColumn(name = "medcin")
    )
    @ManyToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE})
    private List<Specialite> specialites;
}
