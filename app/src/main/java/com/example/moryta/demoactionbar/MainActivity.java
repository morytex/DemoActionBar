package com.example.moryta.demoactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = "Item " + item.getTitle();

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
