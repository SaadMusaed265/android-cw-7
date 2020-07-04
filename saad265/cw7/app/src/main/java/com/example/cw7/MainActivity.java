package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemon knafa =new   pokemon( "knafa","90","78","100","839");
       pokemon knafa2 =new  pokemon("knafa2","666","997","889","818")
    }
}