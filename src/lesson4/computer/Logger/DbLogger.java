package lesson4.computer.Logger;

class DbLogger implements Logger {
    public void log(String message) {
        System.out.println("DbLogger- Log in to console:" + message);
    }
}
