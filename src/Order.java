
public class Order{
    // region Fields
    private String clientName;
    private String product;
    private int qnt;
    private int price;
    private final Prompt message;

    {
        message = new Message();
    }


    // endregion
    // region Constructors
    public Order(String clientName, String product, int qnt, int price) {
        if (clientName.isEmpty()) {
            this.clientName = message.inputClientName();
        } else {
            this.clientName = clientName;
        }
        if (product.isEmpty()) {
            this.product = message.inputProductName();
        } else {
            this.product = product;
        }
        if (qnt == 0) {
            this.qnt = message.inputQnt();
        } else {
            this.qnt = qnt;
        }
        if (price == 0) {
            this.price = message.inputPrice();
        } else {
            this.price = price;
        }
    }

    //    public Order inputFromConsole(){
//        this.clientName = prompt("Client name: ");
//        this.product = prompt("Product: ");
//        this.qnt = Integer.parseInt(prompt("Quantity: "));
//        this.price = Integer.parseInt(prompt("Price: "));
//    }
    // endregion
    // region Getters
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
    // endregion


}