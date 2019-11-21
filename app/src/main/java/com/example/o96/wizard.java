package com.example.o96;

import android.widget.TextView;

public class wizard extends Unit implements Printable,Runnable {
private int mana;
    public wizard(String name, int health,int mana) {
        super(name, health);
        this.mana=mana;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(getName()+"Имеет мана: "+mana+" mp \n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        super.letsGO(textPlace);
        mana-=20;
        textPlace.append(getName()+ " телепортировался и остался с "+mana+" mp \n");
    }
}
