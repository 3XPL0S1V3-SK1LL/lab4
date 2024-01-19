package builtinexception;

public class InvalidDestinationException extends Exception {
    public InvalidDestinationException(String str) {
        super("Вы и так находитесь в этом месте! (" + str + " )" );
    }
}
