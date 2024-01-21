package livingthings;
import livingthings.abilities.*;
import java.util.ArrayList;

public abstract class Creature {
    public ArrayList<String> favoriteFood = new ArrayList<String>();
    public ArrayList<String> FoodItHas = new ArrayList<String>();
    public ArrayList<String> thoughts = new ArrayList<String>();
    public int waterLvl;
    public enum Sex{
        MALE("мальчик"),
        FEMALE("девочка");
        private final String value;
        private Sex(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public abstract void eat(String food);
    public abstract void drinkWater();


}
