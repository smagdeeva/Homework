package lesson6;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Недостаточно средств");
    }
}