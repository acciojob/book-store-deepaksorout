package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public BookRepository() {
    }

    Map<Integer,Book>map=new HashMap<>();
    public Book save(Book book){
        map.put(book.getId(),book);
        return null;
    }

    public Book findBookById(int id){
        if(map.containsKey(id)){
            return map.get(id);
        }
        return null;
    }

    public List<Book> findAll(){
        List<Book> list=new ArrayList<>();
        for(Book book:map.values()){
            list.add(book);
        }
        return list;
    }

    public void deleteBookById(int id){
        if(map.containsKey(id)){
            map.remove(id);
        }
        return;
    }

    public void deleteAll(){
        map.clear();
        return;
    }

    public List<Book> findBooksByAuthor(String author){
        List<Book> list=new ArrayList<>();
        for(Book book:map.values()){
            if(book.getAuthor().equals(author)){
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> findBooksByGenre(String genre){
        List<Book> list=new ArrayList<>();
        for(Book book:map.values()){
            if(book.getGenre().equals(genre)){
                list.add(book);
            }
        }
        return list;
    }
}
