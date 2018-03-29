package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flower3 extends AppCompatActivity implements View.OnClickListener {
    Button btnsd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_flower3 );
        btnsd3=findViewById( R.id.btnsd3 );
        btnsd3.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if(view == btnsd3) {
            btnsd3.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Flower3.this, Detail.class ) );
                }
            } );
        }
    }
}
