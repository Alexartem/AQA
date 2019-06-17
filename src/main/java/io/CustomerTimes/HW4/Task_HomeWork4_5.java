package io.CustomerTimes;

public class Task_HomeWork4_5 {




    public static void main(String[] args) {

        Task_HomeWork4_5 task_homeWork4_5 = new Task_HomeWork4_5();
        Cat meow = task_homeWork4_5.new Cat("Kitty",10,5);


    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getAge() {

            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }
    }
}