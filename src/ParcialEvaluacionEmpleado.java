import java.util.Scanner;

public class ParcialEvaluacionEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el documento: ");
        String documento = entrada.nextLine();

        System.out.print("Ingrese el puntaje de desempeño (0 a 100): ");
        int puntaje = entrada.nextInt();

        // Validar rango
        if (puntaje < 0 || puntaje > 100) {
            System.out.println("\n❌ Error: El puntaje ingresado es inválido.");
        } else {
            String clasificacion;

            // Clasificación según puntaje
            if (puntaje <= 59) {
                clasificacion = "Desempeño insuficiente";
            } else if (puntaje <= 74) {
                clasificacion = "Desempeño aceptable";
            } else if (puntaje <= 89) {
                clasificacion = "Buen desempeño";
            } else {
                clasificacion = "Desempeño sobresaliente";
            }

            // Mostrar resultados organizados
            System.out.println("\n===== RESULTADO DE EVALUACIÓN =====");
            System.out.println("Nombre: " + nombre);
            System.out.println("Documento: " + documento);
            System.out.println("Puntaje: " + puntaje);
            System.out.println("Clasificación: " + clasificacion);
        }

        entrada.close();
    }
}