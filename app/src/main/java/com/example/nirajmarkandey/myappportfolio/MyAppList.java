package com.example.nirajmarkandey.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppList extends AppCompatActivity implements View.OnClickListener{

    //declarations
    Button popularMovies,stockHawk,buildItbigger,material,ubiquitous,capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_list);
        //initializing
        popularMovies = (Button) findViewById(R.id.bt_movies);
        stockHawk = (Button) findViewById(R.id.bt_stock);
        buildItbigger = (Button) findViewById(R.id.bt_build_it_bigger);
        material = (Button) findViewById(R.id.bt_material);
        ubiquitous = (Button) findViewById(R.id.bt_ubiquitous);
        capstone = (Button) findViewById(R.id.bt_capstone);

        //onclick
        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildItbigger.setOnClickListener(this);
        material.setOnClickListener(this);
        ubiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_movies:
                Toast toast = Toast.makeText(this, "This button will launch my Popular Movies App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.bt_stock:
                Toast stock = Toast.makeText(this, "This button will launch my Stock Hawk App", Toast.LENGTH_SHORT);
                stock.show();
                break;
            case R.id.bt_build_it_bigger:
                Toast build = Toast.makeText(this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT);
                build.show();
                break;
            case R.id.bt_material:
                Toast material = Toast.makeText(this, "This button will launch my Make Your App Material App", Toast.LENGTH_SHORT);
                material.show();
                break;
            case R.id.bt_ubiquitous:
                Toast ubiquitous = Toast.makeText(this, "This button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT);
                ubiquitous.show();
                break;
            case R.id.bt_capstone:
                Toast captone = Toast.makeText(this, "This button will launch my Capstone App", Toast.LENGTH_SHORT);
                captone.show();
                break;
        }

    }
}
