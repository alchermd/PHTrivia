package me.johnalcher.phtrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

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
        String name = getName();
        int score = calculateScore();

        Toast toast = Toast.makeText(this, name, Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * // TODO: implement this method.
     * Fetches the user's name.
     * @return the user's name.
     */
    private String fetchName() {
        return "Alcher";
    }

    /**
     * // TODO: implement this method.
     * Calculates the total score based on how the user did on the quiz.
     * @return the total score.
     */
    private int calculateScore() {
        return 42;
    }
}
