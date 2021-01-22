package com.cloud.mall.admin.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class People {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String sex;
}
