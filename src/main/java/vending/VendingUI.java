package vending;

import java.util.Scanner;

public class VendingUI {

    //메서드간 공유
    private Scanner scanner;
    //계속 사용 -> 인스턴스 변수 (타입 변수명)
    private VendingMachine vendingMachine;

    public VendingUI(VendingMachine vm) {
        this.scanner = new Scanner(System.in);
       // this.vendingMachine = new VendingMachine();
        this.vendingMachine=vm;
    }

    public void use() {
        outer:
        while(true){
            System.out.println("1.아아 2.티 3.밀크커피 4.종료");
            String oper = this.scanner.nextLine();

            switch (oper){
                case "1":
                    System.out.println(vendingMachine.makeIA());
                    break;
                case "2":
                    System.out.println(vendingMachine.makeTea());
                    break;
                case "3":
                    System.out.println(vendingMachine.makeMilkCoffee());
                    break;
                case "4":
                    System.out.println("프로그램 종료 합니다.");
                    break outer;
            }//end switch

        }//end switch
    }
}

