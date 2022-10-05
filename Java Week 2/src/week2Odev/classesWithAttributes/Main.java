package week2Odev.classesWithAttributes;


public class Main {
    public static void main(String[] args) {

      Product product = new Product();
      product.setName("dsadsa");
      product.setId(1);
      product.setDescription("Asus");
      product.setPrice(500);
      product.setStockAmount(5);

      ProductManager productManager = new ProductManager();
      productManager.Add(product);


    }
}
