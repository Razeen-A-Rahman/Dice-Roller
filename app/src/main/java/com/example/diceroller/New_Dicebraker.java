package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class New_Dicebraker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__dicebraker);

        ConfigureCancelButton();
        ConfigureAddButton();
    }

    private void ConfigureCancelButton(){
        Button CancelButton = (Button) findViewById(R.id.Cancel);
        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void ConfigureAddButton(){
        Button AddButton = (Button) findViewById(R.id.Add);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Input = findViewById(R.id.Input);
                Intent intent = new Intent();
                intent.putExtra(Input.getText().toString(),1);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}