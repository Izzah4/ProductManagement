import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> Products = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View All Product");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Search Product by Category");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter  ProductID: ");
                    int ProductID = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String Category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();


                    Product Product = new Product(ProductID, name, Category, price, quantity);

                    Products.add(Product);

                    System.out.println("Product added successfully!");

                    break;

                case 2:

                    if (Products.isEmpty()) {
                        System.out.println("No Products found.");
                    } else {
                        System.out.println("\nProduct List:");
                        for (Product s : Products) {
                            s.displayStudent();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter ProductID to search: ");

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Product s : Products) {
                        if (s.ProductID == searchId) {
                            System.out.println("\nProduct Found:");
                            s.displayStudent();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Product Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
