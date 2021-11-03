package Classes;

public class Sortare {
    Room aux;
   public void SortarePret(Room[] _room){
        for(int i=1;i < 15; ++i)
            for(int j=i+1; j<=15;++j){
                if(_room[i]._pret > _room[j]._pret)
                {
                    aux = _room[i];
                    _room[i] = _room[j];
                    _room[j] = aux;
                }
            }
    }
   public void SortareNrPat(Room[] _room){
        for(int i=1;i < 15; ++i)
            for(int j=i+1; j<=15;++j){
                if(_room[i]._nrPat > _room[j]._nrPat)
                {
                    aux = _room[i];
                    _room[i] = _room[j];
                    _room[j] = aux;
                }
            }
    }

}
