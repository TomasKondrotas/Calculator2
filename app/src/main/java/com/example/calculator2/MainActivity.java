package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView viewAnswer;
    String prevAnswer ="";
    String newAnswer ="";
    int Answer = 0;
    String globalDecision ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewAnswer = findViewById(R.id.viewAnswer);
    }

    public void onBtn1Click(View view)
    {
         prevAnswer = prevAnswer + 1;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn2Click(View view)
    {
        prevAnswer = prevAnswer + 2;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtnPlus(View view)
    {
        if (prevAnswer.isEmpty())
        {
            Toast.makeText(this, getString(R.string.choseFirst), Toast.LENGTH_SHORT).show();
        }
        else if (newAnswer.isEmpty())
            {
               newAnswer = prevAnswer;
               globalDecision = "+";
            }
        else
            {
                Toast.makeText(this, getString(R.string.afterTypeSelect), Toast.LENGTH_SHORT).show();
            }
    }


}