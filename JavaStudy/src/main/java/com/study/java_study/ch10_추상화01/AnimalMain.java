package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("a", 11, "a");
        Animal tiger = new Tiger("a", 12, 100);

        dog.move();
        dog.bark();
        tiger.move();
        ((Tiger)tiger).hunt();      // 다운 캐스팅 : 자식 클래스의 메소드를 다시 사용하기 위해
        System.out.println("----------------------------------------------------------");
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("웅이", 5, 100);

        for (Animal animal : animals) {
            animal.move();
        }
        System.out.println("----------------------------------------------------------");
        for (Animal animal : animals) {
            if(animal instanceof Tiger) {       // 해당 클래스를 객체화 하였는 가?
                Tiger t = (Tiger) animal;       // Tiger 다운 캐스팅
                t.hunt();
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
        System.out.println("----------------------------------------------------------");
        // jdk 최신 버전 : instanceof => a.getClass() == a.class
        for (Animal animal : animals) {
            if(animal.getClass() == Tiger.class) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

    }
}
