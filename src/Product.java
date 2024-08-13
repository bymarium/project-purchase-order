public class Product {
    private String manufacturer;
    private String nameProduct;
    private int price;

    public Product(String manufacturer, String nameProduct, int price) {
        this.manufacturer = manufacturer;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }
}
