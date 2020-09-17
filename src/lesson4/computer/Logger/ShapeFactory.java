package lesson4.computer.Logger;

class ShapeFactory {

    public Object getLogger(String loggerType) {
        if (loggerType == null) {
            return null;
        }
        if (loggerType.equalsIgnoreCase("ConsoleLogger ")) {
            return new ConsoleLogger();
        } else if (loggerType.equalsIgnoreCase("FileLogger")) {
            return new FileLogger();
        } else if (loggerType.equalsIgnoreCase("DbLogger")) {
            return new DbLogger();
        }
        return null;
    }

    class Calculator implements Logger {
        public double sum(double a, double b) {
            return a + b;

        }


        public double multiply(double a, double b) {
            return a * b;
        }

        public double subtraction(double a, double b) {
            return a - b;

        }

        public double divide(double a, double b) {
            return a / b;

        }


        @Override
        public void log(String message) {

        }
    }
}
