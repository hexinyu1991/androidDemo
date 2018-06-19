package com.example.look.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_item, Teacher.getAllTeacher());
        ListView listView = (ListView) findViewById(R.id.teacher_listView);
        listView.setAdapter(teacherAdapter);
    }
}
