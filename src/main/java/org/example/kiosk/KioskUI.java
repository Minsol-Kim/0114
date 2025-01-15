package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskUI {
    public void startOrder() {
        while(true){
            this.greeting();
            this.makeOrder();
            this.thanks();
        }
    }

    public void greeting() {
        System.out.println("안녕하세요!");
    }
    // 주문 받는 메서드
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

        while(true) {

            ArrayList<Menu> menus = MenuService.INSTANCE.getList();
            menus.forEach(m -> System.out.println(m));

            System.out.println("메뉴번호를 입력하세요");
            int num = Integer.parseInt(scanner.nextLine()); //메뉴 입력
            System.out.println("수량을 입력하세요");
            int qty = Integer.parseInt(scanner.nextLine()); //수량 입력

            // 입력된 주문 번호와 수량을 OrderItem 배열에 넣어 주문목록 만들기
            OrderItem orderItem = OrderItem.builder().menuNo(num).qty(qty).build();
            order.addOrderItem(orderItem); //만든 주문목록 배열에 더하기

            System.out.println("주문을 계속 하실래요? y/n");
            String oper = scanner.nextLine();

            if(oper.equals("n")){
                break;
            } //if end
        }
        //주문 끝
        int num = OrderService.INSTANCE.addOrder(order); //주문 번호 생성
        System.out.println("주문 번호 " + num);
    }


    public void thanks() {
        System.out.println("안녕히가세요 행복하세요");

    }
}
