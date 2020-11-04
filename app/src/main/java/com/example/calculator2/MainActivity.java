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
    int answer = 0;
    String decision ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewAnswer = findViewById(R.id.viewAnswer);
    }
    public void clearData()
    {
        newAnswer ="";
        answer = 0;
        decision ="";
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
    public void onBtn3Click(View view)
    {
        prevAnswer = prevAnswer + 3;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn4Click(View view)
    {
        prevAnswer = prevAnswer + 4;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn5Click(View view)
    {
        prevAnswer = prevAnswer + 5;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn6Click(View view)
    {
        prevAnswer = prevAnswer + 6;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn7Click(View view)
    {
        prevAnswer = prevAnswer + 7;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn8Click(View view)
    {
        prevAnswer = prevAnswer + 8;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn9Click(View view)
    {
        prevAnswer = prevAnswer + 9;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtn0Click(View view)
    {
        prevAnswer = prevAnswer + 0;
        viewAnswer.setText(prevAnswer);
    }
    public void onBtnClearClick(View view)
    {
        newAnswer ="";
        answer = 0;
        decision ="";
        prevAnswer ="";
        viewAnswer.setText("");

    }
    public void onBtnDelClick(View view)
    {
        if ((prevAnswer != null) && (prevAnswer.length() > 0)) {
            prevAnswer = prevAnswer.substring(0, prevAnswer.length() - 1);
            viewAnswer.setText(prevAnswer);
        }else
        {
            Toast.makeText(this, getString(R.string.delEmpty), Toast.LENGTH_SHORT).show();
        }

    }
    public void onBtnChangeClick()
    {
        int changeSign = Integer.parseInt(prevAnswer);

        prevAnswer = Integer.toString(changeSign);

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
               prevAnswer = "0";
               decision = "+";
               viewAnswer.setText("");
            }
        else
            {
                Toast.makeText(this, getString(R.string.afterTypeSelect), Toast.LENGTH_SHORT).show();
            }
    }

    public void onBtnEq(View view)
    {
       View(decision);
    }
    public void View(String Decision) {

        switch (Decision) {
            case "+":
                answer = Integer.parseInt(prevAnswer) + Integer.parseInt(newAnswer);
                viewAnswer.setText(String.valueOf(answer));
                prevAnswer = String.valueOf(answer);
                clearData();
                break;
            case "CAT":

                break;
            case "TIGER":

                break;
            default:
                Toast.makeText(this, getString(R.string.operation), Toast.LENGTH_SHORT).show();
                break;
        }
    }



}