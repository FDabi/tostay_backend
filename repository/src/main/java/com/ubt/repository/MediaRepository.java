package com.ubt.repository;

import com.ubt.model.Apartment;
import com.ubt.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Integer> {

    Media findById(int id);

}
