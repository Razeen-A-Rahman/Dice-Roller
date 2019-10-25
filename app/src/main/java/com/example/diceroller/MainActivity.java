package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConfigureAddButton();
        ConfigurePlayButton();
        ConfigureRollButton();
    }

    public int roll_the_dice(){
        Random r = new Random();
        int Number = r.nextInt(6);
        return Number;
    }

    private void ConfigureAddButton(){
        Button AddButton = (Button) findViewById(R.id.Add);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, New_Dicebraker.class));
            }
        });
    }

    private void ConfigurePlayButton(){
        Button PlayButton = (Button) findViewById(R.id.Play);
        PlayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView Output =findViewById(R.id.Output);
                String[] Questions = {"If you could go anywhere in the world, where would you go?",
                        "If you were stranded on a desert island, what three things would you want to take with you?",
                        "If you could eat only one food for the rest of your life, what would that be?",
                        "If you won a million dollars, what is the first thing you would buy?",
                        "If you could spend the day with one fictional character, who would it be?",
                        "If you found a magic lantern and a genie gave you three wishes, what would you wish?"};
                Output.setText(Questions[roll_the_dice()]);
            }
        });
    }

    private void ConfigureRollButton(){
        Button RollButton = (Button) findViewById(R.id.Roll);
        RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Output = findViewById(R.id.Output);
                Output.setText(Integer.toString(roll_the_dice()+1));
            }
        });
    }

}