package examen_cod;

import java.util.Random;

public class GenNumRand {

    /**
     *
     * @param args
     */
    public static void GenNum(String[] args) {
        // Crear un objeto Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 10 (ambos inclusive)
        int minimo = 1;
        int maximo = 10;
        int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
        
        System.out.println("Número aleatorio entre " + minimo + " y " + maximo + ": " + numeroAleatorio);
    }
}

