package com.example.metflix.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.metflix.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userEdt, passEdt;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initView();
    }
    private void initView(){
        userEdt = findViewById(R.id.userEdit);
        passEdt = findViewById(R.id.passEdit);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(v ->{
                /*if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please Fill your use and password", Toast.LENGTH_SHORT).show();
                }else if(userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }*/
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        });
    }
}