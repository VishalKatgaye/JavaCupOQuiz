package com.vishalkatgaye.javacupoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is used to submit the answers
     */
    public void submit(View view) {
        // This lines will show the description text after submit button is pressed.
        TextView que1_describe = (TextView) findViewById(R.id.que1_ans_description);
        que1_describe.setVisibility(View.VISIBLE);

        TextView que2_describe = (TextView) findViewById(R.id.que2_ans_description);
        que2_describe.setVisibility(View.VISIBLE);

        TextView que3_describe = (TextView) findViewById(R.id.que3_ans_description);
        que3_describe.setVisibility(View.VISIBLE);

        TextView que4_describe = (TextView) findViewById(R.id.que4_ans_description);
        que4_describe.setVisibility(View.VISIBLE);

        TextView que5_describe = (TextView) findViewById(R.id.que5_ans_description);
        que5_describe.setVisibility(View.VISIBLE);

        TextView que6_describe = (TextView) findViewById(R.id.que6_ans_description);
        que6_describe.setVisibility(View.VISIBLE);

        TextView que7_describe = (TextView) findViewById(R.id.que7_ans_description);
        que7_describe.setVisibility(View.VISIBLE);

        TextView que8_describe = (TextView) findViewById(R.id.que8_ans_description);
        que8_describe.setVisibility(View.VISIBLE);

        TextView que9_describe = (TextView) findViewById(R.id.que9_ans_description);
        que9_describe.setVisibility(View.VISIBLE);

        TextView que10_describe = (TextView) findViewById(R.id.que10_ans_description);
        que10_describe.setVisibility(View.VISIBLE);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setVisibility(View.GONE);

        Button reset = (Button) findViewById(R.id.reset);
        reset.setVisibility(View.VISIBLE);

        Button share = (Button) findViewById(R.id.share);
        share.setVisibility(View.VISIBLE);

        boolean ques1Ans = onQue1();
        boolean ques2Ans = onQue2();
        boolean ques3Ans = onQue3();
        boolean ques4Ans = onQue4();
        boolean ques5Ans = onQue5();
        boolean ques6Ans = onQue6();
        boolean ques7Ans = onQue7();
        boolean ques8Ans = onQue8();
        boolean ques9Ans = onQue9();
        boolean ques10Ans = onQue10();

        if (ques1Ans) {
            scoreCounter += 1;
        }
        if (ques2Ans) {
            scoreCounter += 1;
        }
        if (ques3Ans) {
            scoreCounter += 1;
        }
        if (ques4Ans) {
            scoreCounter += 1;
        }
        if (ques5Ans) {
            scoreCounter += 1;
        }
        if (ques6Ans) {
            scoreCounter += 1;
        }
        if (ques7Ans) {
            scoreCounter += 1;
        }
        if (ques8Ans) {
            scoreCounter += 1;
        }
        if (ques9Ans) {
            scoreCounter += 1;
        }
        if (ques10Ans) {
            scoreCounter += 1;
        }

        if (scoreCounter > 0 && scoreCounter <= 4) {
            Toast.makeText(this, "Your Score is :  " + scoreCounter + " Good work", Toast.LENGTH_LONG).show();
        } else if (scoreCounter > 4 && scoreCounter < 8) {
            Toast.makeText(this, "Making Progress! Your Score is :  " + scoreCounter + " Keep up the good work", Toast.LENGTH_LONG).show();
        } else if (scoreCounter >= 8) {
            Toast.makeText(this, "Great Your Score is :  " + scoreCounter + " Congratulatins!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Sorry! Your Score is :  " + scoreCounter + " Try again.", Toast.LENGTH_LONG).show();
        }
    }


    /**
     * This method resets all functions.
     */
    public void reset(View view) {
        scoreCounter = 0;

        Button submit = (Button) findViewById(R.id.submit);
        submit.setVisibility(View.VISIBLE);

        Button reset = (Button) findViewById(R.id.reset);
        reset.setVisibility(View.GONE);

        Button share = (Button) findViewById(R.id.share);
        share.setVisibility(View.GONE);

        RadioGroup group1 = (RadioGroup) findViewById(R.id.que1_option_group);
        group1.clearCheck();

        RadioGroup group2 = (RadioGroup) findViewById(R.id.que2_option_group);
        group2.clearCheck();

        RadioGroup group3 = (RadioGroup) findViewById(R.id.que3_option_group);
        group3.clearCheck();

        CheckBox que4First = (CheckBox) findViewById(R.id.que4_one);
        que4First.setChecked(false);

        CheckBox que4Second = (CheckBox) findViewById(R.id.que4_two);
        que4Second.setChecked(false);

        CheckBox que4Third = (CheckBox) findViewById(R.id.que4_three);
        que4Third.setChecked(false);

        CheckBox que4Fourth = (CheckBox) findViewById(R.id.que4_four);
        que4Fourth.setChecked(false);

        CheckBox que4Fifth = (CheckBox) findViewById(R.id.que4_five);
        que4Fifth.setChecked(false);

        RadioGroup group5 = (RadioGroup) findViewById(R.id.que5_option_group);
        group5.clearCheck();

        RadioGroup group6 = (RadioGroup) findViewById(R.id.que6_option_group);
        group6.clearCheck();

        RadioGroup group7 = (RadioGroup) findViewById(R.id.que7_option_group);
        group7.clearCheck();

        CheckBox que8First = (CheckBox) findViewById(R.id.que8_one);
        que8First.setChecked(false);

        CheckBox que8Second = (CheckBox) findViewById(R.id.que8_two);
        que8Second.setChecked(false);

        CheckBox que8Third = (CheckBox) findViewById(R.id.que8_three);
        que8Third.setChecked(false);

        CheckBox que8Fourth = (CheckBox) findViewById(R.id.que8_four);
        que8Fourth.setChecked(false);

        EditText que9Answer = (EditText) findViewById(R.id.que9_ans);
        que9Answer.getText().clear();

        EditText que10Answer = (EditText) findViewById(R.id.que10_ans);
        que10Answer.getText().clear();

        TextView que1_describe = (TextView) findViewById(R.id.que1_ans_description);
        que1_describe.setVisibility(View.GONE);

        TextView que2_describe = (TextView) findViewById(R.id.que2_ans_description);
        que2_describe.setVisibility(View.GONE);

        TextView que3_describe = (TextView) findViewById(R.id.que3_ans_description);
        que3_describe.setVisibility(View.GONE);

        TextView que4_describe = (TextView) findViewById(R.id.que4_ans_description);
        que4_describe.setVisibility(View.GONE);

        TextView que5_describe = (TextView) findViewById(R.id.que5_ans_description);
        que5_describe.setVisibility(View.GONE);

        TextView que6_describe = (TextView) findViewById(R.id.que6_ans_description);
        que6_describe.setVisibility(View.GONE);

        TextView que7_describe = (TextView) findViewById(R.id.que7_ans_description);
        que7_describe.setVisibility(View.GONE);

        TextView que8_describe = (TextView) findViewById(R.id.que8_ans_description);
        que8_describe.setVisibility(View.GONE);

        TextView que9_describe = (TextView) findViewById(R.id.que9_ans_description);
        que9_describe.setVisibility(View.GONE);

        TextView que10_describe = (TextView) findViewById(R.id.que10_ans_description);
        que10_describe.setVisibility(View.GONE);
    }

    /**
     * This method returns true or false from question 1.
     */
    private boolean onQue1() {
//        Toast wrong = Toast.makeText(this,"Sorry Wrong Answer!",Toast.LENGTH_LONG);
//        Toast right = Toast.makeText(this,"Congratulations! This is Right Answer",Toast.LENGTH_SHORT);
        RadioButton que1First = (RadioButton) findViewById(R.id.que1_one);
        RadioButton que1Second = (RadioButton) findViewById(R.id.que1_two);
        RadioButton que1Three = (RadioButton) findViewById(R.id.que1_three);
        RadioButton que1Four = (RadioButton) findViewById(R.id.que1_four);

        if (que1Three.isChecked()) {
            return true;
        }
        if (que1First.isChecked()) {
            return false;
        }
        if (que1Second.isChecked()) {
            return false;
        }
        if (que1Four.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 2.
     */
    private boolean onQue2() {
        RadioButton que2First = (RadioButton) findViewById(R.id.que2_one);
        RadioButton que2Second = (RadioButton) findViewById(R.id.que2_two);
        RadioButton que2Third = (RadioButton) findViewById(R.id.que2_three);
        RadioButton que2Four = (RadioButton) findViewById(R.id.que2_four);

        if (que2Four.isChecked()) {
            return true;
        }
        if (que2First.isChecked()) {
            return false;
        }
        if (que2Second.isChecked()) {
            return false;
        }
        if (que2Third.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 3.
     */
    private boolean onQue3() {
        RadioButton que3First = (RadioButton) findViewById(R.id.que3_one);
        RadioButton que3Second = (RadioButton) findViewById(R.id.que3_two);
        RadioButton que3Third = (RadioButton) findViewById(R.id.que3_three);
        RadioButton que3Four = (RadioButton) findViewById(R.id.que3_four);
        if (que3Second.isChecked()) {
            return true;
        }
        if (que3First.isChecked()) {
            return false;
        }
        if (que3Third.isChecked()) {
            return false;
        }
        if (que3Four.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 4.
     */
    private boolean onQue4() {
        CheckBox que4First = (CheckBox) findViewById(R.id.que4_one);
        CheckBox que4Second = (CheckBox) findViewById(R.id.que4_two);
        CheckBox que4Third = (CheckBox) findViewById(R.id.que4_three);
        CheckBox que4Fourth = (CheckBox) findViewById(R.id.que4_four);
        CheckBox que4Fifth = (CheckBox) findViewById(R.id.que4_five);

        if (que4First.isChecked() && que4Second.isChecked() && que4Third.isChecked() && que4Fourth.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Third.isChecked() && que4Fourth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Third.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Fourth.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Third.isChecked() && que4Fourth.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4Second.isChecked() && que4Third.isChecked() && que4Fourth.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Third.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Fourth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Second.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Third.isChecked() && que4Fourth.isChecked())
            return false;
        else if (que4First.isChecked() && que4Third.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4Second.isChecked() && que4Third.isChecked() && que4Fourth.isChecked())
            return false;
        else if (que4Second.isChecked() && que4Third.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4Third.isChecked() && que4Fourth.isChecked() && que4Fifth.isChecked())
            return false;
        else if (que4Fourth.isChecked() && que4Fifth.isChecked()) {
            return true;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 5.
     */
    private boolean onQue5() {
        RadioButton que5First = (RadioButton) findViewById(R.id.que5_one);
        RadioButton que5Second = (RadioButton) findViewById(R.id.que5_two);
        RadioButton que5Third = (RadioButton) findViewById(R.id.que5_three);
        RadioButton que5Four = (RadioButton) findViewById(R.id.que5_four);
        if (que5First.isChecked()) {
            return true;
        }
        if (que5Second.isChecked()) {
            return false;
        }
        if (que5Third.isChecked()) {
            return false;
        }
        if (que5Four.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 6.
     */
    private boolean onQue6() {
        RadioButton que6First = (RadioButton) findViewById(R.id.que6_one);
        RadioButton que6Second = (RadioButton) findViewById(R.id.que6_two);
        RadioButton que6Third = (RadioButton) findViewById(R.id.que6_three);
        RadioButton que6Four = (RadioButton) findViewById(R.id.que6_four);
        if (que6First.isChecked()) {
            return true;
        }
        if (que6Second.isChecked()) {
            return false;
        }
        if (que6Third.isChecked()) {
            return false;
        }
        if (que6Four.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 7.
     */
    private boolean onQue7() {
        RadioButton que7First = (RadioButton) findViewById(R.id.que7_one);
        RadioButton que7Second = (RadioButton) findViewById(R.id.que7_two);
        RadioButton que7Third = (RadioButton) findViewById(R.id.que7_three);
        RadioButton que7Four = (RadioButton) findViewById(R.id.que7_four);
        if (que7First.isChecked()) {
            return true;
        }
        if (que7Second.isChecked()) {
            return false;
        }
        if (que7Third.isChecked()) {
            return false;
        }
        if (que7Four.isChecked()) {
            return false;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 8.
     */
    private boolean onQue8() {
        CheckBox que8First = (CheckBox) findViewById(R.id.que8_one);
        CheckBox que8Second = (CheckBox) findViewById(R.id.que8_two);
        CheckBox que8Third = (CheckBox) findViewById(R.id.que8_three);
        CheckBox que8Fourth = (CheckBox) findViewById(R.id.que8_four);
        if (que8First.isChecked() && que8Second.isChecked() && que8Third.isChecked() && que8Fourth.isChecked()) {
            return false;
        } else if (que8First.isChecked() && que8Second.isChecked() && que8Third.isChecked())
            return false;
        else if (que8First.isChecked() && que8Second.isChecked() && que8Fourth.isChecked())
            return false;
        else if (que8First.isChecked() && que8Second.isChecked()) {
            return true;
        } else
            return false;
    }

    /**
     * This method returns true or false from question 9.
     */
    private boolean onQue9() {
        EditText que9Answer = (EditText) findViewById(R.id.que9_ans);
        String answer = que9Answer.getText().toString();
        if (answer.contains("2 3")) {
            return true;
        }
        else
            return false;
    }

    /**
     * This method returns true or false from question 10.
     */
    private boolean onQue10() {
        EditText que10Answer = (EditText) findViewById(R.id.que10_ans);
        String answer = que10Answer.getText().toString();
        if (answer.toLowerCase().contains("platform dependent")) {
            return true;
        }
        else if(answer.toLowerCase().contains("dependent"))
            return true;
        else
            return false;
    }

    /**
     * This method share the score with other apps
     */
    public void share(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "My score in Java test is " + scoreCounter+" out of 10");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}