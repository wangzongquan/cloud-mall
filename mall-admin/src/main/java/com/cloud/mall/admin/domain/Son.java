package com.cloud.mall.admin.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Son {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "P_ID",foreignKey = @ForeignKey(name = "PEOPLE_SON_FOREIGNKEY"))
    private People people;

    private String name;

    @Override
    public String toString() {
        return "Son{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
