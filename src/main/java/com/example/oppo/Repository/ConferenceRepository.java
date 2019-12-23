package com.example.oppo.Repository;

import com.example.oppo.Entity.Conference;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ConferenceRepository extends ElasticsearchRepository<Conference, String> {}
