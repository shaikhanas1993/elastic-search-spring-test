package com.example.oppo;


import com.example.oppo.Entity.Conference;
import com.example.oppo.Repository.ConferenceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ElasticConnector implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ElasticConnector.class);

    @Autowired
    private ConferenceRepository repository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("hello ----------------------");
        Conference conference = new Conference();
        conference.setName("test1");
        Conference result = repository.save(conference);
        result/lt
    }
}
