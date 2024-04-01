package com.esha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esha.model.Images;

public interface UploadRepo extends JpaRepository<Images, Integer> {

}
