package org.example;

import org.example.lots.LotsUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        VendingMachine vm = new VendingMachine(20,5,5);
//
//        VendingUI ui =new VendingUI(vm);
//        ui.use();
//        ArrayList<String> list = new ArrayList<>();
//        list.add("꽝");
//        list.add("꽝");
//        list.add("당첨");
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
        LotsUI ui = new LotsUI();
        ui.startGame();



    }
}