package vending;

public class VendingMachine {

    private int iacount;
    private int teacount;
    private int milkcount;

    //생성자 -> 기본
    public VendingMachine(){
        this.iacount=10;
        this.teacount=5;
        this.milkcount=7;

    }
    //생성자 -> 지정, 생성자 갯수 2개: 객체 만드는 방법 2개
    public VendingMachine(int iacount, int teacount, int milkcount) {
        this.iacount = iacount;
        this.teacount = teacount;
        this.milkcount = milkcount;
    }

    public String makeIA() {

        return "Ice Americano"+this.iacount--;
    }
    public String makeTea(){

        return "Green Tea" +this.teacount--;
    }

    public String makeMilkCoffee(){
        return "Milk Coffee"+this.milkcount--;

    }






}
