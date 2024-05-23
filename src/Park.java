public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private int price;
        public Attractions(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
        public int getPrice() {
            return price;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
