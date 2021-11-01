package Classes;

public class Employee extends Person{
    private String _phoneNumber;
    private String _email;

    public Employee(){
        super();
    }
    public Employee(String firstName,String lastName,String id,String phoneNumber,String email){
        super(firstName, lastName, id);
        _phoneNumber = phoneNumber;
        _email = email;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String toString(){
        String s = super.toString()+
                "\nPhone number: "+_phoneNumber+
                "\nE-mail: "+_email;
        return s;
    }
}
