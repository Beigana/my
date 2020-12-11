package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    private View view;
    Button b_play, b_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendMessage(view);
        b_play=(Button) findViewById(R.id.playbutton);
        b_stop=(Button) findViewById(R.id.stopbutton);


        b_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Main3Activity.this, MyService.class));
            }
        });
        b_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Main3Activity.this, MyService.class));
            }
        });

    }
    public void sendMessage(View view) {
        EditText message = (EditText)findViewById(R.id.message);
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText("");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.me,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //responding to menu items selected
        switch(item.getItemId()){
            case R.id.fore:
                startActivity(new Intent(this,active1.class));
                return true;
            case R.id.bac:
                startActivity(new Intent(this,active2.class));
                return true;

            default:
                return true;

        }

    }
}

