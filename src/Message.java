import java.util.Scanner;

public class Message implements Prompt{
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public String inputClientName() {
        return prompt("Client name: ");
    }

    @Override
    public String inputProductName() {
        return prompt("Product: ");
    }

    @Override
    public int inputQnt() {
        return Integer.parseInt(prompt("Qnt: "));
    }

    @Override
    public int inputPrice() {
        return Integer.parseInt(prompt("Price: "));
    }
}
