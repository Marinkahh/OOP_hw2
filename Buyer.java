package org.example.seminar2.cw.task1;

public abstract class Buyer implements BuyerBehavior{
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;
    abstract String getName();
}
