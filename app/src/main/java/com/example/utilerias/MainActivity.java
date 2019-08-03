package com.example.utilerias;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_contador;
    TextView tv_numeros;
    ContadorReversa tiempo;
    boolean a = false;
    long time= 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_contador = (Button)findViewById(R.id.btn_contador);
        tv_numeros = (TextView)findViewById(R.id.tv_textonumeros);
        btn_contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo = new ContadorReversa(time, 100);
                tiempo.start();
            }
        });
    }
     public class ContadorReversa extends CountDownTimer{


         public ContadorReversa(long millisInFuture, long countDownInterval) {
             super(millisInFuture, countDownInterval);
         }

         @Override
         public void onTick(long millisUntilFinished) {
             tv_numeros.setText(""+(int) (millisUntilFinished/1000));
             if(millisUntilFinished/100 == 10 && a == false)
             {
                 tiempo.cancel();
                 time = millisUntilFinished;
                 a = true;
             }
         }

         @Override
         public void onFinish() {
            tv_numeros.setText("Tu tiempo se agoto");
            a = true;
            time = 6000;
            if(tiempo != null){
                tiempo.cancel();
            }
         }
     }

}
