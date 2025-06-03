package EduardoGalvez_20230315;

import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionStock gestionStock = new GestionStock();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gestión de Stock");
            System.out.println("1. Actualizar stock de un producto");
            System.out.println("2. Listar productos con stock bajo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese la nueva cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    gestionStock.actualizarStock(id, cantidad);
                    break;
                case 2:
                    List<Producto> productosBajoStock = gestionStock.alertarStockBajo();
                    Mensajes.mostrarProductosBajoStock(productosBajoStock);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}