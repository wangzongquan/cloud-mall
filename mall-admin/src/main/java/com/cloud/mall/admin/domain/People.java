package com.cloud.mall.admin.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class People {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String sex;

    @OneToMany(mappedBy = "people")
    private List<Son> sons;
}
