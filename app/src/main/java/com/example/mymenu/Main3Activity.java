package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

         button = (Button) findViewById(R.id.button);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 PopupMenu popupmenu = new PopupMenu(getApplicationContext(),button);

                 getMenuInflater().inflate(R.menu.popup_menu,popupmenu.getMenu());

                 popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                     @Override
                     public boolean onMenuItemClick(MenuItem item) {

                         Toast.makeText(getApplicationContext(), item.getTitle()+"PopUp", Toast.LENGTH_SHORT).show();
                         return false;
                     }
                 });
                 popupmenu.show();
             }
         });
    }
}
