package school.lesson4;

import java.util.ArrayList;
public class HWPayment {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("Кефир", 1.20, 2);
        payment.addProduct("Хлеб", 1.15, 1);
        payment.addProduct("Курица", 4.00, 1);
        payment.addProduct("Чай", 2.0, 1);

        System.out.println(payment);
    }
}

class Payment {
    private ArrayList<Product> list;
    private double fullPrice;

    public Payment() {
        this.list = new ArrayList<Product>();
        this.fullPrice = 0.0;
    }

    public void addProduct(String name, double price, int quantity) {
        this.list.add(new Product(name, price, quantity));
        this.fullPrice += (price * quantity);
    }

    @Override
    public String toString() {
        return "Покупки " + list + "\r\nИТОГО: " + this.fullPrice;
    }

    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "\r\n\tТовар [" + name + ": \tЦена - " + price + ", \tКолличество - " + quantity + "]";
        }
    }
}
