package com.example.kebab.tictactoe.model;

/**
 * Created by Kebab on 2017.02.13..
 */

class TicTacToeModel {
    private static TicTacToeModel instance = null;
    private TicTacToeModel() {
    }
    public static TicTacToeModel getInstance() {
        if (instance == null) {
            instance = new TicTacToeModel();
        }
        return instance;
    }
    public static final short EMPTY = 0;
    public static final short CIRCLE = 1;
    public static final short CROSS = 2;
    private short[][] model = {
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };
    private short nextPlayer = CIRCLE;

    public static void resetModel(){
        getInstance().model = new short[][]{{EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY}};
    }
    public static short getFieldContent(int x,int y){
        return getInstance().model[x][y];
    }
    public static void setFieldContent(int x,int y, short content){
        getInstance().model[x][y] = content;
    }
    public static short getNextPlayer(){
        return getInstance().nextPlayer;
    }
    public static void changeNextPlayer(){
        if (getInstance().getNextPlayer()==CIRCLE){
            getInstance().nextPlayer = CROSS;
        }
        else if (getInstance().getNextPlayer() ==CROSS){
            getInstance().nextPlayer = CIRCLE;
        }
    }
}
