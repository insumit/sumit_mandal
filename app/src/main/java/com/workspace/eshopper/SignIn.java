package com.workspace.eshopper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends Activity {
    EditText input;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        input = (EditText)findViewById(R.id.editText);
        input = (EditText)findViewById(R.id.editText2);
        check = (Button)findViewById(R.id.btnsign);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals(""))
                {
                    Toast.makeText(SignIn.this,"Please add some text.",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    startActivity(new Intent(SignIn.this, homepage.class));
                }
            }
        });
    }
}
