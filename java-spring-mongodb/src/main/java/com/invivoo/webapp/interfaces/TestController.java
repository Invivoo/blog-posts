package com.invivoo.webapp.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.invivoo.webapp.domain.Developer;
import com.invivoo.webapp.domain.Project;

@RestController
public class TestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public Developer test() {

        final Developer developer = new Developer();
        developer.setFirstName("firstname_toto");
        developer.setLastName("lastname_toto");
        developer.setAge(26);

        final Project project = new Project();
        project.setName("project_toto");
        project.setCreationDate("2020-03-20");

        developer.setProject(project);

        return developer;

    }

}
