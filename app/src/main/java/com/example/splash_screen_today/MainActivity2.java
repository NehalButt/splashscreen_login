package com.example.splash_screen_today;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText username,password;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.button);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unname =username.getText().toString();
                String upass =password.getText().toString();
                if (unname.equals("Admin") && upass.equals("admin")) {
                    Intent i = new Intent(MainActivity2.this, Index.class);
                    i.putExtra("mars","Hello World!");
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity2.this, "Invalid username and password" , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}