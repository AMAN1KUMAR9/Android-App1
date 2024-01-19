package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] Questions = {"C++ was invented in 1990?","The predecessor of C++ is C","Do C++ support multiple inheritance?"," Do C++ supports OOP's "};
    private boolean [] ans = {false,true,true,true};
    private Button Yes;
    private Button No;









    private TextView textView2;
    private int score=0;
    private int ind = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes=findViewById(R.id.yes);
        No=findViewById(R.id.no);
        textView2 = findViewById(R.id.textView2);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (ind<= Questions.length-1){
                if (ans[ind] == true ){
                    score++;
                }
                ind++;
                if (ind<= Questions.length-1){
                    textView2.setText(Questions[ind]);
                }
                else {
                    Toast.makeText(MainActivity.this, "your score is "+ score, Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(MainActivity.this, "Restart the application to play again", Toast.LENGTH_SHORT).show();
            }
            }
        });
            No.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (ind<= Questions.length-1){
                        if (ans[ind] == false ){
                            score++;
                        }
                        ind++;
                        if (ind<= Questions.length-1){
                            textView2.setText(Questions[ind]);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "your score is "+ score, Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Restart the application to play again", Toast.LENGTH_SHORT).show();
                    }
                }
        });


    }
}