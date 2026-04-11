import java.util.Scanner;

public class ParcialRegistroNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numeroEstudiantes = entrada.nextInt();

        // Crear arreglo
        double[] notas = new double[numeroEstudiantes];

        // Variables para cálculos
        double suma = 0;
        double mayor = 0;
        double menor = 5; // suponiendo escala de 0 a 5
        int aprobados = 0;
        int reprobados = 0;

        // Ingresar notas
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            // Sumar para promedio
            suma += notas[i];

            // Determinar mayor y menor
            if (i == 0) {
                mayor = notas[i];
                menor = notas[i];
            } else {
                if (notas[i] > mayor) {
                    mayor = notas[i];
                }
                if (notas[i] < menor) {
                    menor = notas[i];
                }
            }

            // Contar aprobados y reprobados
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Calcular promedio
        double promedio = suma / numeroEstudiantes;

        // Mostrar notas
        System.out.println("\n===== NOTAS INGRESADAS =====");
        for (int i = 0; i < numeroEstudiantes; i++) {
            String estado = notas[i] >= 3.0 ? "Aprobado" : "Reprobado";
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " - " + estado);
        }

        // Mostrar resumen
        System.out.println("\n===== RESUMEN DEL GRUPO =====");
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        entrada.close();
    }
}