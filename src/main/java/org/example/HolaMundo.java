package org.example;

public class HolaMundo {
    public static void main(String[] args) {
        // Comentario
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        msg.saludar(nombre);
    }
}
