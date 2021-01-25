package com.cloud.mall.baseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<T>{
    
    @Autowired
    private JpaRepository jpaRepository;
    
    public T save(T t) {
        return (T) jpaRepository.save(t);
    }

    
    public Optional findById(Object id) {
        return jpaRepository.findById(id);
    }

    
    public boolean existsById(Object id) {
        return jpaRepository.existsById(id);
    }

    public List<T> findAll() {
        return jpaRepository.findAll();
    }

    public Page findAll(Pageable pageable) {
        return jpaRepository.findAll(pageable);
    }


    public long count() {
        return jpaRepository.count();
    }

    
    public void deleteById(Object id) {
        jpaRepository.deleteById(id);
    }

    
    public void delete(T t) {
        jpaRepository.delete(t);
    }

    public T getOne(Object id) {
        return (T) jpaRepository.getOne(id);
    }
    public JpaRepository getDao(){
        return jpaRepository;
    }
}
