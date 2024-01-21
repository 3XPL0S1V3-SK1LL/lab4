package builtinexception;

public class UnexpectedPlaceException extends RuntimeException{
    public UnexpectedPlaceException(String expectingPlace, String currentPlace) {
        super("Место положение должно быть " + expectingPlace + ", а сейчас " + currentPlace);
    }
}
