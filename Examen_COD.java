package examen_cod;

public class Examen_COD {

    public static void main(String[] args) {
        
        // Crear una instancia de GenNumRand
        GenNumRand genNumRandIns = new GenNumRand();

        // Llamar al método GenNum de GenNumRand
        genNumRandIns.GenNum();
 
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println("El juego ha finalizado");
                
            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    System.out.println("2 intentos usados, siguiente ronda");
                    }
                }
            }
        }
    }
}



