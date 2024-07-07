package com.mrlonis.example.model;

import java.util.List;

public interface BaseModel<T> {
    long getId();

    BaseModel<T> setId(long id);

    String getName();

    BaseModel<T> setName(String name);

    String getAuthor();

    BaseModel<T> setAuthor(String author);

    T getDate();

    BaseModel<T> setDate(T date);

    List<String> getTags();

    BaseModel<T> setTags(List<String> tags);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
