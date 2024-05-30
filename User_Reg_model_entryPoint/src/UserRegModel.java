import java.lang.reflect.Array;
import java.util.*;


class User{
    String username;
    String firstname;
    String lastname;
    String dob;
    User(String username, String firstname , String lastname, String dob){
        this.username = username;
        this.firstname =firstname;
        this.lastname = lastname;
        this.dob= dob;
    }
}

public class UserRegModel {
    static final List<User> usrnam = new ArrayList<>();
    
    public static void AddUser(String username, String firstname , String lastname, String dob){
        User newUser = new User(username,firstname,lastname,dob);
        usrnam.add(newUser);
    }
    public static void RetrieveAllUsers(){
        for(User x : usrnam){
            
            System.out.println("System has registered the following users");
            System.out.println(" User "+ x.username+" has names "+x.firstname+" "+ x.lastname+" and has an age of "+ x.dob );
        }
    }

    public static void returnSingleUser(String uname){
        for(User x : usrnam){
        if(x.username.equals(uname)){
            System.out.println("\n User "+ uname+ " has deatails : full name "+ x.firstname+" "+x.lastname+ " and date of birth"+ x.dob);
        }
        else{
            System.out.println("The user is not in the system");
        }
    }
    }
    public static void deleteUser(String uname){
        for(User x : usrnam){
        if(x.username.equals(uname)){
            System.out.println("\n "+ x.firstname+" "+x.lastname+ " has been deleted");
            usrnam.remove(x);
        }
        else{
            System.out.println("The user is not in the system");
        }
    }
    }
    public static void deleteAllUsers(){
        if(!usrnam.isEmpty()){
            usrnam.clear();
        }
        else{
            System.out.println("The database is empty");
        }
    }
    
    public static void main(String[] args) {
        
        
    }

}
