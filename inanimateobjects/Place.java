package inanimateobjects;
    public enum Place { // задаем допустимые места
        BEDROOM("спальня"),
        STAIRS("лестница"),
        HALL("коридор"),
        ATTIC("чердак");
        private final String value;
        private Place(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

