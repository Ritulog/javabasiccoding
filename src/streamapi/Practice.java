package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}

public class Practice {
    public static void main(String[] args) {
        List<Product> prodictList = new ArrayList<Product>();
        prodictList.add(new Product(1,"HP laptop", 200000f));
        prodictList.add(new Product(2,"Dell laptop", 250000f));
        prodictList.add(new Product(3,"Lenevo laptop", 300000f));
        prodictList.add(new Product(4,"apple laptop", 900000f));
        prodictList.add(new Product(5,"samsung laptop", 350000f));


        List<Float> productpricelist = new ArrayList<Float>();

        for(Product product : prodictList){
            if(product.price< 300000f){
                productpricelist.add(product.price);
            }
        }
        System.out.println("without stream"+productpricelist);
        List<Float> productpriceList = prodictList.stream().filter(product ->product.price<300000f).map(product -> product.price).collect(Collectors.toList());
        System.out.println("withstream"+productpriceList);


        prodictList.stream().filter(p->p.price <300000f).forEach(product -> System.out.println(product.name));

        float totalPrice2 = prodictList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
        System.out.println("ppppppppp"+totalPrice2);

        // Sum by using collectors method
        double totalPrice3 = prodictList.stream().collect(Collectors.summingDouble(product ->product.price));

        //find min & price product price
        Product product = prodictList.stream().min((x, y)->x.price > y.price ?1:1).get();
        System.out.println(product.price);

        //find max & price product price
        Product product1 = prodictList.stream().max((x, y)->x.price < y.price ?1:1).get();
        Product max = prodictList.stream()
                .max(Comparator.comparing(p -> p.price))
                .get();
        System.out.println(max);
        System.out.println("max price"+product1.price);

        //convert List into set

        Set<Float> productlist2 = prodictList.stream().filter(product2 -> product2.price <300000f).map(product2 -> product2.price).collect(Collectors.toSet());
        System.out.println("settttt"+productlist2);

        //Method Reference in stream
        List<Float> productPriceList11 = prodictList.stream().filter(p->p.price >300000f).map(Product ::getPrice).collect(Collectors.toList());
        System.out.println(productPriceList11);


        //using collection
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("charlie");
        for(String name:names){
            System.out.println(name.toUpperCase());
        }

        //using stream
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
