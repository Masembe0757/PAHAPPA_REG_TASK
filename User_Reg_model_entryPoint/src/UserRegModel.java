import java.lang.reflect.Array;
import java.util.*;


class User{
    String username;
    String firstname;
    String lastname;
    Date dob;
    User(String username, String firstname , String lastname, Date dob){
        this.username = username;
        this.firstname =firstname;
        this.lastname = lastname;
        this.dob= dob;
    }
}

public class UserRegModel {
    static final List<User> usrnam = new ArrayList<>();
    
}
