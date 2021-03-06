package Classes;

import GUI.MainMenu;

public class Main {

    private MainMenu mainMenu;

    public Main(){
        this.mainMenu = new MainMenu();
    }

    public static void main(String[] args) {

        Main program = new Main();
        program.mainMenu.displayMainMenu();

        Person[] _user = new User[100];
        Room[] _room = new Room[16];
        CitireExcel x = new CitireExcel();
        Sortare y = new Sortare();
        ScriereExcel z = new ScriereExcel();
        int nrCam, nrPat, nrPers, pret;
        String firstName, lastName, id, phoneNumber, email,idUser, idAngajat,size;
        for(int i=1;i<=3;++i) {
            firstName = x.ReadCellData(i, 1, User.fisU());
            lastName = x.ReadCellData(i, 0, User.fisU());
            phoneNumber = x.ReadCellData(i, 3, User.fisU());
            email = x.ReadCellData(i, 2, User.fisU());
            id = x.ReadCellData(i, 4, User.fisU());
            try {
                _user[i] = new User(firstName, lastName, id, phoneNumber, email);
            }
            catch(InvalidPhoneNumberException e){
                e.printStackTrace();
            }
        }

        for(int i=1;i<=15;++i) {
            nrCam = x.ReadCellDataInt(i, 0, Room.fisR());
            nrPat = x.ReadCellDataInt(i, 1, Room.fisR());
            nrPers = x.ReadCellDataInt(i, 2, Room.fisR());
            size = x.ReadCellData(i, 3, Room.fisR());
            pret = x.ReadCellDataInt(i, 4, Room.fisR());
            idAngajat = x.ReadCellData(i, 5, Room.fisR());
            idUser = x.ReadCellData(i, 6, Room.fisR());
            try {
                _room[i] = new Room(nrCam, nrPat, nrPers, pret, size, idUser, idAngajat);
            }
            catch(InvalidPriceException e){
                e.printStackTrace();
            }
        }


        z.WriteCellData(1,6,Room.fisR(),"yes");
    }

}
