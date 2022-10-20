package org.perscholas.capstonedb.model;

import javax.persistence.*;

@Entity
public class Teams {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column(unique = true)
    private String name;

    public Teams() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}


