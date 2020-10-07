package com.tolo.bookstore.repository;

import com.tolo.bookstore.entiti.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book , Long> {    //<map with book, map with variable long ID>

    @Query(value = "select * from book",nativeQuery = true)
    List<Book> getAllBook();

    @Query(value = "select * from book where book_id = ?1", nativeQuery = true)
    Book testBookId(long id);

    @Query(value = "select * from book where book_name = ?1", nativeQuery = true)
    Book testBookName(String name);

    @Query(value = "select * from book where book_id like %?1% or book_name like %?1%", nativeQuery = true)
    Book testKey(String key);

}
