package id.etanee.training.simplebooklibrary.service;

import id.etanee.training.simplebooklibrary.entity.Book;
import id.etanee.training.simplebooklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public Book create(Book book){
        book.setId(UUID.randomUUID().toString());
        return bookRepository.save(book);
    }

    public Book update(Book book){
        Book db = bookRepository.findOne(book.getId());
        db.setTitle(book.getTitle());
        db.setAuthor(book.getAuthor());
        db.setHeight(book.getHeight());
        db.setIsbn(book.getIsbn());
        db.setPageNumber(book.getPageNumber());
        db.setPublishedDate(book.getPublishedDate());
        db.setWidth(book.getWidth());
        return bookRepository.save(db);
    }

    public Page<Book> getAll(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

    public Book getById(String id){
        return bookRepository.findOne(id);
    }

    public boolean delete(String id){
        bookRepository.delete(id);
        return true;
    }

}
