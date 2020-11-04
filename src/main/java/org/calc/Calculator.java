package org.calc;


public class Calculator {
    private double sum = 0;

    public void add(double num) {
        sum += num;
    }
    public void sub(double num) {
        sum -= num;
    }
    public void multiply(double num) {
        sum *= num;
    }
    public boolean divide(double num) {
        if (num == 0)
            return false;
        else {
            sum /= num;
            return true;
        }
    }
    public void reset() {
        sum = 0;
    }
    public double getSum() {
        return sum;
    }
}
