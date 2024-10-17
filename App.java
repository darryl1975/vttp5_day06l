
// compile (in the project root folder)
// javac -d bin --source-path . ./*.java
// javac -d bin --source-path . ./*.java day06/*.java

// run
// java -cp bin App

// package to jar

// run the jar

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import day06.MyImplementation;
import day06.Product;

public class App {

    public static void main(String[] args) {

        // Thread th = new Thread(new Runnable() {
        // public void run() {
        // for(int i = 0; i < 10; i++) {
        // System.out.println(Thread.currentThread().getName() + " -> " + i);
        // }
        // }
        // });
        // th.start();

        // MyImplementation my1 = new MyImplementation();
        // MyImplementation my2 = new MyImplementation(); MyImplementation my3 = new
        // MyImplementation(); MyImplementation my4 = new MyImplementation();
        // MyImplementation my5 = new MyImplementation();

        // execute the tasks using a single thread
        // ExecutorService es = Executors.newSingleThreadExecutor();
        // es.execute(my1);
        // es.execute(my2);
        // es.shutdown();

        // execute the tasks using fixed thread pool
        // ExecutorService es1 = Executors.newFixedThreadPool(5);
        // es1.execute(my1);
        // es1.execute(my2);
        // es1.execute(my3);
        // es1.execute(my4);
        // es1.execute(my5);
        // es1.shutdown();

        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "Apple iPad", "Apple tablet", "computer"));
        products.add(new Product(2L, "Apple MacBook Pro", "Apple laptop", "computer"));
        products.add(new Product(3L, "Logitec Mouse", "Mouse", "computer"));
        products.add(new Product(4L, "32 inch monitor", "Samsung monitor", "computer"));
        products.add(new Product(5L, "Huawei 5", "Huawei phone", "mobile"));
        products.add(new Product(6L, "Oppo 7 Pro", "Oppo phone", "mobile"));
        products.add(new Product(7L, "Galaxy 24", "Samsung phone", "mobile"));
        products.add(new Product(8L, "iphone 15", "Apple phone", "mobile"));

        products.forEach(prod -> {
            System.out.println(prod);
        });

        // only retrieve products with category 'mobile'
        // using stream and lambda functions
        List<Product> filteredProducts = new ArrayList<>();
        filteredProducts = products
                .stream()
                .filter(p -> p.getCategory().equals("mobile"))
                .collect(Collectors.toList());

        filteredProducts.forEach(Product::print);


        
    }
}