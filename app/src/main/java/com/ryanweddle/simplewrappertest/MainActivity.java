package com.ryanweddle.simplewrappertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.ryanweddle.sparksdkwrapper.SparkCall;

public class MainActivity extends AppCompatActivity {

    private Button mCallButton;
    private EditText mCallEdit;
    private EditText mTokenEdit;

    public static final String CLASS_TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCallButton = findViewById(R.id.button_call);
        mCallEdit = findViewById(R.id.text_callee);
        mTokenEdit = findViewById(R.id.text_jwt);

        mTokenEdit.setText(DevConstants.EXAMPLE_JWT);
        mCallEdit.setText(DevConstants.EXAMPLE_SPARKID);

        mCallButton.setOnClickListener(view -> {
            Log.i(CLASS_TAG, "Call Button Pressed");

            Intent intent = new Intent(MainActivity.this, SparkCall.class);
            intent.putExtra(SparkCall.INTENT_CALLEE, mCallEdit.getText().toString());
            intent.putExtra(SparkCall.INTENT_JWT, mTokenEdit.getText().toString());

            startActivity(intent);

        });


    }
}