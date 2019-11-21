package com.example.o96;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText =(TextView)findViewById(R.id.debugText);
        Unit alexey = new Unit("Alexey Grigorievich",200);
        alexey.printInfo(debugText);
        Robot Shwarzneager = new Robot("Arnold Shwarzneager",1000,400);
        Shwarzneager.printInfo(debugText);
        alexey.letsGO(debugText);
        Shwarzneager.letsGO(debugText);
       wizard Dambldor = new wizard("Dambldor",20,100000);
       Dambldor.printInfo(debugText);
        Dambldor.letsGO(debugText);
        NPC NPC = new NPC(0,"Ожидает");
        NPC.letsGO(debugText);
        NPC.printInfo(debugText);
    }
}
