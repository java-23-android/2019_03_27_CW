package com.sheygam.java_23_27_03_19_cw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.my_list);
        adapter = new MyAdapter();
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        findViewById(R.id.button)
                .setOnClickListener(v -> {
                    adapter.addUser(new User("Super user","super@mail.com"),2);
                });
//        List<String> names = new ArrayList<>();
//        names.add("Vasya");
//        names.add("Petya");
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
//        list.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        User user = (User) adapter.getItem(position);
        Toast.makeText(this, "Clicked " + user.name, Toast.LENGTH_SHORT).show();
    }
}
