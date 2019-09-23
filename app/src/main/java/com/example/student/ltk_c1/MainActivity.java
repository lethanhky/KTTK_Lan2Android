package com.example.student.ltk_c1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ListView lvMenuitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMenuitem = findViewById(R.id.lvMenuItem);
        ArrayList<MenuItem> list = new ArrayList<>();
        MenuItem f1 = new MenuItem("SwordFish", "American", "15.000");
        list.add(f1);
        MenuItem f2 = new MenuItem("DeadPool", "American", "29.000");
        list.add(f2);
        MenuItem f3 = new MenuItem("RobinHood", "American", "35.000");
        list.add(f3);
        MenuItem f4 = new MenuItem("EndGame", "American", "100.000");
        list.add(f4);
        MenuItem f5 = new MenuItem("IronMan", "American", "70.000");
        list.add(f5);
        MenuItemAdapter adapter = new MenuItemAdapter(this, R.layout.layout_item, list);
        lvMenuitem.setAdapter(adapter);
    }
}
