package EduardoGalvez_20230315;
import java.util.List;

public class Mensajes {
    public static void mostrarMensaje(String mensaje) {
        System.out.println("[INFO] " + mensaje);
    }

    public static void mostrarError(String mensaje) {
        System.out.println("[ERROR] " + mensaje);
    }

    public static void mostrarProductosBajoStock(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos con stock bajo.");
        } else {
            System.out.println("Productos con stock bajo (<10 unidades):");
            System.out.println("--------------------------------------");
            System.out.printf("%-10s %-10s%n", "ID", "Stock");
            for (Producto producto : productos) {
                System.out.printf("%-10s %-10d%n", producto.getId(), producto.getStock());
            }
        }
    }
}
