package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lvhero;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvhero = (ListView) findViewById(R.id.lv_Hero);
        items = getResources().getStringArray(R.array.heroList);

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        lvhero.setAdapter(adapter);
        lvhero.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String heroName = items[i];
                Intent intent = new Intent(MainActivity.this,ShowHero.class);
                Bundle bundle = new Bundle();
                bundle.putString("heroname",heroName);
                bundle.putInt("heronum", i);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}