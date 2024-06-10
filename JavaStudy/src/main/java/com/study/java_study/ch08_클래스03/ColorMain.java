package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
            문제.
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CA848A, Brandied Apricot
            #FFBE98, Peach, Fuzz
            #964F4C, Marsala
            #A78C78, Almodine
            #D8C88D, Almond Peach
            생상 데이터를 저장 한 후에 for문을 사용하여 배열에 들어있는 모든 색상 정보를 printInfo()로 호출하여 출력한다.
            이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다. 이때 null로 바꿀때는 반복문을 사용한다.
        */
        Color[] colors = new Color[5];
        colors[0] = new Color("#CA848A", "Brandied Apricot");
        colors[1] = new Color("#FFBE98", "Peach, Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C78", "Almodine");
        colors[4] = new Color("#D8C88D", "Almond Peach");

        Color[] colors1 = new Color[] {
                new Color("#CA848A", "Brandied Apricot"),
                new Color("#FFBE98", "Peach, Fuzz"),
                new Color("#964F4C", "Marsala"),
                new Color("#A78C78", "Almodine"),
                new Color("#D8C88D", "Almond Peach")
        };

        for(int i = 0; i < colors.length; i++) {
                colors[i].printInfo();
        }
        for(Color color : colors1) {
            color.printInfo();
        }
        System.out.println("---------------------------------------------");
        for(int i = 0; i < colors.length; i++) {
            if(colors[i].getCode() != null && colors[i].getName() != null) {
                colors[i].setCode(null);
                colors[i].setName(null);
            }
        }
        for(Color color : colors1) {
            color.setCode(null);
            color.setName(null);
        }
        System.out.println("------------------------------------------------");
        for (int i = 0; i < colors.length; i++) {
            colors[i].printInfo();
        }
        for(Color color : colors1) {        // 인덱스가 필요없는 경우. 처음부터 끝까지 출력해야 하는 경우
            color.printInfo();
        }
    }
}
