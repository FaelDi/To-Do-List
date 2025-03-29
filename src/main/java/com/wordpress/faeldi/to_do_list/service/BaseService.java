package com.wordpress.faeldi.to_do_list.service;

import java.util.List;

public interface BaseService<T,ValueType> {

    List<T> findAll();

    T findById(ValueType id);

    T create(T obj);

    T edit(ValueType id, T obj);

    void delete(ValueType id);

}