package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService01 {
    public static void main(String[] args) {
        ArrayUtils aru = new ArrayUtils();
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
            String[] newNames = null;
            int findIndex = -1;
            switch (selectedMenu) {                                 // switch 문의 경우 영역을 구분하지 않음
                case "1":                                           // -> case뒤에 break가 없으면 밑으로 쭉 출력하는 것(그래서 break가 필요한가?)
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("[이름 등록 : ");
                    names[names.length - 1] = sc.nextLine();
                    System.out.println("등록 완료");
                    break;
                case "2":
                    System.out.println("[수정]");
                    System.out.println("수정 할 이름 : ");
                    String editName = sc.nextLine();
                    findIndex = aru.findIndexByName(names, editName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름 : ");
                    names[findIndex] = sc.nextLine();
                    System.out.println("[수정 완료]");
                    break;
                case "3":
                    System.out.println("[삭제]");
                    System.out.println("삭제할 이름 : ");
                    String delName = sc.nextLine();
                    findIndex = aru.findIndexByName(names, delName);
                    if(findIndex == -1) {                                   // 메소드로는 해당 조건문을 break 못함
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    System.out.println(delName + "을(를) 삭제하였습니다.");
                    names = newNames;
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("찾을 이름 : ");
                    String findName = sc.nextLine();
                    findIndex = aru.findIndexByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
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
