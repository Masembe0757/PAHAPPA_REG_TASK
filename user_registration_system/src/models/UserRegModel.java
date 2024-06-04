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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserRegModel other = (UserRegModel) obj;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null)
                return false;
        } else if (!dateOfBirth.equals(other.dateOfBirth))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserRegModel [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
                + ", dateOfBirth=" + dateOfBirth + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        return result;
    }

    
}
