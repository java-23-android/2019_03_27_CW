package com.sheygam.java_23_27_03_19_cw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
                .setOnClickListener(v -> Toast.makeText(MainActivity.this, "Count " + adapter.count, Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        User user = (User) adapter.getItem(position);
        Toast.makeText(this, "Clicked " + user.name, Toast.LENGTH_SHORT).show();
    }
}
