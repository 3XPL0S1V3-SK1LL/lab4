package livingthings.abilities;

public class Abilities{ //класс возможностей, умений
    private final String name;
    private String details; // детали в основном обстоятельство
    //например, странно посмотреть ---- странно - деталь
    public Abilities(String name){
        this.name = name;
    }
    public Abilities(String name, String details){
        this.name = name;
        this.details = details;
    }
    public String getName(){
        return name;
    }
    public String getDetails(){
        return (details == null) ? "без деталей" : details;
    }
}

