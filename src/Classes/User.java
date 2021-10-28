package Classes;

public class User extends Person{
    private String _phoneNumber;
    private String _email;

    public User(String firstName, String lastName, String id){
        super(firstName, lastName, id);
    }

    public User(String firstName, String lastName, String phoneNumber, String email, String id){
        super(firstName, lastName, id);
        _phoneNumber = phoneNumber;
        _email = email;
    }
}
