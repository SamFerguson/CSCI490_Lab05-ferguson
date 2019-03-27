package com.example.csci490_lab_05;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private EditText email;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        email = findViewById(R.id.editText3);
        save = findViewById(R.id.button);
        SharedPreferences Hello = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = Hello.edit();
        name.setText(Hello.getString("name", ""));
        pass.setText(Hello.getString("pass", ""));
        email.setText(Hello.getString("email", ""));
        edit.apply();


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences Hello = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = Hello.edit();
                edit.putString("name", name.getText().toString());
                edit.putString("pass", name.getText().toString());
                edit.putString("email", name.getText().toString());
                edit.apply();
            }
        });


    }
}
