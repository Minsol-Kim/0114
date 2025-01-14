package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

public enum CardDeck {
    INSTANCE;

    private ArrayList<Card> cards;

    //카드를 준비해야지 뽑을 수 있음 -> 생성자
    private CardDeck() {
        this.cards = new ArrayList<>();
        for (CardPattern pattern : CardPattern.values()) {
            //클로버 1부터 48까지 카드 추가
            for (int i = 1; i <= 12; i++) {
                cards.add(new Card(pattern, i));

            } //end for
            Collections.shuffle(cards); //카드 섞기
        }
    }
        //원하는 기능 : 임의의 카드 뽑기
        //리턴타입 : 카드 , 파라미터 타입 : 카드
        public Card getOne() {
            Card card = cards.remove(0);
            return card;
        }


}


