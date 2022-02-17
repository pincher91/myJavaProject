package school.lesson4;

import java.util.ArrayList;
public class HWPark {
    public static void main(String[] args) {
        Park park = new Park();

        park.parkList("Американские горки", 7.00, "10:00-21:00");
        park.parkList("Колесо обозрения", 5.50, "12:00-23:00");
        park.parkList("Карусели детские", 3.30, "10:00-23:00");
        park.parkList("Комната страха", 9.90, "17:00-01:00");

        System.out.println(park);
    }
}

class Park {
    private ArrayList<Attraction> list;

    public Park() {
        this.list = new ArrayList<Attraction>();
    }

    public void parkList(String name, double price, String worktime) {
        this.list.add(new Attraction(name, price, worktime));
    }

    @Override
    public String toString() {
        return "Парк развлечений" + list + "\r\nСчастливого отдыха!";
    }

    class Attraction {
        private String name;
        private double price;
        private String worktime;

        public Attraction(String name, double price, String worktime) {
            this.name = name;
            this.price = price;
            this.worktime = worktime;
        }

        @Override
        public String toString() {
            return "\r\n\tАттракцион [" + name + ": \tЦена - " + price + ", \tВремя работы - " + worktime + "]";
        }
    }
}