package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Loading...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text,
                duration); toast.show();

    }
    public void StartNewActivity(View view){
        Intent intent = new Intent(MainActivity.this,feed.class);
        startActivity(intent);

    }
}
