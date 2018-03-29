package com.example.sowjireddy.myapp4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail extends AppCompatActivity implements View.OnClickListener {
    EditText editContact,editName,editAddress;
    Button btnAdd,btnNext;

    SQLiteDatabase db;

    //String contact,name,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );
        editContact= findViewById(R.id.editContact);
        editName= findViewById(R.id.editName);
        editAddress= findViewById(R.id.editAddress);
        btnAdd= findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnNext= findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        db=openOrCreateDatabase("BOTIQUEDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS FLOWERS1(contact VARCHAR,name VARCHAR)");

    }

    @Override
    public void onClick(View view) {
        if (view == btnAdd) {
            if (editContact.getText().toString().trim().length() == 0 || editName.getText().toString().trim().length() == 0
                    || editAddress.getText().toString().trim().length() == 0)
            {
                showMessage( "Error", "Please enter all values" );
                return;
            }
            db.execSQL("INSERT INTO FLOWERS1(contact,name) VALUES('"+editContact.getText()+"','"+editName.getText()+"');");
            showMessage( "Success", "Record added" );
            clearText();
        }
        if(view == btnNext) {
            btnNext.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity( new Intent( Detail.this, Final.class ) );
                }
            } );
        }

    }

    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setCancelable( true );
        builder.setTitle( title );
        builder.setMessage( message );
        builder.show();
    }

    public void clearText() {
        editContact.setText( "" );
        editName.setText( "" );
        editAddress.setText( "" );
        editContact.requestFocus();
    }
}
