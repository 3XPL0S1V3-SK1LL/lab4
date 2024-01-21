package inanimateobjects;

public class KidClothing implements Clothing{
     public enum TypeClothing {
        HAT("Шляпа", "головной убор"),
        BOW("Бантик", "головной убор"),
        SHIRT("рубашка", "Верхняя одежда"),
        DRESS("платье", "Верхняя одежда"),
        T_SHIRT("футболка", "Верхняя одежда"),
        SKIRT("юбка", "Нижняя одежда"),
        TROUSERS("штаны", "Нижняя одежда"),
        BOOTS("ботинки", "обувь"),
        SHOES("туфли", "обувь"),
         TIE("галстук", "аксессуар"), //Галстук
         CHAIN("цепочка", "аксессуар"), //цепочка
         APRON("передник", "аксессуар"); //передник
        private final String value;
        private final String type;
        private TypeClothing(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String getValue() {
            return value;
        }
        public String getType() {
            return type;
        }
    }
    public enum Colors {
        GREEN("зеленый"),
        YELLOW("желтый"),
        PINK("розовый"),
        ORANGE("оранжевый"),
        BLUE("синий"),
        RED("красный");
        private final String value;
        private Colors(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public static class PictureOnTheCloth {
        private String picture;
        private Colors pictureColor;
        private double width;
        private double length;

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public Colors getPictureColor() {
            return pictureColor;
        }

        public void setPictureColor(Colors pictureColor) {
            this.pictureColor = pictureColor;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }

    private TypeClothing type;
    private Colors color;
    private PictureOnTheCloth picture;
    private StatusCloth isDirty;
    public StatusCloth getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(StatusCloth isDirty) {
        this.isDirty = isDirty;
    }

    public TypeClothing getType() {
        return type;
    }

    public void setType(TypeClothing type) {
        this.type = type;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public PictureOnTheCloth getPicture() {
        return picture;
    }

    public void setPicture(PictureOnTheCloth picture) {
        this.picture = picture;
    }
    @Override
    public void getDirty() {
        setIsDirty(StatusCloth.DIRTY);
    }
    @Override
    public void getCleaned() {
        setIsDirty(StatusCloth.CLEAN);
    }
}
