package pl.sdacademy.java.basic.exercices.day3.Task9;

import java.util.Objects;

public class OrderItem {
    private final String productName;
    private final int quantity;
    private final double price;

    private static final String DELIMETER = " \t|\t ";

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return quantity * price;
    }

    public boolean isCorrect() {
        if (quantity > 0 && price > 0) {
            return true;
        }
        return false;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(productName).append(DELIMETER)
                .append(price).append("zł").append(DELIMETER)
                .append(quantity).append("pcs").append(DELIMETER)
                .append(+this.getAmount()).append("zł");
        System.out.println(stringBuilder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return quantity == orderItem.quantity && Double.compare(price, orderItem.price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }
}
