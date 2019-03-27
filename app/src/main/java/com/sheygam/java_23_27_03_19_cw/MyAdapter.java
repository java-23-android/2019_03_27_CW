package com.sheygam.java_23_27_03_19_cw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<User> list;
    public int count = 0;

    public MyAdapter() {
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new User("User " + i, "user" + i + "@mail.com"));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            count++;
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_row,parent,false);
        }
        TextView nameTxt = convertView.findViewById(R.id.name_txt);
        TextView emailTxt = convertView.findViewById(R.id.email_txt);
        User curr = list.get(position);
        nameTxt.setText(curr.name);
        emailTxt.setText(curr.email);
        return convertView;
    }
}
