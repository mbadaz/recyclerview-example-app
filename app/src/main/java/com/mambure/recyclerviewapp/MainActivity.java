package com.mambure.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvPeople);
        List<Person> people = initializeData();

        // TODO - Create Recyclerview Adapter and Initialize with data
        PersonAdapter adapter = new PersonAdapter(people);

        // TODO - Add adapter to the recyclerview
        recyclerView.setAdapter(adapter);

        // TODO - Add a layout manager to the recyclerview
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

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
