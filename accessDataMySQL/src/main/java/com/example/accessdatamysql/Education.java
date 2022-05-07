package com.example.accessdatamysql;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private Float percentage;
    private int year;
    @ManyToMany(mappedBy = "educations")
    private Set<User> user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
