package com.wordpress.faeldi.to_do_list.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();

    T findById(String id);

    T create(T obj);

    T edit(String id, T obj);

    void delete(String id);

}