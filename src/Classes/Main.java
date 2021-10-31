package Classes;

public class Main {

    public static void main(String[] args) {

        Person[] _user = new User[100];
        Room[] _room = new Room[15];
        CitireExcel x = new CitireExcel();

        String firstName, lastName, id, phoneNumber, email;

        for(int i=1;i<=3;++i){
            firstName = x.ReadCellData(i,1, User.fisU());
            lastName = x.ReadCellData(i,0, User.fisU());
            phoneNumber = x.ReadCellData(i,3, User.fisU());
            email = x.ReadCellData(i,2, User.fisU());
            id = x.ReadCellData(i,4, User.fisU());
            _user[i] = new User(firstName,lastName,id,phoneNumber,email);
        }
        System.out.println(_user[1].toString());
    }

}
