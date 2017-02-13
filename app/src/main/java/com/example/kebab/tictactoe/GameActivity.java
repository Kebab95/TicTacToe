package com.example.kebab.tictactoe;
import com.example.kebab.tictactoe.model.TicTacToeModel;
import com.example.kebab.tictactoe.View.TicTacToeView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TicTacToeModel.getInstance().resetModel();
    }
}
