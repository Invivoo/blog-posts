package com.invivoo.webapp.domain.developer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeveloperRepository extends MongoRepository<Developer, String> {

    String PROJECT_NAME = "projectName";
    String AGE = "age";

    List<Developer> findByProjectName(@Param(PROJECT_NAME) String projectName);

    List<Developer> findByAge(@Param(AGE) int age);

    List<Developer> findByAgeAndProjectName(@Param(AGE) int age, @Param(PROJECT_NAME) String projectName);

}
