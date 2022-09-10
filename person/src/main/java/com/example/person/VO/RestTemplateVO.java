package com.example.person.VO;

import com.example.person.Entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {
    private Person person;
    private Department department;
}
