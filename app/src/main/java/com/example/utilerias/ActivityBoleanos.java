package com.example.utilerias;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ActivityBoleanos extends Activity {

    Boolean b;
    Switch myswich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booleano);
        myswich = (Switch)findViewById(R.id.myswich);

        if(myswich.isChecked()==true)
        {
            Log.e("es un true","es un true");
        }
        else{
            Log.e("es un false","es un false");
        }
        myswich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean bol) {
                Log.e("que valor tengo ? ", "valor " + bol);
                b = bol;
            }
        });
    }


}
