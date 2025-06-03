package EduardoGalvez_20230315;
import java.util.ArrayList;
import java.util.List;

public class GestionStock {
    private List<Producto> productos;

    public GestionStock() {
        this.productos = new ArrayList<>();

        productos.add(new Producto("5698", 15));
        productos.add(new Producto("6589", 5));
        productos.add(new Producto("8659", 20));
        productos.add(new Producto("9658", 8));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.setStock(nuevaCantidad);
                Mensajes.mostrarMensaje("Stock actualizado correctamente para el producto " + id);
                return;
            }
        }
        Mensajes.mostrarError("Producto no registrado: " + id);
    }

    public List<Producto> alertarStockBajo() {
        List<Producto> productosBajoStock = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getStock() < 10) {
                productosBajoStock.add(producto);
            }
        }
        return productosBajoStock;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
