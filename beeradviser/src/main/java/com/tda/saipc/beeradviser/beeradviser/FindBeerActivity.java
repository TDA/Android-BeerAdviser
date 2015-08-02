package com.tda.saipc.beeradviser.beeradviser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.List;


public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void FindBeers(View view) {
        Spinner beerColor = (Spinner) findViewById(R.id.color);
        String s = beerColor.getSelectedItem().toString();
        List<String> l = BeerExpert.getBeers(s);
        StringBuilder brandText = new StringBuilder();
        for(String beer : l) {
            brandText.append("\n" + beer );
        }
        EditText message = (EditText) findViewById(R.id.message);
        brandText.append("\n" + message.getText().toString() );
        Intent intent = new Intent(this, ReceiveBeerOrder.class);
        intent.putExtra("message", brandText.toString());

        startActivity(intent);

    }
}
