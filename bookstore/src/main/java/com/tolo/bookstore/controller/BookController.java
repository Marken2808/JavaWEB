package com.tolo.bookstore.controller;

import com.tolo.bookstore.entiti.Book;
import com.tolo.bookstore.repository.BookRepository;
import com.tolo.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//
@RestController

//  set link after slash
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBook();

    }


    @GetMapping("/{id}")    //-cho pathVariable     /{id}
    public Book getId (@PathVariable long id)
    {
        return bookService.getBookById(id) ;
    }

    @GetMapping("/find")    //-cho RequestParam     /find?name={name}
    public Book getName (@RequestParam String name)
    {
        return bookService.getBookByName(name);
    }

    @GetMapping("/search")  //                      /search?key={id|name}
    public Book getKey (@RequestParam String key)
    {
        return bookService.getBookByKey(key);
    }

    @PostMapping("/create")
//    public String createBook (@RequestBody Book book){    //test string
//        return bookService.createBook(book);
//    }
    public List<Book> createBooks (@RequestBody List<Book> books){
        return bookService.createBooks(books);
    }

    @PutMapping("/edit")
    public Book editBook(@RequestBody Book book) {
        return bookService.editBook(book);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestBody long[] ids) {
            bookService.deleteBook(ids);
    }
}
