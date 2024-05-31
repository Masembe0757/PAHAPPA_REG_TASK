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

    //This method sets users user name
    public void setUsername(String username){
        this.username = username;

    }
    //This method sets users first name
    public void setFirstName(String firstname){
        this.firstname = firstname;

    }
    //This method sets users last  name
    public void setLastName(String lastname){
        this.lastname = lastname;

    }
    //This method sets users date of birth
    public void setDob(Date dob){
        this.dob = dob;

    }



    //This method Gets the user name
    public String getUsername(){
        return username;
    }

    //This method gets users first name
    public String getFirstName(){
        return firstname;
    } 

    //This method gets users Last name
    public String getLastName(){
        return lastname;
    } 
    //This method sets users date of birth
    public Date getDob(){
        return dob;
    }
}

public class UserRegModel {

   
    
    public static void main(String[] args) {
        
        
    }

}
