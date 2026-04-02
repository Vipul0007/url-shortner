package com.practice_projectt.url_shortner.Model;

import jakarta.persistence.*;

@Entity
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name ="main_url")
    private String mainUrl;
    private String short_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String mainUrl() {
        return mainUrl;
    }

    public void setMain_url(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public String getShort_url() {
        return short_url;
    }

    @Override
    public String toString() {
        return "UrlMapping{" +
                "id=" + id +
                ", main_url='" + mainUrl + '\'' +
                ", short_url='" + short_url + '\'' +
                '}';
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }
}
