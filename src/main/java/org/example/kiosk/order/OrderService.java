package org.example.kiosk.order;

//주문을 받는 사람
//주문(order)에 대한 CRUD 처리하는 존재
//하나만 설계하고싶음 -> enum 이용

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
@Log4j2
public enum OrderService {
    //몇 개나 만들것인지 결정
    INSTANCE;
    //주문 받음 -> 주문 보관
    private ArrayList<Order> orders; //주문에 대한 array
    private int idx;

    //주문 데이터 초기화 -> 생성자
    private OrderService(){
        orders =new ArrayList<>();
    }
    //주문을 받을것 -> 추가
    public int addOrder(Order order) {
        log.info(order);
        log.info("current idx: " + idx);
        idx++; //인덱스 증가
        order.setOno(idx); //인덱스 -> 주문번호
        orders.add(order);//주문 Array에 추가

        return idx;
    }

}
