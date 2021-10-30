package Classes;

public class Main {

    public static void main(String[] args) {

         Person[] _user = new User[100];

        CitireUser x = new CitireUser();

        String firstName, lastName, id, phoneNumber, email;

        for(int i=1;i<=3;++i){
                firstName = x.ReadCellData(i,0);
                lastName = x.ReadCellData(i,1);
                phoneNumber = x.ReadCellData(i,2);
                email = x.ReadCellData(i,3);
                id = x.ReadCellData(i,4);
                _user[i] = new User(firstName,lastName,id,phoneNumber,email);
        }
        System.out.println(_user[1].toString());
    }

}
