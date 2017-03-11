package com.example.android.final_projectlesson3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void button2 (View view){
        Intent intent =new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void button22(View view){
        boolean ischecked=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.notify_me_checkbox12:
                if(ischecked){
                    RadioButton radioButton=(RadioButton) findViewById(R.id.notify_me_checkbox12);
                    radioButton.setBackgroundColor(Color.RED);
                    Context context = getApplicationContext();
                    CharSequence text = getString((R.string.try_again));
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
            case R.id.notify_me_checkbox22:
                if(ischecked){
                RadioButton radioButton=(RadioButton) findViewById(R.id.notify_me_checkbox22);
                radioButton.setBackgroundColor(Color.GREEN);
                Context context = getApplicationContext();
                CharSequence text = getString((R.string.congratulation));;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                }
                break;
            case R.id.notify_me_checkbox32:
                if (ischecked){
                    RadioButton radioButton=(RadioButton) findViewById(R.id.notify_me_checkbox32);
                    radioButton.setBackgroundColor(Color.RED);
                    Context context = getApplicationContext();
                    CharSequence text = getString((R.string.try_again));
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
        }

    }
    public void button1(View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void button3(View view){
        Intent intent =new Intent(this,Main3Activity.class);
        startActivity(intent);}
}