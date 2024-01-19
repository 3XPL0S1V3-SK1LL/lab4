package livingthings;

import java.util.ArrayList;
import java.util.Objects;

import builtinexception.InvalidDestinationException;
import builtinexception.UnexpectedPlaceException;
import inanimateobjects.*;
import livingthings.abilities.Abilities;

public class Human extends Creature {
    private String name;
    private Sex sex;
    private int age;
    private String cloth;
    private Place place;
    private ArrayList<Abilities> Abilities = new ArrayList<Abilities>(); //список умений
    public void setPlace(Place place) {
        this.place = place;
    }
    public Place getPlace() {
        return this.place;
    }
    public  void  setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setCloth(String cloth) {
        this.cloth = cloth;
    }
    public String getCloth() {
        return cloth;
    }
    public void setAbilities(ArrayList<Abilities> Abilities) {
        this.Abilities = Abilities;
    }
    public void addFavoriteFood(String food) {
        favoriteFood.add(food);
    }
    public ArrayList<String> getFavoriteFood(){
        return favoriteFood;
    }
    public void addFoodItHas(String food){
        FoodItHas.add(food);
    }
    public ArrayList<String> getFoodItHas(){
        return FoodItHas;
    }
    public void setWaterLvl(int lvl) {
        this.waterLvl = lvl;
    }
    public int getWaterLvl() {
        return waterLvl;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(cloth, human.cloth) && Objects.equals(sex, human.sex) && Objects.equals(Abilities, human.Abilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cloth, sex, Abilities);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cloth='" + cloth + '\'' +
                ", sex='" + sex + '\'' +
                ", Abilities=" + Abilities +
                '}';
    }

    public ArrayList<Abilities> getAbilities() {
        return Abilities;
    }
    public boolean addAbility(Abilities newAbility) {
        System.out.println(this.getName() + " теперь умеет " + newAbility.getName()
                + " (" + newAbility.getDetails()+ ")");
        Abilities.add(newAbility);
        return true;
    }
    public void changePlace(Place toPlace) {
        try{
            if (toPlace == place) throw new InvalidDestinationException(place.getValue());
            System.out.println(getName() + " перешел из " + getPlace().getValue() + " в " + getPlace().getValue() + " !");
            setPlace(toPlace);
        }
        catch (InvalidDestinationException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public void climbTheStairs(Stairs stairs) {
        try {
            if (getPlace() != Place.STAIRS)
                throw new UnexpectedPlaceException(Place.STAIRS.getValue(), getPlace().getValue());
            if (stairs.getWidth() != 0 & stairs.getHeight() != 0) {
                System.out.println(getName() + " Поднимается по " + stairs.getDescriptionWidth(stairs.getWidth()) + " и " + stairs.getDescriptionHight(stairs.getHeight()) +
                        " лестнице ведущей из " + stairs.getDownPlace().getValue() + " в " + stairs.getUpPlace().getValue());
                setPlace(stairs.getUpPlace());
            } else {
                System.out.println(getName() + " Поднимается по лестнице ведущей из " + stairs.getDownPlace().getValue() + " в " + stairs.getUpPlace().getValue());
                setPlace(stairs.getDownPlace());
            }
        } catch (UnexpectedPlaceException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public void goDownTheStairs(Stairs stairs) {
        try {
            if (getPlace() != Place.STAIRS) throw new UnexpectedPlaceException(Place.STAIRS.getValue(), getPlace().getValue());
                if (stairs.getWidth()!= 0 & stairs.getHeight() != 0) {
                    System.out.println(getName() + " Спускается по " + stairs.getDescriptionWidth(stairs.getWidth()) + " и " + stairs.getDescriptionHight(stairs.getHeight()) +
                            " лестнице ведущей из " + stairs.getUpPlace().getValue() + " в " + stairs.getDownPlace().getValue());
                    setPlace(stairs.getDownPlace());
                }
                else {
                    System.out.println(getName() + " Спускается по лестнице ведущей из " + stairs.getUpPlace().getValue() + " в " + stairs.getDownPlace().getValue());
                    setPlace(stairs.getDownPlace());
                }
        }
        catch (UnexpectedPlaceException exception) {
            System.out.println(exception.getMessage());
        }
    }
    @Override
    public void eat(String food){
        if (favoriteFood.contains(food) & FoodItHas.contains(food)) {
            FoodItHas.remove(FoodItHas.indexOf(food));
            System.out.println("Съел" + food);
        }
        else if (!(favoriteFood.contains(food))) {
            System.out.println("Он это не есть");
        }
        else if (!(FoodItHas.contains(food))) {
            System.out.println("У него этого нет");
        }
    }
    @Override
    public void drinkWater() {
        if ( getWaterLvl() >= 10) {
            System.out.println("Не может больше пить!");
        }
        else {
            setWaterLvl(getWaterLvl() + 1);
        }
    }
}

