package org.example;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        Persona p1 = new Persona();
        p1.nombre = msg.solicitarDatos("Escribe tu nombre: ");
        p1.apellidos = msg.solicitarDatos("Escribe tus apellidos: ");

        msg.saludar(p1);
    }
}
