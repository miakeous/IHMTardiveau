package com.tse.pierretardiveau.ihm;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    TextInputLayout textInputLayout;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initView();


    }

    private void initView(){
        textInputLayout = findViewById(R.id.inputText);
    }

    public void returnFirstActivity(View view) {
        editText = textInputLayout.getEditText();
       String value = editText.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra("editTextValue", value);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
