package com.csg.libraryspring.repository;

import com.csg.libraryspring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
