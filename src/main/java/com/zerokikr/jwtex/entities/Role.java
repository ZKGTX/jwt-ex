package com.zerokikr.jwtex.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "roles")
public class Role {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "name")
private String name;

    public Role(String name) {
        this.name = name;
    }
}
