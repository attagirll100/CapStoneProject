package org.perscholas.capstonedb.model;

import javax.persistence.*;

@Entity
public class Basketballplayers {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column(unique = true)
    private String name;

    public Basketballplayers() {}

}
