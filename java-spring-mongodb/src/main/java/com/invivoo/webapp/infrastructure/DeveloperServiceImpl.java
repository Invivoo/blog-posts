package com.invivoo.webapp.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.invivoo.webapp.domain.Developer;
import com.invivoo.webapp.domain.DeveloperService;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public List<Developer> findByAgeAndProjectName(int age, String projectName) {

        List<Developer> developers = new ArrayList<>();

        Query searchQuery = new Query();
        searchQuery.addCriteria(Criteria.where("age").is(age).and("project.name").is(projectName));
        developers = mongoOperations.find(searchQuery, Developer.class);

        return developers;

    }

}
