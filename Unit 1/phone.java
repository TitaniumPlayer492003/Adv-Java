import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.*;

public class phone {
    public static void main(String [] avi){
        double arr[] = {1.1,2.2,3.3,4.4,5.5};

        DoubleStream intStream = Arrays.stream(arr);

        intStream.forEach(str-> System.out.print( str+ " "));

        Stream<double[]> st= Stream.of(arr);
        st.forEach(str -> System.out.println(str + " "));
    
        
    }

    @Override
    public String toString() {
        return str;
    }
}
