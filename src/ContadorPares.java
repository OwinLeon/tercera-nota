public class ContadorPares {
    public static void main(String[] args) {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Verificar si es par
                contador++;
            }
        }
        System.out.println("Cantidad de números pares entre 1 y 100: " + contador);
    }
}