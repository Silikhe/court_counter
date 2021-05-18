package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */


    public void displayForTeamA(int score) {
       TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointTeamA(View view){
       scoreTeamA = scoreTeamA += 3;
       displayForTeamA(scoreTeamA);
    }

    public void addTwoPointTeamA(View view){
        scoreTeamA = scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    public void addOnePointTeamA(View view){
        scoreTeamA = scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

   /* team B  */


    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void addThreePointTeamB(View view){
        scoreTeamB = scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointTeamB(View view){
        scoreTeamB = scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    public void addOnePointTeamB(View view){
        scoreTeamB = scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }


    /* Reset */

    public void resetScore (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}