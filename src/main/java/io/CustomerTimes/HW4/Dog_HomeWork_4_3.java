package io.CustomerTimes;

public class Dog_HomeWork_4_3 {


    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("Name can not be empty");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be > 0");
        }

    }

    public static void main(String[] args) {
        Dog_HomeWork_4_3 labrador = new Dog_HomeWork_4_3();
        Dog_HomeWork_4_3 terier = new Dog_HomeWork_4_3();
        Dog_HomeWork_4_3 chihuahua = new Dog_HomeWork_4_3();


        labrador.setAge(0);
        labrador.setName("");
        System.out.println(labrador.getName() + "  " + labrador.getAge());

        terier.setAge(3);
        terier.setName("Hercules");
        System.out.println(terier.getName() + "  " + terier.getAge());

        chihuahua.setAge(10);
        chihuahua.setName("Slayer");
        System.out.println(chihuahua.getName() + "  " + chihuahua.getAge());

    }


}
