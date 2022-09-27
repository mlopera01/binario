package com.example.binario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.binario.service.BinarioService;

@RestController
@RequestMapping( "/binario" )
public class BinarioController {
    private final BinarioService binarioService;

    public BinarioController(@Autowired BinarioService x) {
        this.binarioService = x;
    }

    @PostMapping
    public ResponseEntity<BinarioRequest> solucion(@RequestBody BinarioRequest binarioRequest) {
        return ResponseEntity.ok(binarioService.conversion(binarioRequest));
    }
}
