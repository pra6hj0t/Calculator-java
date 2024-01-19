package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnclear,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndivide,btnmultily,btnsub,btnadd,btndot,btnequal;
    EditText text;
    String f="",op="",h="";
    double frstNumber=0,scnd=0,tot=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclear=findViewById(R.id.btnClear);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btnzero);
        btndivide=findViewById(R.id.btndiv);
        btnmultily=findViewById(R.id.btnmul);
        btnsub=findViewById(R.id.btnsub);
        btnadd=findViewById(R.id.btnadd);
        btndot=findViewById(R.id.btndot);
        btnequal=findViewById(R.id.btnequ);

        text=findViewById(R.id.edit1);


//        text.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//
//            public void onFocusChange(View v, boolean hasFocus) {
//
//                if(hasFocus){
//                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(text.getWindowToken(), 0);
//                }
//            }
//        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
                f="";
                h="";
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn1.getText().toString();
                text.setText(f);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn2.getText().toString();
                text.setText(f);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn3.getText().toString();
                text.setText(f);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn4.getText().toString();
                text.setText(f);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn5.getText().toString();
                text.setText(f);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn6.getText().toString();
                text.setText(f);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn7.getText().toString();
                text.setText(f);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn8.getText().toString();
                text.setText(f);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn9.getText().toString();
                text.setText(f);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btn0.getText().toString();
                text.setText(f);
            }
        });
        btnmultily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    op="*";
                if(!h.equals("")){
                    frstNumber=Double.parseDouble(h);
                    f = "";
                    text.setText("");
                    h="";
                }
                else {
                    frstNumber = Double.parseDouble(f);
                    f = "";
                    text.setText("");
                }
                }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="/";
                if(!h.equals("")){
                    frstNumber=Double.parseDouble(h);
                    f = "";
                    text.setText("");
                    h="";
                }
                else {
                    frstNumber = Double.parseDouble(f);
                    f = "";
                    text.setText("");
                }
                }

        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="-";
                if(!h.equals("")){
                    frstNumber=Double.parseDouble(h);
                    f = "";
                    text.setText("");
                    h="";
                }
                else {
                    frstNumber = Double.parseDouble(f);
                    f = "";
                    text.setText("");
                }
                }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="+";
                if(!h.equals("")){
                    frstNumber=Double.parseDouble(h);
                    f = "";
                    text.setText("");
                    h="";
                }
                else {
                    frstNumber = Double.parseDouble(f);
                    f = "";
                    text.setText("");
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(op.equals("+")){
                        scnd=Double.parseDouble(f);

                        tot=frstNumber+scnd;

                }
                if(op.equals("-")){
                    scnd=Double.parseDouble(f);
                    tot=frstNumber-scnd;
                }
                if(op.equals("*")){
                    scnd=Double.parseDouble(f);
                    tot=frstNumber*scnd;
                }
                if(op.equals("/")){
                    scnd=Double.parseDouble(f);
                    tot=frstNumber/scnd;
                }



                h=""+tot;
                text.setText(h);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=f+btndot.getText().toString();
                text.setText(f);
            }
        });



    }
}