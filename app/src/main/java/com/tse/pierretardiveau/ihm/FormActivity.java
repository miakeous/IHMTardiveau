package com.tse.pierretardiveau.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {
@BindView(R.id.activity_edit_edittext_name) EditText editTextName;
@BindView(R.id.activity_edit_button_save) Button buttonSave;
final private static int NAME_REQUEST = 1;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ButterKnife.bind(this);

        buttonSave.setOnClickListener(this);
        }

@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.activity_edit_button_save:
        saveData();
        break;
        }
        }

private void saveData(){
        String name = editTextName.getText().toString();
        if (!name.isEmpty()) {
        DataManager.getInstance().addItem(name);
        finish();
        }
        else {
        Toast.makeText(this, "Veuillez saisir votre nom", Toast.LENGTH_LONG).show();
        }
        }
        }
