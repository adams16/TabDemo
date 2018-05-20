package com.example.adams.tabdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button1:
                Toast.makeText(getApplicationContext(), "Button 1 Pressed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TabActivity1.class);
                startActivity(intent);

            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Button 2 Pressed", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(), TabActivity2.class);
                startActivity(intent1);

        }

    }
}
