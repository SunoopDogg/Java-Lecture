package chap01;

public class Example {
    private int F;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public int getTemp() { // getter
        return F;
    }

    public void setTemp(int C) { // setter
        this.F = C * 9 / 5 + 32;
    }
}
