package com.csg.libraryspring.repository;

import com.csg.libraryspring.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
