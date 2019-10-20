package android.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitResults(View view) {
        CheckBox question1Correct = findViewById(R.id.Q1C1);
        boolean isChecked1 = question1Correct.isChecked();

        CheckBox question2Correct = findViewById(R.id.Q2C4);
        boolean isChecked2 = question2Correct.isChecked();

        CheckBox question3Correct = findViewById(R.id.Q3C4);
        boolean isChecked3 = question3Correct.isChecked();

        CheckBox question4Correct = findViewById(R.id.Q3C2);
        boolean isChecked4 = question4Correct.isChecked();

        CheckBox question5Correct = findViewById(R.id.Q5C3);
        boolean isChecked5 = question5Correct.isChecked();

        displayScore(calculateScore(isChecked1, isChecked2, isChecked3,
                isChecked4, isChecked5));
    }

    public int calculateScore(boolean isChecked1, boolean isChecked2, boolean isChecked3,
                              boolean isChecked4, boolean isChecked5) {
        int grade = 0;

        //Increments variable 'grade' by 1 if correct
        if (isChecked1) {
            grade = grade + 1;
        }

        if (isChecked2) {
            grade = grade + 1;
        }

        if (isChecked3) {
            grade = grade + 1;
        }

        if (isChecked4) {
            grade = grade + 1;
        }

        if (isChecked5) {
            grade = grade + 1;
        }

        //Calculates final score
        return grade;


    }

    //Display the results value
    private void displayScore(int grade) {
        TextView scoreTextView = findViewById(R.id.score);
        scoreTextView.setText(grade + "out of 5");
    }
}