package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> datoOriginal = new ArrayList<>();
        datoOriginal.add(0);
        datoOriginal.add(1);
        datoOriginal.add(2);
        datoOriginal.add(3);
        datoOriginal.add(4);
        datoOriginal.add(5);
        datoOriginal.add(6);
        datoOriginal.add(7);
        datoOriginal.add(8);
        datoOriginal.add(9);

        int cantidad = tamanio(datoOriginal);

        List<Integer> datoModificado = new ArrayList<>();


        for(int i = 0, j = cantidad - 1; i < cantidad; i++, j--){
            datoModificado.add(i,datoOriginal.get(j));

        }



        for(int x = cantidad ; x <= 0; x--){
            datoModificado.add(cantidad-x, datoOriginal.get(x));

        }

        System.out.println("datos modificados");

        for (Integer d : datoModificado) {
            System.out.println(d);
        }


    }

    public static int tamanio(List<Integer> dato){
        return dato.size();
    }
}
