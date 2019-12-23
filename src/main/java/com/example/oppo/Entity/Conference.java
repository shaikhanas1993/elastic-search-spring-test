package com.example.oppo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "conference-index", type = "geo-class-point-type", shards = 1, replicas = 0,
        refreshInterval = "-1")
public class Conference {

    @Id
    private String id;

    private String name;

    public Conference(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
