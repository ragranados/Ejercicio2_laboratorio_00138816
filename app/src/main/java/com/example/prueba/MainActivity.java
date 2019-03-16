package com.example.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout panel1;
    LinearLayout panel2;
    LinearLayout panel3;

    int arreglo1[],arreglo2[],arreglo3[];

    int cont1,cont2,cont3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont1 = 0;
        cont2 = 0;
        cont3 = 0;

        panel1 = findViewById(R.id.panel1);
        panel2 = findViewById(R.id.panel2);
        panel3 = findViewById(R.id.panel3);

        panel1.setOnClickListener(this);
        panel2.setOnClickListener(this);
        panel3.setOnClickListener(this);

        arreglo1 = new int[]{R.color.rojo1,R.color.rojo2,R.color.rojo3,R.color.rojo4,R.color.rojo5,R.color.rojo6};
        arreglo2 = new int[]{R.color.verde1,R.color.verde2,R.color.verde3,R.color.verde4,R.color.verde5,R.color.verde6};
        arreglo3 = new int[]{R.color.azul1,R.color.azul2,R.color.azul3,R.color.azul4,R.color.azul5,R.color.azul6};

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch(viewId){
            case R.id.panel1:
                cont1 = sumar(cont1);
                panel1.setBackgroundColor(cont1);
                break;
            case R.id.panel2:
                cont2 = sumar(cont2);
                panel2.setBackgroundColor(cont2);
                break;
            case R.id.panel3:
                cont3 = sumar(cont3);
                panel3.setBackgroundColor(cont3);
                break;
        }
    }

    public int sumar(int i){
        if(i < 5){
            return i++;
        }else{
            return 0;
        }
    }
}