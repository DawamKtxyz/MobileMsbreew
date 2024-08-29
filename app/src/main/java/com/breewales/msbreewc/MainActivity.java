package com.breewales.msbreewc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtEmail, edtPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtEmailDanPassword);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strEmail = edtEmail.getText().toString();
                String strPassword = edtPassword.getText().toString();

//                txtTampil.setText(strEmail + "\n" + strPassword);
                Toast.makeText(getApplicationContext(), "Email: " + strEmail + "\nPassword: " + strPassword, Toast.LENGTH_SHORT).show();
            }
        });

    }
}