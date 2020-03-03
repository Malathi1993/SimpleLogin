package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {
private TextView Admin;
private EditText Password;
private Button Login;
private TextView Info;
private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Admin=(TextView)findViewById(R.id.tv_admin);
        Password=(EditText) findViewById(R.id.et_password);
        Login=(Button) findViewById(R.id.login);
        Info=(TextView)findViewById(R.id.textView);
        Info.setText("No of Attempts Remaing");


       Login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Validate(Admin.getText().toString(),Password.getText().toString());
           }
       });
    }
private void Validate(String UserName, String UserPassword){
    if((UserName==("Admin"))&&UserPassword==("1234")){
        Intent intent=new Intent(MainActivity.this,SecActivity.class);
        startActivity(intent);
    }
    else{
        counter--;
        Info.setText("No of attempts remaing:"+String.valueOf(counter));
    if(counter==0){
    Login.setEnabled(false);
    }
    }
}
}

