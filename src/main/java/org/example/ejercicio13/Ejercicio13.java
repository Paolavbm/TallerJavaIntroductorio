package org.example.ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {
    public static void main(String[] args) {
        DateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fechaAc = new Date();
        System.out.println(formato.format(fechaAc));
    }
}
