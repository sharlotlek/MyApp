package com.example.lekhuwanensharlot.myapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    Button btnSubmit;
    EditText name,surname,company;
    String strname ;
    String strsurname;
    String strCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assigning my variables
        btnSubmit=(Button)findViewById(R.id.btnsubmit);
        name=(EditText)findViewById(R.id.txtname);
        surname=(EditText)findViewById(R.id.txtsurname);
        company=(EditText)findViewById(R.id.txtCompany);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                strname = name.getText().toString();
                strsurname=surname.getText().toString();
                strCompany=company.getText().toString();
                Intent intent = new Intent(MainActivity.this, PageTwo.class);
                intent.putExtra("name", strname);
                intent.putExtra("surname", strsurname);
                intent.putExtra("company", strCompany);
                startActivity(intent);
                //startActivity(intent);
            }
        });
    }

    public void passingInformation()
    {

    }

    public void AssignVariables()
    {

    }
}
