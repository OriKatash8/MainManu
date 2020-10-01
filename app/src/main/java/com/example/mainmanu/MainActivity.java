package com.example.mainmanu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);

        registerForContextMenu(tv);

    }


    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int id = item.getItemId();
        if (id == R.id.action_login) {
            Toast.makeText(this, "you selected login", Toast.LENGTH_SHORT).show();
        } else if (R.id.action_register == id) {
            Toast.makeText(this, "you selected register", Toast.LENGTH_SHORT).show();
        } else if (R.id.action_start == id) {
            Toast.makeText(this, "you selected start", Toast.LENGTH_SHORT).show();
        }
        return true;

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup, menu);
    }

    public boolean onContextItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.firstline)
        {
            Toast.makeText(this,"you selected first line",Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId() == R.id.secondline)
        {
            Toast.makeText(this,"you selected second line",Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

}