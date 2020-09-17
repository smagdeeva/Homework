package lesson4.computer.Logger;

class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("ConsoleLogger- Log in to console:" + message);
    }
}
