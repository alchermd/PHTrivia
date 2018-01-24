package me.johnalcher.phtrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * This activity launches the PHTrivia quiz app.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is ran when the Submit button is clicked.
     *
     * @param view - the calling View.
     */
    public void sumbitQuiz(View view) {
        String name = fetchName();
        double score = calculateScore();
        String message = name + " scored " + score + "%";

        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * Fetches the user's name.
     *
     * @return the user's name.
     */
    private String fetchName() {
        EditText playerName = (EditText) findViewById(R.id.player_name);
        if (playerName.getText().toString().equals("")) {
            return "Anonymous";
        }

        return playerName.getText().toString();
    }

    /**
     * Calculates the total score based on how the user did on the quiz.
     *
     * @return the total score.
     */
    private double calculateScore() {
        double totalScore = checkAllQuestions();

        return (totalScore / 10) * 100;
    }

    /**
     * Checks all the quiz questions.
     *
     * @return how many answers the user got correct.
     */
    private int checkAllQuestions() {
        int totalScore = 0;

        RadioButton q1Answer = (RadioButton) findViewById(R.id.q1_answer);
        if (q1Answer.isChecked()) {
            totalScore += 1;
        }

        EditText q2Answer = (EditText) findViewById(R.id.q2_answer);
        if (q2Answer.getText().toString().toLowerCase().equals("red")) {
            totalScore += 1;
        }

        RadioButton q3Answer = (RadioButton) findViewById(R.id.q3_answer);
        if (q3Answer.isChecked()) {
            totalScore += 1;
        }

        EditText q4Answer = (EditText) findViewById(R.id.q4_answer);
        if (q4Answer.getText().toString().equals("1912")) {
            totalScore += 1;
        }

        RadioButton q5Answer = (RadioButton) findViewById(R.id.q5_answer);
        if (q5Answer.isChecked()) {
            totalScore += 1;
        }

        RadioButton q6Answer = (RadioButton) findViewById(R.id.q6_answer);
        if (q6Answer.isChecked()) {
            totalScore += 1;
        }

        RadioButton q7Answer = (RadioButton) findViewById(R.id.q7_answer);
        if (q7Answer.isChecked()) {
            totalScore += 1;
        }

        RadioButton q8Answer = (RadioButton) findViewById(R.id.q8_answer);
        if (q8Answer.isChecked()) {
            totalScore += 1;
        }

        RadioButton q9Answer = (RadioButton) findViewById(R.id.q9_answer);
        if (q9Answer.isChecked()) {
            totalScore += 1;
        }

        CheckBox q10WrongAnswer = (CheckBox) findViewById(R.id.q10_wrong_answer);
        if (!q10WrongAnswer.isChecked()) {
            CheckBox q10CorrectAnswer1 = (CheckBox) findViewById(R.id.q10_correct_answer1);
            CheckBox q10CorrectAnswer2 = (CheckBox) findViewById(R.id.q10_correct_answer2);
            CheckBox q10CorrectAnswer3 = (CheckBox) findViewById(R.id.q10_correct_answer3);

            if (q10CorrectAnswer1.isChecked() && q10CorrectAnswer2.isChecked() && q10CorrectAnswer3.isChecked()) {
                totalScore += 1;
            }
        }

        return totalScore;
    }
}
