package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buy extends AppCompatActivity implements View.OnClickListener {
    Button btnfl1, btnfl2, btnfl3, btnfl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_buy );
        btnfl1 = findViewById( R.id.btnfl1 );
        btnfl2 = findViewById( R.id.btnfl2 );
        btnfl3 = findViewById( R.id.btnfl3 );
        btnfl4 = findViewById( R.id.btnfl4 );
        btnfl1.setOnClickListener( this );
        btnfl2.setOnClickListener( this );
        btnfl3.setOnClickListener( this );
        btnfl4.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnfl1:
                btnfl1.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity( new Intent( Buy.this, Flower2.class ) );
                    }
                } );
                break;
            case R.id.btnfl2:
                btnfl2.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity( new Intent( Buy.this, Flower4.class ) );
                    }
                } );
                break;
            case R.id.btnfl3:
                btnfl3.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity( new Intent( Buy.this, Flower1.class ) );
                    }
                } );
                break;
            case R.id.btnfl4:
                btnfl4.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity( new Intent( Buy.this, Flower3.class ) );
                    }
                } );
                break;
            default:
                break;


        }

    }
}
