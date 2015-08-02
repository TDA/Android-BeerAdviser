package com.tda.saipc.beeradviser.beeradviser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ReceiveBeerOrder extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_beer_order);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView t = (TextView) findViewById(R.id.order);
        t.append(message);
    }

}
