public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Делит одно число на другое.
     * @param a делимое
     * @param b делитель
     * @return результат деления
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        return (double) a / b;
    }
}