package org.example;

import java.util.Scanner;

public class Mensaje {
    public String solicitarDatos(String mensaje){
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(Persona p1) {
        System.out.printf("Hola %s, bienvenido a Java \n", p1);
    }
}
