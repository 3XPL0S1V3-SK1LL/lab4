package inanimateobjects;

public interface Clothing {
    abstract void getDirty();
    abstract void getCleaned();
    public enum StatusCloth {
        DIRTY,
        CLEAN, //чистая
        BRAND_NEW; //новая
    }
}

