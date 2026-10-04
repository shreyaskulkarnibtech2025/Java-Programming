import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Program 2: Connect to database and display product details
 *            (Product ID, Product Name, Quantity, Price) using SELECT query.
 */
public class ProductDetails {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       PRODUCT DETAILS FROM DATABASE    ");
        System.out.println("========================================\n");

        String query = "SELECT product_id, product_name, quantity, price FROM products";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connected to database successfully!");
            System.out.println();

            // Table header
            System.out.println("+----+------------------+----------+------------+");
            System.out.println("| ID | Product Name     | Quantity | Price      |");
            System.out.println("+----+------------------+----------+------------+");

            int count = 0;
            double totalValue = 0;

            while (rs.next()) {
                int    productId   = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                int    quantity    = rs.getInt("quantity");
                double price      = rs.getDouble("price");

                System.out.printf("| %-2d | %-16s | %-8d | %10.2f |%n",
                        productId, productName, quantity, price);

                totalValue += quantity * price;
                count++;
            }

            System.out.println("+----+------------------+----------+------------+");
            System.out.println("\nTotal products: " + count);
            System.out.printf("Total inventory value: %.2f%n", totalValue);

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
