package org.example;

import vending.VendingMachine;
import vending.VendingUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(20,5,5);

        VendingUI ui =new VendingUI(vm);
        ui.use();

    }
}