package com.example.kebab.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button about = (Button)findViewById(R.id.about);
        Button game = (Button)findViewById(R.id.game);
        Button highscore = (Button)findViewById(R.id.highscore);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,GameActivity.class);
                startActivity(i);
            }
        });
    }
}
