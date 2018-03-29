package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flower4 extends AppCompatActivity implements View.OnClickListener {
    Button btnsd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_flower4 );
        btnsd4=findViewById( R.id.btnsd4 );
        btnsd4.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if(view == btnsd4) {
            btnsd4.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Flower4.this, Detail.class ) );
                }
            } );
        }
    }
}
