package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/get")
  public List<Book> getBooks(){
    return bookService.getAllBooks();
  }
  @GetMapping("/get/{id}")
  public Optional<Book> getBookById(@PathVariable("id") Integer id){
    return bookService.getBookById(id);
  }

  @PostMapping("/post")
  public Optional<Book> addBook(@RequestBody Book book){
    return bookService.addBook(book);
  }

  @DeleteMapping("/delete/{id}")
  public Optional<Book> deleteBookById(@PathVariable("id") Integer id){
   return bookService.deleteBookById(id);
  }

  @PostMapping("/update/{id}")
  public Optional<Book> updateBookById(@PathVariable("id")Integer id, @RequestBody Book book){
    return bookService.updateBookById(id,book);
  }

}
