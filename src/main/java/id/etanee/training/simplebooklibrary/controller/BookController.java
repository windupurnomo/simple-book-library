package id.etanee.training.simplebooklibrary.controller;

import id.etanee.training.simplebooklibrary.entity.Book;
import id.etanee.training.simplebooklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @PutMapping
    public Book update(@RequestBody Book book){
        return bookService.update(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable String id){
        return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String bookId){
        return bookService.delete(bookId);
    }

}
