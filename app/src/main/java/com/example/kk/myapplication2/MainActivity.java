package com.example.kk.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView point_a = findViewById(R.id.point_a);
        final TextView point_b = findViewById(R.id.point_b);
        Button reset = findViewById(R.id.reset);

        Button adda_1 = findViewById(R.id.adda_1);
        adda_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_a.getText().toString())+1;
                point_a.setText(String.valueOf(point));
            }
        });

        Button adda_2 = findViewById(R.id.adda_2);
        adda_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_a.getText().toString())+2;
                point_a.setText(String.valueOf(point));
            }
        });

        Button adda_3 = findViewById(R.id.adda_3);
        adda_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_a.getText().toString())+3;
                point_a.setText(String.valueOf(point));
            }
        });

        Button addb_1 = findViewById(R.id.addb_1);
        addb_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_b.getText().toString())+1;
                point_b.setText(String.valueOf(point));
            }
        });

        Button addb_2 = findViewById(R.id.addb_2);
        addb_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_b.getText().toString())+2;
                point_b.setText(String.valueOf(point));
            }
        });

        Button addb_3 = findViewById(R.id.addb_3);
        addb_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int point = Integer.parseInt(point_b.getText().toString())+3;
                point_b.setText(String.valueOf(point));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point_a.setText("0");
                point_b.setText("0");
            }
        });

    }

}
