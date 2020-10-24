package com.tutorial.springboot.api.repository;

import com.tutorial.springboot.api.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test.Info, Long> {
}
