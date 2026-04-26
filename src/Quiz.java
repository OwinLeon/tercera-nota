import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombres[] = new String[10];
        double m2024[] = new double[10];
        double m2025[] = new double[10];
        double m2026[] = new double[10];

        int cantidad = 0;
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado por dorsal");
            System.out.println("3. Mostrar listado por marca 2024");
            System.out.println("4. Salir");
            System.out.print("Digite opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                if (cantidad < 10) {

                    System.out.print("Nombre: ");
                    scanner.nextLine(); 
                    nombres[cantidad] = scanner.nextLine();

                    System.out.print("Marca 2024: ");
                    m2024[cantidad] = scanner.nextDouble();

                    System.out.print("Marca 2025: ");
                    m2025[cantidad] = scanner.nextDouble();

                    System.out.print("Marca 2026: ");
                    m2026[cantidad] = scanner.nextDouble();

                    cantidad++;

                } else {
                    System.out.println("No hay mas cupos");
                }
            }

            if (opcion == 2) {
                System.out.println("\nLISTADO POR DORSAL");

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Dorsal: " + (i + 1) +
                            " Nombre: " + nombres[i] +
                            " 2024: " + m2024[i] +
                            " 2025: " + m2025[i] +
                            " 2026: " + m2026[i]);
                }
            }

            if (opcion == 3) {
                System.out.println("\nLISTADO ORDENADO POR 2024");

                for (int i = 0; i < cantidad - 1; i++) {
                    for (int j = 0; j < cantidad - 1; j++) {

                        if (m2024[j] < m2024[j + 1]) {

                            double aux = m2024[j];
                            m2024[j] = m2024[j + 1];
                            m2024[j + 1] = aux;

                            String auxN = nombres[j];
                            nombres[j] = nombres[j + 1];
                            nombres[j + 1] = auxN;
                        }
                    }
                }

                for (int i = 0; i < cantidad; i++) {
                    System.out.println(nombres[i] + " - " + m2024[i]);
                }
            }

        } while (opcion != 4);

        scanner.close();
    }
}