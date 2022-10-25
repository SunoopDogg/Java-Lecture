public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "홍길동";
        person1.age = 20;
        person1.gender = "남성";
        person1.addr = "서울시 강남구";

        person1.introduce();
    }
}

class Person {
    String name;
    int age;
    String gender;
    String addr;

    void introduce() {
        System.out.println("저의 이름은 " + name + "이고,");
        System.out.println("나이는 " + age + "살 " + gender + "입니다.");
        System.out.println("사는 곳은 " + addr + "입니다~ 앞으로 잘 부탁드립니다!!");
    }
}