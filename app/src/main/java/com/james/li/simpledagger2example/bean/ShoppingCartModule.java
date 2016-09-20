package com.james.li.simpledagger2example.bean;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */

public class ShoppingCartModule {
    String cardNum;
    String owner;

    public ShoppingCartModule() {

    }

    public ShoppingCartModule(String cardNum, String owner) {
        this.cardNum = cardNum;
        this.owner = owner;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ShoppingCartModule{" +
                "cardNum='" + cardNum + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
