import java.util.Arrays;
import java.util.Date;

public class PurchaseOrder {
    private Integer identifier;
    private String description;
    private Date date;
    private Client client;
    private Product[] products;

    private static int lastId;
    private int productIndex;

    public PurchaseOrder(String description) {
        this.description = description;
        this.identifier = lastId++;
        this.products = new Product[4];
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct (Product product) {
        if (productIndex < this.products.length) {
            this.products[productIndex++] = product;
        }
    }

    public int getGrandTotal () {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Identificacion: " + this.getIdentifier() +
                "\nCliente: " + this.getClient() +
                "\nDescripcion: " + this.getDescription() +
                "\nFecha: " + this.getDate() +
                "\nTotal: " + this.getGrandTotal() + "\n";
    }
}
