package com.example.sowjireddy.myapp4;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Admin extends AppCompatActivity implements android.view.View.OnClickListener {
    EditText editId;
    Button btnDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_check );
        editId = findViewById( R.id.editId );
        btnDb = findViewById( R.id.btnDb );
        btnDb.setOnClickListener( this );
    }

    @Override
    public void onClick(android.view.View view) {
        if (view == btnDb) {
            if (editId.getText().toString().trim().length() == 0) {
                showMessage( "Error", " Field cannot be blank please enter the value" );
                return;
            }
            String pass=editId.getText().toString();
            if (pass.equals( "1" ))
            {
                    btnDb.setOnClickListener( new android.view.View.OnClickListener() {
                        @Override
                        public void onClick(android.view.View v) {
                            showMessage( "ok", "login success" );
                            startActivity( new Intent( Admin.this, Vieworder.class ) );
                        }
                    } );
                }
            else
            {
                showMessage( "Error", " Wrong password .Please try again!!!" );
            }
            }

    }
    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setCancelable( true );
        builder.setTitle( title );
        builder.setMessage( message );
        builder.show();
    }
}
