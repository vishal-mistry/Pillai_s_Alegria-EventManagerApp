package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class login_pg extends AppCompatActivity implements View.OnClickListener{

    EditText loginid,password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pg);

        loginid = (EditText)findViewById(R.id.l_name);
        password = (EditText)findViewById(R.id.l_pass);

        buttonLogin = (Button)findViewById(R.id.btn_login);
        buttonLogin.setOnClickListener(this);
    }

    public void dat(View view) {
        Intent intent2 = new Intent(this, database.class);
        startActivity(intent2);
    }

    @Override
    public void onClick(View v) {

        String id = loginid.getText().toString().trim();
        String pass = password.getText().toString().trim();
        String id1="admin1";String id2="admin2";String id3="admin3";String id4="admin4";
        String pass1="PASSWORD";String pass2="12345678";String pass3="pass1234";String pass4="87654321";

        //Define what to do when button is clicked
        if((id.equals(id1) && pass.equals(pass1)) || (id.equals(id2) && pass.equals(pass2)) || (id.equals(id3) && pass.equals(pass3)) || (id.equals(id4) && pass.equals(pass4)))
        {  Toast.makeText(getBaseContext(),"Welcome "+id+".",Toast.LENGTH_SHORT).show();
            dat(v);
            }
            else{
                Toast.makeText(getBaseContext(),"Incorrect ID or Password.Please try again.",Toast.LENGTH_SHORT).show();
            }

        }
    }