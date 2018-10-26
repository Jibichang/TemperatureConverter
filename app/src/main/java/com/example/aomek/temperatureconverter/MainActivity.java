package com.example.aomek.temperatureconverter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cButton = findViewById(R.id.button_contoc);
        Button fButton = findViewById(R.id.button_contof);


        final EditText inputEditText = findViewById(R.id.editText_input);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView outputTextView = (TextView)findViewById(R.id.text_output);
                int input = Integer.parseInt(inputEditText.getText().toString());

                double temp = (input - 32)*0.5556;
                String str = String.format("%.0f", temp);
                String resultText =  str + " °C";
                outputTextView.setText(resultText);
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView outputTextView = (TextView)findViewById(R.id.text_output);
                int input = Integer.parseInt(inputEditText.getText().toString());

                double temp = input*1.8 + 32;
                String str = String.format("%.0f", temp);
                String resultText =  str + " °F";
                outputTextView.setText(resultText);
            }
        });
    }
}
