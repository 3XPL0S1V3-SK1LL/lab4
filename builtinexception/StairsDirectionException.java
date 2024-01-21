package builtinexception;

public class StairsDirectionException extends RuntimeException {
    public StairsDirectionException(String str){
        super("Лестаница ведет в одно и то же место в - " + str);
    }
}
