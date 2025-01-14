package org.example.kiosk.order;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
@Getter //내용 가지고 오기
@ToString //전체 내용 확인

//파라미터 메뉴번호, 메뉴 갯수 -> OrderItem
public class Order {
    private int ono;//주문번호
    private ArrayList<OrderItem> orderItemList; //주문 목록
    //생성자 -> 데이터 초기화
    public Order() {
        orderItemList = new ArrayList<>();
    }

    //새로운 OrderItem 추가
    public void addOrderItem(OrderItem newItem) {
        orderItemList.add(newItem);//새로운 주문을 주문 목록에 추가


    }


}
