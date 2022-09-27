package com.example.binario.service.impl;

import org.springframework.stereotype.Service;

import com.example.binario.controller.BinarioRequest;
import com.example.binario.service.BinarioService;

@Service
public class BinarioServiceImp implements BinarioService {

    @Override
    public BinarioRequest conversion(BinarioRequest numero) {

        Integer resultado;
        Integer modulo;
        Integer divisor = 2;
        String binario = "";

        resultado = numero.getNumero(); // para ir metiendo el modulo y poder devolver el resultado

        while (resultado > 1) {
            modulo = resultado % divisor;
            resultado = resultado / divisor;
            binario += String.valueOf(modulo);
        }
        // aca llevo el ultimo valor del resultado de la división
        binario += String.valueOf(resultado);
        // Para reversar el binario obtenido
         StringBuilder builder=new StringBuilder(binario);
         String binarioInvertido=builder.reverse().toString();
        return new BinarioRequest(Integer.valueOf(binarioInvertido));
    }
}
