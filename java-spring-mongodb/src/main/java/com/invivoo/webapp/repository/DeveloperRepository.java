package com.invivoo.webapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.invivoo.webapp.model.Developer;

@RepositoryRestResource
public interface DeveloperRepository extends MongoRepository<Developer, String> {

	public List<Developer> findByProjectName(@Param("projectName") int projectName);

	public List<Developer> findByAge(@Param("age") int age);

}
