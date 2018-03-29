package com.example.sowjireddy.myapp4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vieworder extends AppCompatActivity {//implements View.OnClickListener {
    Button btnDbb;
    TextView textView3;
   // SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_final );
        btnDbb = findViewById( R.id.btnDb );
        //btnDbb.setOnClickListener( this );
       //db = openOrCreateDatabase( "BOTIQUEDB", Context.MODE_PRIVATE, null );
        //db.execSQL( "CREATE TABLE IF NOT EXISTS FLOWERS(contact VARCHAR,name VARCHAR)");//,address VARCHAR);" );


    }

   /* @Override
public void onClick(View view) {
        if (view == btnDbb) {
            Cursor res = db.rawQuery( "select * from FLOWERS1", null );
            textView3.setText( "" );
            //while (res.moveToNext()) {
                textView3.setText( (CharSequence) res );
             //}

        }
    }*/


}