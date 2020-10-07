package com.tolo.bookstore.repository;

import com.tolo.bookstore.entiti.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
