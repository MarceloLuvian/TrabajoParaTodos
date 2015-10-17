package com.trabajo.rene.trabajopt;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class principal extends AppCompatActivity {

    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerList = (ListView)findViewById(R.id.navList);
    addDrawerItems();
    }
    private void addDrawerItems() {
        String[] osArray = { "Perfil", "Buscar Empleo", "Mensajes", "Noticias" };
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);
    }
}
