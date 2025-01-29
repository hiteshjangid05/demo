package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;

  public Optional<Book> addBook(Book book){
    bookRepository.save(book);
    return bookRepository.findById(book.getId());
  }
  public List<Book> getAllBooks(){
    return (List<Book>) bookRepository.findAll();
  }
  public Optional<Book> getBookById(Integer id){
    return bookRepository.findById(id);
  }
  public Optional<Book> deleteBookById(Integer id){
    if(bookRepository.findById(id).isPresent()) {
      Optional<Book> bookToBeDeleted = bookRepository.findById(id);
      bookRepository.deleteById(id);
      return bookToBeDeleted;
    }
    return Optional.empty();
  }

  public Optional<Book> updateBookById(Integer id, Book book){
    if(bookRepository.existsById(id)){
      bookRepository.deleteById(id);
      bookRepository.save(book);
    }
    return bookRepository.findById(id);
  }
}
