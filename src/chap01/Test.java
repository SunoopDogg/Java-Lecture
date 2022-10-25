package chap01;

public class Test {
    public static void main(String[] args) {

    }

    static class myClass1 {
        int value;

        public myClass1(int value) {
            this.value = value;
        }
    }

    static class myClass2 extends myClass1 {
        int value;

        public myClass2(String s, int value) {
            super(value);
        }
    }
}
