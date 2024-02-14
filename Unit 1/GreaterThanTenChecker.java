import java.util.function.Predicate;
import java.util.Scanner;

public class GreaterThanTenChecker{
    public static void main(String[] args) {
        int no;
        Scanner input = new Scanner(System.in);System.out.print("Enter a number: ");no= input.nextInt();
        Predicate<Integer> isGreaterThanTen = n -> n > 10;
        if(isGreaterThanTen.test(no)){
            System.out.println(no+" is greater than 10");
        }
        else{
            System.out.println(no + " is not greater than 10");
        }
    input.close();
    }

}