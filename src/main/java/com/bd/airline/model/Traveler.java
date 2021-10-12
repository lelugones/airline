package com.bd.airline.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="traveler")
public class Traveler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_traveler")
    private Long id;

    @Column(name="name", insertable = true, nullable = false, length = 50, updatable = true)
    private String name;

    @Column(name = "dni", insertable = true, nullable = false, length = 10, updatable = true, unique = true)
    private String dni;

    private Date dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
