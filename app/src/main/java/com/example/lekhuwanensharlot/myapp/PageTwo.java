package com.example.lekhuwanensharlot.myapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PageTwo extends Activity {
TextView txtinfor,txtcompany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
        txtinfor=(TextView)findViewById(R.id.txtInformation);
       txtcompany=(TextView)findViewById(R.id.txtCompany);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");
        String company=intent.getStringExtra("company");

        txtinfor.setText(name + " "+surname);
        txtcompany.setText(" "+company);

    }
}
