package com.csg.libraryspring.repository;

import com.csg.libraryspring.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {

  Optional<Librarian> findByName(@Param("name") String name);
}
