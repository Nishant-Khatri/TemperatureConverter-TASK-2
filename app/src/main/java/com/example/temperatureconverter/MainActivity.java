package com.example.temperatureconverter;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button convert;
    TextView result,input;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        convert=findViewById(R.id.convert);
        result=findViewById(R.id.result);
        input=findViewById(R.id.input);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Convert on the Go");
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c=input.getText().toString();
                if(!c.isEmpty()) {
                    double cel = Double.parseDouble(c);
                    double res = ((9 * cel) / 5) + 32;
                    String r = res + " °F";
                    result.setText(r);
                }
            }
        });
    }
}