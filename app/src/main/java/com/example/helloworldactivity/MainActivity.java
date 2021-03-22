package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.*;
import android.graphics.Paint;





public class MainActivity extends AppCompatActivity {

    private TextView texteHello;
    private TextView texteHello1;
    private ToggleButton simpleToggleButton1;
    private ToggleButton simpleToggleButton2;
    private Paint p;


    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleToggleButton1 = (ToggleButton) findViewById(R.id.buttonAfficheOui);
        simpleToggleButton2 = (ToggleButton) findViewById(R.id.buttonAfficheNon);
        texteHello = findViewById(R.id.texteAffiche1);
        texteHello1 = findViewById(R.id.texteAffiche2);
        p = new Paint();
    }

    public void Efface(View x){
        texteHello.setText("");
        texteHello1.setText("");
    }

    public void Affiche(View x){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        texteHello.setTextColor(color);
        Random rnd1 = new Random();
        int color1 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        texteHello1.setTextColor(color1);
    }

    public void AfficheOui(View x)
    {
        if(simpleToggleButton1.isChecked()){
            texteHello.setText("Hello World!");
        }
        else if(!simpleToggleButton1.isChecked()){
            texteHello.setText("");
        }

    }


    public void AfficheNon(View x){

        if(simpleToggleButton2.isChecked()){
            texteHello1.setText("Hello World!");
        }
        else if(!simpleToggleButton2.isChecked()){
            texteHello1.setText("");
        }

    }
}
