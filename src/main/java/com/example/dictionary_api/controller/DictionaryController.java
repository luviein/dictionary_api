package com.example.dictionary_api.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dictionary_api.service.DictionaryService;

@RestController
@RequestMapping(path="/api/search")
public class DictionaryController {

    @Autowired
    private DictionaryService svc;
    
    @GetMapping
    public ResponseEntity<List<String>> getDict(@RequestParam(required = true) String q) throws IOException {
        return ResponseEntity.ok(svc.getDict(q));
    }
}
