package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flower1 extends AppCompatActivity implements View.OnClickListener {
    Button btnsd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_flower1 );
        btnsd1=findViewById( R.id.btnsd1 );
        btnsd1.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if(view == btnsd1) {
            btnsd1.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Flower1.this, Detail.class ) );
                }
            } );
        }
    }
}
