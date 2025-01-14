package org.example.lots;

import java.util.Scanner;

public class LotsUI {

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("마음의 준비를 하시고 Enter");
            scanner.nextLine();

            String note = LotsBox.INSTANCE.getNext();

            System.out.println(note);
            //문자열 비교는 equals
            if (note.equals("당첨")) {
                break;

            }//end if
        }//end while
    }
}
