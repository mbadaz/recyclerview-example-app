package com.mambure.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Person> people = initializeData();

        // TODO - Create Recyclerview Adapter and Initialize with data

        // TODO - Add adapter to the recyclerview

        // TODO - Add a layout manager to the recyclerview

    }

    private List<Person> initializeData() {
        List<Person> personList = new ArrayList<>();

        String[] names = getResources().getStringArray(R.array.names);
        String[] sex = getResources().getStringArray(R.array.sex);
        String[] ages = getResources().getStringArray(R.array.age);

        for (int x = 0; x < 17; x++) {
            Person person = new Person();
            person.setAge(ages[x]);
            person.setName(names[x]);
            person.setSex(sex[x]);
            personList.add(person);
        }
        return personList;
    }
}
