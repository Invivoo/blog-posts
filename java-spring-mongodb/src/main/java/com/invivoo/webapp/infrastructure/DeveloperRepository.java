package com.invivoo.webapp.infrastructure;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.invivoo.webapp.domain.Developer;

public interface DeveloperRepository extends MongoRepository<Developer, String> {

    List<Developer> findByProjectName(@Param("projectName") String projectName);

    List<Developer> findByAge(@Param("age") int age);

}
