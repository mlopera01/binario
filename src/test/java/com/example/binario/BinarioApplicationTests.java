package com.example.binario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.binario.controller.BinarioRequest;
import com.example.binario.service.BinarioService;

@SpringBootTest

class BinarioApplicationTests {
	@Autowired
	private BinarioService binarioService;

	@Test
	void contextLoads() {
	}

	@Test
	void testBinarioServiceCorrect() {
		BinarioRequest binarioRequest = new BinarioRequest(4);
		BinarioRequest respuesta = binarioService.conversion(binarioRequest);
		assertEquals(100, respuesta.getNumero());
	}

	@Test
	void testBinarioServiceIncorrect() {
		BinarioRequest binarioRequest = new BinarioRequest(4);
		BinarioRequest respuesta = binarioService.conversion(binarioRequest);
		assertNotEquals(10, respuesta.getNumero());
	}
}
