import java.util.Date;

public class OrdersMain {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder1 = new PurchaseOrder("Compras componentes pc");
        purchaseOrder1.setClient(new Client("Jacobo", "Garces"));
        purchaseOrder1.setDate(new Date());

        purchaseOrder1.addProduct(new Product("Western Digital", "Unidad SSD 480GB", 54890));
        purchaseOrder1.addProduct(new Product("MSI", "Monitor Optix G271", 363940));
        purchaseOrder1.addProduct(new Product("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        purchaseOrder1.addProduct(new Product("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        PurchaseOrder purchaseOrder2 = new PurchaseOrder("Compras Electrodomésticos");
        purchaseOrder2.setClient(new Client("Mariana", "Usuga"));
        purchaseOrder2.setDate(new Date());
        purchaseOrder2.addProduct(new Product("Fensa", "Cocina", 239990));
        purchaseOrder2.addProduct(new Product("Samsung", "Refrigerador", 429990));
        purchaseOrder2.addProduct(new Product("Midea", "Lavadora", 149990));
        purchaseOrder2.addProduct(new Product("Aspiradora", "IRobot", 199990));

        PurchaseOrder[] purchaseOrders = {purchaseOrder1, purchaseOrder2};

        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            System.out.println(purchaseOrder.toString());

            int i = 1;
            for (Product product : purchaseOrder.getProducts()) {
                System.out.println("Producto " + i + ": " + product.getNameProduct() + " | " + product.getManufacturer() + " | precio $" + product.getPrice());
                i++;
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
