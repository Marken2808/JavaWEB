package com.tolo.bookstore.implement;

import com.tolo.bookstore.entiti.Book;
import com.tolo.bookstore.repository.BookRepository;
import com.tolo.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplement implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.getAllBook();
    }

    @Override
    public Book getBookById(long id) {
        return bookRepository.testBookId(id);
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.testBookName(name);
    }

    @Override
    public Book getBookByKey(String key) {
        return bookRepository.testKey(key);
    }

    @Override
    public List<Book> createBooks(List<Book> books) {
//        try{                              //for string
//            bookRepository.save(book);
//            return "Added success";
//        }
//        catch(Exception e){
//            return "Added failed";
//        }
        return bookRepository.saveAll(books);

    }

    @Override
    public Book editBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(long[] ids) {
        //for(long id: ids)
        //repo.deleteById(id)
        for(int id=0;id<ids.length;id++) {
            bookRepository.deleteById(ids[id]);
        }
    }

}
