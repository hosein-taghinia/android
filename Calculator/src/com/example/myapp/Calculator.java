package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 18 on 10/13/2015.
 */
public class Calculator extends Activity {



    private float y;
    private float x;
    private String str;
    private float k;
    private float z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);


         final EditText txt = (EditText) findViewById(R.id.txt);
         Button btn1 = (Button) findViewById(R.id.button1);
         Button btn2 = (Button) findViewById(R.id.button2);
         Button btn3 = (Button) findViewById(R.id.button3);
         Button btn4 = (Button) findViewById(R.id.button4);
         Button btn5 = (Button) findViewById(R.id.button5);
         Button btn6 = (Button) findViewById(R.id.button6);
         Button btn7 = (Button) findViewById(R.id.button7);
         Button btn8 = (Button) findViewById(R.id.button8);
         Button btn9 = (Button) findViewById(R.id.button9);
         Button btn0 = (Button) findViewById(R.id.button0);
         Button btnzar= (Button) findViewById(R.id.buttonz);
         Button btntagh = (Button) findViewById(R.id.buttont);
         Button btnsum = (Button) findViewById(R.id.buttons);
         Button btntaf = (Button) findViewById(R.id.buttonM);
         Button btncler =(Button) findViewById(R.id.buttonc);
         Button btndot =(Button) findViewById(R.id.buttondot);
         Button btnmos =(Button) findViewById(R.id.buttonmos);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+ "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "2");
            }


        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "3");
            }


        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "4");
            }


        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "5");
            }


        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "6");
            }


        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "7");
            }


        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "8");
            }


        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "9");
            }


        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "0");
            }


        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x!=0){
                    k= Float.parseFloat(txt.getText().toString());
                    x= x+k;
                    str= "+";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    str = "+";
                    txt.setText("");
                }
            }
        });
        btntaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x!=0){
                    k= Float.parseFloat(txt.getText().toString());
                    x= x-k;
                    str= "-";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    str = "-";
                    txt.setText("");
                }
            }
        });
        btnzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x!=0){
                    k= Float.parseFloat(txt.getText().toString());
                    x= x*k;
                    str= "*";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    str = "*";
                    txt.setText("");
                }
            }
        });
        btntagh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x!=0){
                    k= Float.parseFloat(txt.getText().toString());
                    x= x/k;
                    str= "/";
                    txt.setText("");
                }
                else {
                    x = Float.parseFloat(txt.getText().toString());
                    str = "/";
                    txt.setText("");
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+ ".");
            }
        });
        btncler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=0;
                y=0;
                str="";
                txt.setText("");
            }
        });
        btnmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y=Float.parseFloat(txt.getText().toString());
                switch (str){
                    case "+":
                        z=x+y;
                        txt.setText(z + "");
                        break;
                    case "-":
                        z=x-y;
                        txt.setText(z + "");
                        break;
                    case "*":
                        z=x*y;
                        txt.setText(z + "");
                        break;
                    case "/":
                        z=x/y;
                        txt.setText(z + "");
                        break;
                    default:
                        Toast.makeText(getApplication(),"on emlkerd",Toast.LENGTH_LONG).show();
                        break;

                }

            }
        });


    }
}
