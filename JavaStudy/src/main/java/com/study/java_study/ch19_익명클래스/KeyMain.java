package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public class Attackkey implements Key {
        @Override
        public void onKeyUp() {
            System.out.println("");
        }

        @Override
        public void onKeyDown() {
            System.out.println("");
        }
    }

    public void main(String[] args) {
        Key attackkey = new Attackkey();
        attackkey.onKeyUp();
        attackkey.onKeyDown();

        Key customKey = new Key() {
            @Override
            public void onKeyUp() {
                System.out.println("커스텀");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀");
            }
        };

        customKey.onKeyDown();
        customKey.onKeyUp();

    }
}
