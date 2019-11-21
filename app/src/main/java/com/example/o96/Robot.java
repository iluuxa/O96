package com.example.o96;

import android.widget.TextView;

public class Robot extends Unit implements Printable,Runnable{
    private int energy;

    public Robot(String name, int health,int energy) {
        super(name, health);
        this.energy=energy;
    }
    @Override
    public void printInfo(TextView textPlace){
        super.printInfo(textPlace);
        textPlace.append(this.getName()+" имеет "+this.energy+"\n");}
@Override
public  void letsGO(TextView textPlace){
    textPlace.append("Энергия "+getName()+ " уменьшилась до "+energy+" вследствие перемещения \n");
}
}
