package com.example.look.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeacherDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_detail);

        int imageId = getIntent().getIntExtra("teacher_image", 0);
        String desc = getIntent().getStringExtra("teacher_desc");

        ImageView imageView = (ImageView)findViewById(R.id.teacher_large_imageView);
        TextView textView = (TextView)findViewById(R.id.teacher_desc_textView);

        imageView.setImageResource(imageId);
        textView.setText(desc);
    }
}
