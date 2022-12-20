package chap14;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        String str = null;

        try {
            System.out.println(str.toString());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        String data = "100";
        String wrongData = "A100";

        try {
            int value = Integer.parseInt(data);
            int wrongValue = Integer.parseInt(wrongData);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);

        Integer i = Integer.valueOf("100", 16);

        System.out.println(i);
    }

    static void changeDog(Animal animal) {
        try {
            Dog dog = (Dog) animal;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
    }

    static class Animal {
        public Animal() {
            System.out.println("Animal");
        }
    }

    static class Dog extends Animal {
        public Dog() {
            System.out.println("Dog");
        }
    }

    static class Cat extends Animal {
        public Cat() {
            System.out.println("Cat");
        }
    }
}
