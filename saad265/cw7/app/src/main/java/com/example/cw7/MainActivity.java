package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Pokemon> mypokemons= ArrayList<>();
        mypokemon k1 =new   pokemon( "Bulbasaur",R.drawable.bulbasaur,"78","100","839");
       mypokemon k2 =new  pokemon("charmander",R.drawable.charmander,"997","889","818");
       mypokemons.add(k1);
        mypokemons.add(k2);

    }
}