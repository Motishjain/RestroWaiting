package com.example.mjai37.restrowaiting;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AddWaitingCustomerActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_waiting_customer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //TODO: what does this line does??
        getMenuInflater().inflate(R.menu.menu_main, menu);

        Button addButton = (Button) findViewById(R.id.add_button);
        Button resetButton = (Button) findViewById(R.id.reset_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return true;
    }

}
