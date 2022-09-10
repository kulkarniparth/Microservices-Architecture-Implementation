package com.example.person.Service;

import com.example.person.Entity.Person;
import com.example.person.Repository.PersonRepository;
import com.example.person.VO.Department;
import com.example.person.VO.RestTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    RestTemplate restTemplate;

    public void savePerson(Person person) {
        log.info("inside savePerson() method of PersonService");
        personRepository.save(person);
    }

    public RestTemplateVO findUserWithDepartment(Long personId) {
        log.info("inside findUserWithDepartment() method of PersonService");

        Person person = personRepository.findByPersonId(personId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+person.getDepartmentId(),Department.class);

        RestTemplateVO restTemplateVO = new RestTemplateVO();
        restTemplateVO.setDepartment(department);
        restTemplateVO.setPerson(person);
        return restTemplateVO;
    }
}
