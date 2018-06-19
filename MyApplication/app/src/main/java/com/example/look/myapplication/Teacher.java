package com.example.look.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int imageId;
    private String desc;

    public Teacher(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

    public static List<Teacher> getAllTeacher() {
        List<Teacher> tearchers = new ArrayList<Teacher>();
        tearchers.add(new Teacher("ceshi1", R.drawable.pipi, "为了蓝色而清净的世界"));
        tearchers.add(new Teacher("ceshi2", R.drawable.pikaqiu, "去吧 皮卡丘"));
        return tearchers;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
