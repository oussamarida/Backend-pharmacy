package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(nullable = false, length = 45)
    private String name;
 
    public Role(){ 
    	
    }
     
    public Role(String name) {
        this.name = name;
    }
     
    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public Role(Integer id) {
        this.id = id;
    }
     
 
  
}