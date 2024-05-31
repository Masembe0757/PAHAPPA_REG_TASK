package models;
import java.lang.reflect.Array;
import java.util.*;

//This class provides a constructor that provides attributes expected of a user 

public class UserRegModel {

    private String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

//user constructor
    UserRegModel(String username, String firstname , String lastname, Date dob){
        this.userName = username;
        this.firstName =firstname;
        this.lastName = lastname;
        this.dateOfBirth = dob;
    }

    //This method sets users user name
    public void setUsername(String username){
        this.userName = username;

    }
    //This method sets users first name
    public void setFirstName(String firstname){
        this.firstName = firstname;

    }
    //This method sets users last  name
    public void setLastName(String lastname){
        this.lastName = lastname;

    }
    //This method sets users date of birth
    public void setDob(Date dob){
        this.dateOfBirth = dob;

    }



    //This method Gets the user name
    public String getUsername(){
        return userName;
    }

    //This method gets users first name
    public String getFirstName(){
        return firstName;
    } 

    //This method gets users Last name
    public String getLastName(){
        return lastName;
    } 
    //This method sets users date of birth
    public Date getdateOfBirth(){
        return dateOfBirth;
    }

    // Overriding equals method to compare objects
    @Override
    public boolean equals(Object o){
        if (o == this)
        return true;
        if (!(o instanceof UserRegModel))
            return false;
        UserRegModel other = (UserRegModel)o;

        boolean UserNameEquals = (this.userName == null && other.userName == null)
        || (this.userName != null && this.userName.equals(other.userName));
        boolean FirstNameEquals = (this.firstName == null && other.firstName == null)
        || (this.firstName != null && this.firstName.equals(other.firstName));
        boolean LastNameEquals = (this.lastName == null && other.lastName == null)
        || (this.lastName != null && this.lastName.equals(other.lastName));
        return this.dateOfBirth == other.dateOfBirth && UserNameEquals && LastNameEquals && FirstNameEquals;
    }
    //Null safety mitigation using ToString method overriding and same can be done for each atttribute

    @Override
    public String toString() {
        return "String : " + Optional.ofNullable(this.userName).orElse("Unknown") ;

        }
    @Override
    public final int hashCode() {
        int result = 17;
        if (userName != null) {
            result = 31 * result + userName.hashCode();
        }
        if (lastName != null) {
            result = 31 * result + lastName.hashCode();
        }
        if (firstName != null) {
            result = 31 * result + firstName.hashCode();
        }
        if (dateOfBirth != null) {
            result = 31 * result + dateOfBirth.hashCode();
        }
        return result;
    }
}
