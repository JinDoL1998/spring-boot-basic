package com.jihoon.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Example")
@Table(name="Example")
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="example_column1", nullable = false, unique = true)
    private int pk;
    private String exmapleColumn2;
    private boolean exampleColumn3;
}
