package com.example.aomek.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

                double result = conToC(input);
                if((result%1 == 0)) { outputTextView.setText((int)result + ""); }
                else { outputTextView.setText(result + ""); }
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView outputTextView = (TextView)findViewById(R.id.text_output);
                int input = Integer.parseInt(inputEditText.getText().toString());

                double result = conToF(input);
                if((result%1 == 0)) { outputTextView.setText((int)result + ""); }
                else { outputTextView.setText(result + ""); }
            }
        });
    }

    public double conToC(int input){
        return (double)Math.round(((input - 32)*0.5556)*100)/100D;
    }

    public double conToF(int input){
        return (double)Math.round((input*1.80 + 32)*100)/100D;
    }
}
