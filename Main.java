package org.example.seminar2.cw.task1;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name="Покупатель";
        Market market = new Market();
        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();
    }
}
