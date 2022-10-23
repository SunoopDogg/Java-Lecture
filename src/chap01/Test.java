package chap01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<myClass> list = new ArrayList<myClass>();

        list.add(new myClass(10));
        list.add(new myClass(20));
        list.add(new myClass(30));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).value;
        }

        System.out.println(sum);
    }

    static class myClass {
        int value;

        public myClass(int value) {
            this.value = value;
        }
    }
}
