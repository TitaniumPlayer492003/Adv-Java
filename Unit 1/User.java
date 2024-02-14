public class User{
    private final String Fname;
    private final String Lname;
    private final int Age;
    private final long ph;
    private final String Address;

    private User(UserBuilder builder){
        this.Fname=builder.Fname;
        this.Lname=builder.Lname;
        this.Age=builder.Age;
        this.ph=builder.ph;
        this.Address=builder.Address;
    }
    public static void main(String[] avi){
        User User1 = new User.UserBuilder("Shivani", "Sharma").Age(30).ph(123467).Address("1234").build();
        System.out.println(User1);
        
        User User2 = new User.UserBuilder("Anil", "Sharma").Age(40).ph(98765).build();
        System.out.println(User2);    
        }
    
    @Override
    public String toString()
    {
        return "User [Fname=" + Fname + ", Lname=" + Lname + ", Age=" + Age + ", ph=" + ph + ", Address=" + Address
                + "]";
    }
    
    
    
    public static class UserBuilder{
        private String Fname;
        private String Lname;
        private int Age;
        private long ph;
        private String Address;
    
            public UserBuilder(String Fname, String Lname){
                this.Fname=Fname;
                this.Lname=Lname;
            }
            public UserBuilder Fname (String Fname){
                this.Fname=Fname;
                return this;
            }

            public UserBuilder Lname (String Lname){
                this.Lname=Lname;
                return this;
            }
            public UserBuilder Age(int Age){
                this.Age=Age;
                return this;
            }
            public UserBuilder ph (long ph){
                this.ph=ph;
                return this;
            }    
            public UserBuilder Address (String Address){
                this.Address=Address;
                return this;
            }
    
            public User build(){
                User User = new User(this);
                return User;
            }
    
    }



}