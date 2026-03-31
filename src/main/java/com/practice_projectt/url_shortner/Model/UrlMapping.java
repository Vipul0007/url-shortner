package com.practice_projectt.url_shortner.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String main_url;
    private String short_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain_url() {
        return main_url;
    }

    public void setMain_url(String main_url) {
        this.main_url = main_url;
    }

    public String getShort_url() {
        return short_url;
    }

    @Override
    public String toString() {
        return "UrlMapping{" +
                "id=" + id +
                ", main_url='" + main_url + '\'' +
                ", short_url='" + short_url + '\'' +
                '}';
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }
}
