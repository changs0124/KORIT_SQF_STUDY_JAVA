package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selectedMenu = sc.nextLine();
            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("[이름 등록 : ");
                    names[names.length - 1] = sc.nextLine();
                    System.out.println("등록 완료");
//                    newNames = null;  // JVM의 가비지 컬렉터가 자동 수거
                    // 스택 구조 : LIFO = Last In First Out
                    // 가비지 컬렉터 - 메인 메소드 종료시 스택 할당 소멸 -> 힙 메모리 할당 부분도 소멸
                    break;
                case "2":
                    System.out.println("[수정]");
                    System.out.println("이전 이름 : ");
                    String editName = sc.nextLine();
                    System.out.println("새 이름 : ");
                    String newName = sc.nextLine();
                    for (String name : names) {
                        if (name.equals(editName)) {
                            names[name.indexOf(editName)] = newName;
                            break;
                        }
                    }
                    break;
                case "3":
                    String[] finalNames = new String[names.length - 1];
                    System.out.println("[삭제]");
                    System.out.println("삭제할 이름 : ");
                    String delName = sc.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(delName)) {
                            for(int j = 0; j < names.length - i - 1; j++) {
                                names[i + j] = names[i + j + 1];
                            }
                        }
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    for(int i = 0; i < finalNames.length; i++) {
                        finalNames[i] = names[i];
                    }
                    names = finalNames;
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("찾을 이름 : ");
                    String result = null;
                    String findName = sc.nextLine();

                    for(String name : names) {
                        if(name.equals(findName)) {
                            result = name;
                            break;
                        }
                    }
                    if(result == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        continue;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "] : " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.print("다시 입력하세요. : ");
            }
        }
    }
}
