package Classes;

public class Admin {
    private static Admin _instance = new Admin();
    private Room[] _rooms;
    private int _roomsNumber;

    private Admin(){
    }
    
    public static Admin getInstance(){
        if(null==_instance){
            _instance = new Admin();
        }
        return _instance;
    }

    public void setRooms(Room[] r, int roomsNumber){
        _rooms = r;
        _roomsNumber = roomsNumber;
    }

    public String afisareCamere(){
        String s = "";
        for(int i = 0; i<_roomsNumber; ++i)
            s= s+" Numar camera : " + i+" "+ _rooms[i].toString()+"\n";
        return s;
    }
}
