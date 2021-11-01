package Classes;

public class Person {
    private String _firstName;
    private String _lastName;
    private String _id;

    public Person(){}
    public Person(String firstName, String lastName, String id){
        _firstName = firstName;
        _lastName = lastName;
        _id = id;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String toString(){
        String s = "Nume: "+_lastName+
                "\nPrenume: "+_firstName+
                "\nID: "+ _id;
        return s;
    }

    public static String fisU() {
        return "src/User.xlsx";
    }

}
