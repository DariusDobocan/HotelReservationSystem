package Classes;

public class Room {
    public int _nrCam, _nrPat, _nrPers, _pret;
    public String _size;
    private String _idUser, _idAngajat;

    public Room(int _nrCam, int _nrPat, int _nrPers, int _pret, String _size, String _idUser, String _idAngajat) throws InvalidPriceException{
        this._nrCam = _nrCam;
        this._nrPat = _nrPat;
        this._nrPers = _nrPers;
        if(_pret>=0) {
            this._pret = _pret;
        }
        else{
            throw new InvalidPriceException("Pretul introdus este negativ.");
        }
        this._size = _size;
        this._idUser = _idUser;
        this._idAngajat = _idAngajat;
    }

    public String get_idUser() {
        return _idUser;
    }

    public String get_idAngajat() {
        return _idAngajat;
    }

    public String toString() {
        return "Room{" +
                "_nrCam=" + _nrCam +
                ", _nrPat=" + _nrPat +
                ", _nrPers=" + _nrPers +
                ", _pret=" + _pret +
                ", _size='" + _size + '\'' +
                ", _idUser='" + _idUser + '\'' +
                ", _idAngajat='" + _idAngajat + '\'' +
                '}';
    }

    public void evacuareUser(){
        _idUser = "empty";
    }

    public static String fisR() {
        return "src/Room.xlsx";
    }

}
