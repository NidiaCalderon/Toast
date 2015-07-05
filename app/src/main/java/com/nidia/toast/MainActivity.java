package com.nidia.toast;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BasicToast (View view){
        Context context = getApplicationContext();
        CharSequence text = "Este es un toast SMS";
        int duration= Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText (context,text,duration);

        toast.show();
    }
}
