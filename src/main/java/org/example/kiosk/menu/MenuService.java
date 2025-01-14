package org.example.kiosk.menu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public enum MenuService {
    INSTANCE;
    private ArrayList<Menu> menus;

    // 주어진 메뉴 데이터들을 제공
    //초기화
    private MenuService(){
        this.menus = new ArrayList<>(); //메뉴 ArrayList 생성
        //메뉴 생성
        menus.add(new Menu(1, "Americano", 3000));
        menus.add(new Menu(2, "Latte", 3500));
        menus.add(new Menu(3, "Cappuccino", 4000));
        menus.add(new Menu(4, "Espresso", 2500));
    }
    //변수 값을 가지고 오는 메서드
public ArrayList<Menu> getList(){
        return menus;

    }



}
