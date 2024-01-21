package builtinexception;

public class DoorStatusException extends Exception {
    public DoorStatusException (String str) {
        super("Дверь и так" + str);
    }
}
