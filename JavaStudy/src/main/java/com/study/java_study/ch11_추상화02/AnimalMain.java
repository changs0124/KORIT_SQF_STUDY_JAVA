package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal animal = new Animal(); : Animal' is abstract; cannot be instantiated
        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger();
        }

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
