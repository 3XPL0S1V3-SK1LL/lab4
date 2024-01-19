package livingthings;
import inanimateobjects.*;
import java.util.ArrayList;
public class Shorty extends Human {
    private final ArrayList<KidClothing> clothing = new ArrayList<KidClothing>();
    public Shorty() {
        System.out.println("Коротышка создана!");
    } //перегружаем конструкторы, поскольку разное количество параметров может быть задано
    public Shorty(String name, Sex sex) {
        setName(name);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ")");
    }
    public Shorty(String name, Sex sex, int age) {
        setName(name);
        setAge(age);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ") " +"Ему" + getAge() + "лет!");
    }
    ActionsWithCloth wearAndTakeOff = new ActionsWithCloth(){
        public void wear(KidClothing clothing) {
            boolean flag = false;
            for (KidClothing cloth: Shorty.this.clothing) {
                if (cloth.getType().getType().equals(clothing.getType().getType())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(clothing.getType().getType());
            }
            else {
                Shorty.this.clothing.add(clothing);
            }
        }
        public void takeOff(KidClothing clothing) {
            if (Shorty.this.clothing.contains(clothing)) {
                Shorty.this.clothing.remove(clothing);
                System.out.println("C" + getName() + " снята " + clothing.getType().getValue());
            }
            else {
                System.out.println("Такой одежды нет!");
            }
        }
    };
    public void wearSomething(KidClothing clothing){
        wearAndTakeOff.wear(clothing);
    }
    public void takeOffSomething(KidClothing clothing){
        wearAndTakeOff.takeOff(clothing);
    }
    public ArrayList<KidClothing> getClothing() {
        return this.clothing;
    }
}
