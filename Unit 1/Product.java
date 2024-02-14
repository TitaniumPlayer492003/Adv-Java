import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    int id; String name; double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // public double getPrice() {return price;}
    
    public static void main(String[] avi){
        List<Product> l1 = new ArrayList<>();
        l1.add(new Product(1,"Soap",20.00));
        l1.add(new Product(2, "Shampoo",180.00));
        l1.add(new Product(3,"Semolina", 65)); 
        l1.add(new Product(4,"Sewage Pipe", 400)); 
        

    
        Map<Object,List<Product>> map = l1.stream().collect(Collectors.groupingBy(n->n.price<200));
        System.out.println(map);
    }

    @Override
    public String toString() {
        return "id= " + id + ", name=" + name + ", price=" + price + "]";
    }
}
