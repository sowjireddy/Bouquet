package com.example.sowjireddy.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends AppCompatActivity implements View.OnClickListener {
    Button btnAdmin, btnCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_option );
        btnAdmin = findViewById( R.id.btnAdmin );
        btnCustomer = findViewById( R.id.btnCustomer );
        btnAdmin.setOnClickListener( this );
        btnCustomer.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if (view == btnAdmin) {
            btnAdmin.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Option.this, Admin.class ) );
                }
            } );
        }
        if (view == btnCustomer) {
            btnCustomer.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Option.this, Buy.class ) );
                }
            } );
        }
    }

}

