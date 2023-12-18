package pl.sdacademy.java.basic.exercices.day3.Task9;

public class Order {
    private final int maxOrderItem;
    private OrderItem[] items;
    private int currentNumberItemInOrder;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        items = new OrderItem[maxOrderItem];
        currentNumberItemInOrder = 0;
    }

    public boolean addItem(OrderItem orderItem) {
        if (currentNumberItemInOrder < maxOrderItem) {
            if (orderItem.isCorrect()) {
                items[currentNumberItemInOrder] = orderItem;
                currentNumberItemInOrder++;
                return true;
            }
        }
        System.out.println(("Invalid input"));
        return false;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (OrderItem item : items) {
            totalAmount += item.getAmount();
        }
        return totalAmount;
    }

    public int getItemsCount() {
        int count = 0;
        for (OrderItem item : items) {
            count += item.getQuantity();
        }
        return count;
    }

    public void print() {
        for (OrderItem item : items) {
            item.print();
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }

}
