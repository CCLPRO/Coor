package com.example.coor;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar("EnterAlways Yallowwwwww");
        setSubtitle("Hello Ballow");
    }

    private void setToolbar(String title) {
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_action_name);
        toolbar.setTitleTextColor(GREEN);

    }

    private void setSubtitle(String subtitle) {
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        toolbar.setSubtitle(subtitle);
        setSupportActionBar(toolbar);
        toolbar.setSubtitleTextColor(RED);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
}