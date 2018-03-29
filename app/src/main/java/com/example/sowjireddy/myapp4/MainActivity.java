package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnStart = findViewById( R.id.btnStart );
        btnStart.setOnClickListener( this );
    }

    public void onClick(View view) {
        if (view == btnStart) {
            btnStart.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( MainActivity.this, Option.class ) );
                }
            } );
        }
    }

}
