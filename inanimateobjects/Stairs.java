
package inanimateobjects;

import builtinexception.StairsDimensionException;
import builtinexception.StairsDirectionException;

public class Stairs implements IntStairs {
    private boolean isBroken;
    private int height;
    private double width;
    private final Place upPlace;
    private final Place downPlace;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
            if (height <= 5 | height >= 20) throw new StairsDimensionException(getDescriptionHight(height));
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
            if (width <= 0.2 | width >= 3) throw new StairsDimensionException(getDescriptionWidth(width));
            this.width = width;
    }
    public boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(boolean status) {
        this.isBroken = status;
    }
    public Place getUpPlace() {
        return upPlace;
    }

    public Place getDownPlace() {
        return downPlace;
    }

    public Stairs(Place upPlace, Place downPlace){
        isBroken = false;
        this.upPlace = upPlace;
        this.downPlace = downPlace;
        if (getUpPlace() == getDownPlace()) throw new StairsDirectionException(upPlace.getValue());
        System.out.println("Лестница ведущая из " + downPlace.getValue() + " в " + upPlace.getValue() + " создана!");
    }
    public String getDescriptionWidth(double width) {
        if (width <= 0.5) {
            return " узкая ";
        }
        if (width > 0.5 & width<=1.0) {
            return "нормального размера в ширину";
        }
        return "широкая";
    }
    public String getDescriptionHight(int hight) {
        if (hight <= 10) {
            return " маленькая ";
        }
        if (hight<=15) {
            return "нормального размера в высоту";
        }
        return "высокая";
    }
    @Override
    public void breakDown() {
        setIsBroken(false);
    }
    @Override
    public void beRapaired() {
        setIsBroken(true);
    }
}

