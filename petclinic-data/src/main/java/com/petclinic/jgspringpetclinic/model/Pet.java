package com.petclinic.jgspringpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet {

    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

}