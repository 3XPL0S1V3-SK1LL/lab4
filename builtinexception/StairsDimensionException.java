package builtinexception;

public class StairsDimensionException extends RuntimeException {
    public StairsDimensionException(String str){
        super("Лестница слишком" + str);
    }
}
