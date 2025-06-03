package EduardoGalvez_20230315;

public class Producto {
    private String id;
    private int stock;

    public Producto(String id, int stock) {
        this.id = id;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
