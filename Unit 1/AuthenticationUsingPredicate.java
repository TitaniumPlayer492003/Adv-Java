import java.util.*;
import java.util.function.Predicate;
public class AuthenticationUsingPredicate {
    String username, password;

    public AuthenticationUsingPredicate(String username, String password){
        this.username=username;
        this.password=password;
    }

    public static void main(String[] avi){
        Scanner input = new Scanner(System.in); System.out.print("Enter Username and Password: ");
        String username = input.next();
        String password = input.next();
        AuthenticationUsingPredicate ob = new AuthenticationUsingPredicate(username, password);
    
        Predicate<AuthenticationUsingPredicate> p = u -> u.username.equals("Avijeet") && u.password.equals("pass");
        
        if (p.test(ob)){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Invali Username or Password");
        }
        input.close();
    }
}
