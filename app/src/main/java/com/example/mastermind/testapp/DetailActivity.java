package com.example.mastermind.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;

/**
 * Created by Kostas on 7/5/2018.
 */

public class DetailActivity extends AppCompatActivity {

    SimpleDateFormat format;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txt_title = findViewById(R.id.txt_title);
        TextView txt_date = findViewById(R.id.txt_date);
        TextView txt_description = findViewById(R.id.txt_description);
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        JobOffer jobOffer = (JobOffer) getIntent().getSerializableExtra("jobOffer");

        txt_title.setText(jobOffer.getTitle());
        txt_date.setText(jobOffer.getDate().toString());
        txt_description.setText(jobOffer.getDownloaded());



    }
}
