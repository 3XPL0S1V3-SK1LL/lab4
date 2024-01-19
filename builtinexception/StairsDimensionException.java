package builtinexception;

public class StairsDimensionException extends Exception{
    public StairsDimensionException(String str){
        super("Лестница слишком" + str);
    }
}
