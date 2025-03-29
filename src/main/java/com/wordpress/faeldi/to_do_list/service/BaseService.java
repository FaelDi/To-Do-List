package com.wordpress.faeldi.to_do_list.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();

    T findById(Long id);

    T create(T obj);

    T edit(Long id, T obj);

    void delete(Long id);

}