package lesson6;

public class UnknownAccountException extends Exception {

    public UnknownAccountException(int accountId) {
        super("Аккаунт " + accountId + " не найден");
    }

}