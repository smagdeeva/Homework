package lesson4.computer.Logger;

class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("FileLogger- Log in to console:" + message);
    }
}
