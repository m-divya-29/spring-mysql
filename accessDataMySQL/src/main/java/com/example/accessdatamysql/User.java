package com.example.accessdatamysql;

import javax.persistence.*;
import java.util.Set;

/**
 * Step 1: Hibernate automatically translates the entity into a database table.
 */
@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    @ManyToMany
    @JoinTable(
            name = "user_education",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "education_id")
    )
    private Set<Education> educations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}