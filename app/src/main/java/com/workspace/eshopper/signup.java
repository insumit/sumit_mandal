package com.workspace.eshopper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        input = findViewById(R.id.nametext);
        input = findViewById(R.id.mailtext);
        input = findViewById(R.id.passtext);
        input = findViewById(R.id.conftext);
        Button bt = findViewById(R.id.sign_up);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(signup.this, "Please add some text.", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(signup.this, SignIn.class));
                    Toast.makeText(getApplicationContext(), "Congratulations! You've successfully signed up.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
