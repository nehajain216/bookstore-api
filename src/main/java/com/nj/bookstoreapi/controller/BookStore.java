package com.nj.bookstoreapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStore {

    @GetMapping("/bookstore")
    public String bookStore()
    {
        return "Welcome To BookStore";
    }
}
