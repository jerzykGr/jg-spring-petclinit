package com.petclinic.jgspringpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity {

    private String firstname;
    private String lastname;

}
