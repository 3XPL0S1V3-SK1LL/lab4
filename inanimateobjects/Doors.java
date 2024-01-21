package inanimateobjects;

import builtinexception.DoorStatusException;

public class Doors { //создаем класс дверей
    private boolean isClosed;
    public boolean getIsClosed() {
        return isClosed;
    }
    public void setIsClosed(boolean status) {
        this.isClosed = status;
    }
    public String toString(boolean isClosed) {
        if (isClosed) {
            return "закрыта";
        }
        return "открыта";
    }
    public Doors(Place fromPlace, Place toPlace) {
        isClosed = true;
        System.out.println("Дверь из " + fromPlace.getValue() + " в " + toPlace.getValue() + " создана");
    }
    public void open() {
        try{
            if (!(isClosed)) throw new DoorStatusException(toString(false));
            setIsClosed(false);
            System.out.println("Дверь" + toString(false));
        }
        catch(DoorStatusException ignored){
        }
    }
    public void close() {
        try{
            if (isClosed) throw new DoorStatusException(toString(true));
            setIsClosed(true);
            System.out.println("Дверь" + toString(true));
        }
        catch(DoorStatusException ignored) {
        }
    }
}


