package vending;

public class VendingMachine {

    private int iaCount;
    private int teaCount;
    private int milkCount;

    //생성자 -> 기본
    public VendingMachine(){
        this.iaCount=10;
        this.teaCount=5;
        this.milkCount=7;

    }
    //생성자 -> 지정, 생성자 갯수 2개: 객체 만드는 방법 2개
    public VendingMachine(int iacount, int teacount, int milkcount) {
        this.iaCount = iacount;
        this.teaCount = teacount;
        this.milkCount = milkcount;
    }

    public String makeIA() {

        return "Ice Americano"+this.iaCount--;
    }
    public String makeTea(){

        return "Green Tea" +this.teaCount--;
    }
    public String makeMilkCoffee(){
        return "Milk Coffee"+this.milkCount--;

    }






}
