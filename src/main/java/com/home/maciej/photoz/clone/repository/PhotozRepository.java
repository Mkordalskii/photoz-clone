package com.home.maciej.photoz.clone.repository;

import com.home.maciej.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
    List<Photo> id(Integer id);
}
