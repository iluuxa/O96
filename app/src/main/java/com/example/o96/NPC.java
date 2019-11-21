package com.example.o96;

import android.widget.TextView;

public class NPC implements Runnable,Printable{
    private int id=0;
    private String state ="Ожидает";

    public NPC(int id,String state) {
        this.id = id;
        this.state=state;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("Npc #"+id+" "+state+"\n");
    }

    @Override
    public void letsGO(TextView textView) {
        textView.append("NPC #"+id+" начал хаотически перемещаться \n");
    }
}
