import java.lang.reflect.Array;
import java.util.*;

//This class provides a constructor that provides attributes expected of a user 
class User{
    String username;
    String firstname;
    String lastname;
    Date dob;

//user constructor
    User(String username, String firstname , String lastname, Date dob){
        this.username = username;
        this.firstname =firstname;
        this.lastname = lastname;
        this.dob= dob;
    }
}

public class UserRegModel {

    //Array list to store users
    static final List<User> usrnam = new ArrayList<>();
    
    public static void AddUser(String username, String firstname , String lastname, Date dob){
        User newUser = new User(username,firstname,lastname,dob);
        usrnam.add(newUser);
    }
    //Method to retrieve all users by traversing through the users list
    public static void RetrieveAllUsers(){
        for(User x : usrnam){
            
            System.out.println("System has registered the following users");
            System.out.println(" User "+ x.username+" has names "+x.firstname+" "+ x.lastname+" and has an age of "+ x.dob );
        }
    }


    //Method to retrieves a single user by traversing through the users list for specific user name
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
    //Method to deletes a single user by traversing through the users list for specific user name
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
    //Method to delete all users by traversing through the users list
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
