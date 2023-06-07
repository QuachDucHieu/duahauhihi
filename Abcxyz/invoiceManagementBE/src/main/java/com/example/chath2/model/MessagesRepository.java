package com.example.chath2.model;

import com.example.chath2.bo.MessagesBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessagesRepository extends JpaRepository<MessagesBO, Long> {
    List<MessagesBO> findAll();
}
