package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
//주문 목록 : 메뉴번호, 수량
public class OrderItem {

    private int menuNo;
    private int qty;

}
