package com.tolo.bookstore.entiti;


import javax.persistence.*;
import java.util.List;

@Entity(name = "book")
public class Book {



    //  khóa chính
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long book_ID;

    @Column
    private String book_name;

    @Column
    private int book_release;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public long getBook_ID() {
        return book_ID;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getBook_release() {
        return book_release;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
