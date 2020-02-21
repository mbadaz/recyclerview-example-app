package com.mambure.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {
    List<Person> people;

    public PersonAdapter(List<Person> people) {
        this.people = people;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).inflate(R.layout.person_list_item, parent, false);
        return new PersonHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder holder, int position) {
        Person person = people.get(position);
        holder.sex.setText(person.getSex());
        holder.name.setText(person.getName());
        holder.age.setText(person.getAge());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public class PersonHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView sex;
        TextView age;
        public PersonHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtName);
            sex = itemView.findViewById(R.id.txtSex);
            age = itemView.findViewById(R.id.txtAge);
        }
    }

}
