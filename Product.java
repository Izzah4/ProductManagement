public class Product{
    int ProductID;
    String name;
    String Category;
    int price;
    int quantity;

    public Product(int ProductID, String name, String Category, int price, int quantity ) {
        this.ProductID = ProductID;
        this.name = name;
        this.Category = Category;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayStudent() {
        System.out.println("ProductID : " + ProductID);
        System.out.println("name: " + name);
        System.out.println("Category: " + Category);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
    }
}

