package com.example.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pre defining the textView
        TextView textView = ((TextView) findViewById(R.id.text));

        // Tap the button to change the color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.green));
            }
        });

        //tap the button to change the background color
        findViewById(R.id.changebackgroundbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.yellow));

            }
        });
        //user can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changetextlabel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the string to "Android is Awesome"
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings


        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to "Hello from Roshan!" id - text
                textView.setText("Hello from Roshan!");
                //2. Reset the color of the text to original color
                textView.setTextColor(getResources().getColor(R.color.black));
                //original text color - black text id - text
                //3. Reset the background color
                // original background color - R.color.blue
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.blue));


            }
        });

        //User can tap "Click to change the custom text" to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text (id - text) to what is in the custom text (id - editText)
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //if the text field is empty, update label with default text string.
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text :)");
                } else {
                    textView.setText(userEnteredText);
                }
            }

        });

    }
}