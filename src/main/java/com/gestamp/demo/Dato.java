package com.gestamp.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Dato {
    @Id
    @GeneratedValue
    private Long id;

    private String cadena;

}
