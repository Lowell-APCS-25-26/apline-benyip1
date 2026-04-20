package org.APCSLowell;

public class APLine {
    private int a, b, c;
    public APLine(int givenA, int givenB, int givenC) {
        a = givenA;
        b = givenB;
        c = givenC;
    }
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
    public double getSlope() {
        return (double)-a / (double)b;
    }
}
