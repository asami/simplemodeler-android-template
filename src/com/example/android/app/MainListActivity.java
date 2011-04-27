package com.example.android.app;

import android.app.ListActivity;
import android.os.Bundle;

public class MainListActivity extends ListActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}