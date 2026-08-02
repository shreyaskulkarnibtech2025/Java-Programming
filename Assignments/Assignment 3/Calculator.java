class Calculator {
    static int calculationCount = 0;

    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum (int): " + calc.add(5, 10));
        System.out.println("Sum (decimal): " + calc.add(3.5, 2.5));
        System.out.println("Total Calculations: " + Calculator.calculationCount);
    }
}