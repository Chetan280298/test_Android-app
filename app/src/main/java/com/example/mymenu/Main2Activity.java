package com.example.mymenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Main2Activity extends AppCompatActivity {

ListView listView;
ArrayAdapter arrayAdapter;
String[] contacts={"ABC","DEF","PQR","MNO","XYZ"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.lv);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,contacts);
        listView.setAdapter(arrayAdapter);

        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("call"))
        {
            Toast.makeText(this, item.getTitle()+"ing user", Toast.LENGTH_SHORT).show();
        }
       else if(item.getTitle().equals("SMS"))
        {
            Toast.makeText(this, item.getTitle()+"ing user", Toast.LENGTH_SHORT).show();
        }

        else if(item.getTitle().equals("call"))
        {
            Toast.makeText(this, item.getTitle()+"ing user", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}
