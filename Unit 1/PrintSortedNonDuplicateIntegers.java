import java.util.*;
// import java.util.stream.Collector;
import java.util.stream.Stream;

public class PrintSortedNonDuplicateIntegers{

    
        public static void main(String[] avi){
            List <Integer> l1 = Arrays.asList(2,3,1,3,4,7,4,5,5);
            Stream <Integer> s1 = l1.stream().sorted().distinct();
            s1.forEach(System.out::println);
        } 
}