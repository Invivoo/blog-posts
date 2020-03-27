package com.invivoo.webapp.domain;

import java.util.List;

public interface DeveloperService {

    List<Developer> findByAgeAndProjectName(int age, String projectName);

}
