import java.util.Scanner;

// Parent Class
class Delivery {
    double orderAmount;

    // Constructor
    Delivery(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    // Method
    double calculateDeliveryCharge() {
        return orderAmount;
    }
}

// Child Class 1
class RegularDelivery extends Delivery {

    RegularDelivery(double orderAmount) {
        super(orderAmount);
    }

    // Method Overriding
    @Override
    double calculateDeliveryCharge() {
        return orderAmount + 40.0;
    }
}

// Child Class 2
class ExpressDelivery extends Delivery {

    ExpressDelivery(double orderAmount) {
        super(orderAmount);
    }

    // Method Overriding
    @Override
    double calculateDeliveryCharge() {
        return orderAmount + 80.0 + (orderAmount * 5 / 100);
    }
}

// Main Class
public class Food_Delivery_Order {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int deliveryType = sc.nextInt();
        double orderAmount = sc.nextDouble();

        Delivery delivery;

        if (deliveryType == 1) {
            delivery = new RegularDelivery(orderAmount);
        } 
        else {
            delivery = new ExpressDelivery(orderAmount);
        }

        System.out.printf("%.2f%n",
                delivery.calculateDeliveryCharge());

        sc.close();
    }
}

