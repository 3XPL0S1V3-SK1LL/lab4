package builtinexception;

public class InvalidDestinationException extends RuntimeException {
    public InvalidDestinationException(String str) {
        super("Вы и так находитесь в этом месте! (" + str + " )" );
    }
}
