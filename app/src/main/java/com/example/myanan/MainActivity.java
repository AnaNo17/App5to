package com.example.myanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botoncito1 = (Button) findViewById(R.id.botoncito1);
        Button botoncito2 = (Button) findViewById(R.id.botoncito2);



        TextView textito1 = (TextView) findViewById(R.id.textito1);
        TextView textito2 = (TextView) findViewById(R.id.textito2);
        TextView textito3 = (TextView) findViewById(R.id.textito3);
        TextView textito4 = (TextView) findViewById(R.id.textito4);

        EditText frase = (EditText) findViewById(R.id.frase);



        botoncito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int vocal,consonante,otro;

                vocal=0;
                consonante=0;
                otro=0;

                String oracion = frase.getText().toString();
                for(int cont=0; cont<oracion.length();cont++){
                    if(oracion.charAt(cont)=='a'||oracion.charAt(cont)=='e'||oracion.charAt(cont)=='i'||oracion.charAt(cont)=='o'||oracion.charAt(cont)=='u'||oracion.charAt(cont)=='A'||oracion.charAt(cont)=='E'||oracion.charAt(cont)=='I'||oracion.charAt(cont)=='O'||oracion.charAt(cont)=='U'){
                        vocal++;

                    }else if (oracion.charAt(cont)>='a' && oracion.charAt(cont)<='z'){
                        consonante++;
                    }else if (oracion.charAt(cont)>='A'&& oracion.charAt(cont)<='Z' ) {
                        consonante++;
                    }else{
                        otro++;

                    }

                    int total = vocal + consonante + otro;

                    String v = String.valueOf(vocal);
                    String c = String.valueOf(consonante);
                    String o = String.valueOf(otro);
                    String t = String.valueOf(total);

                    textito1.setText(v);
                    textito2.setText(c);
                    textito3.setText(o);
                    textito4.setText(t);

                }
            }
        });
        botoncito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                frase.setText("");
                textito1.setText("");
                textito2.setText("");
                textito3.setText("");
                textito4.setText("");

            }
        });
    }
}