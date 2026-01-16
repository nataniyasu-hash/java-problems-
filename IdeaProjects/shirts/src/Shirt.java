    public class Shirt {

        private String color;

        private String size;

        public Shirt(String s, String c) {
            this.size = s;
            this.color = c;
        }

        public String getColor() {
            return color;
        }

        public String getSize() {
            return size;
        }

        public String toString() {
            return color + "es " + size + "-Shirt";
        }
    }




