package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
//주문 목록 : 메뉴번호, 수량
public class OrderItem {

    private int menuNo;
    private int qty;

}
