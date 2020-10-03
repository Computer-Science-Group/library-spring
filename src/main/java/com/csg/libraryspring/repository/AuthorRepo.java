package com.csg.libraryspring.repository;

import com.csg.libraryspring.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
