public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        Saver saver = new Saver(order);
        saver.saveToJson();
    }
}
