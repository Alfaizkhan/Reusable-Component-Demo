package com.alfaizkhan.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import com.alfaizkhan.resublecomponent.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ShowToast.show( this, "Hello, toast." );
    }
}