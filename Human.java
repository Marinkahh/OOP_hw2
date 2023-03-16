package org.example.seminar2.cw.task1;

public class Human extends Buyer{
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderClass = true;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderClass;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderClass;
    }
}
