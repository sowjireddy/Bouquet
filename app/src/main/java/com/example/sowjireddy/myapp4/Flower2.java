package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flower2 extends AppCompatActivity implements View.OnClickListener {
    Button btnsd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_flower2 );
        btnsd2=findViewById( R.id.btnsd2 );
        btnsd2.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if(view == btnsd2) {
            btnsd2.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Flower2.this, Detail.class ) );
                }
            } );
        }
    }
}
