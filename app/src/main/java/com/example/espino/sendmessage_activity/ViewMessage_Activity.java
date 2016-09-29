package com.example.espino.sendmessage_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by espino on 23/09/16.
 */
public class ViewMessage_Activity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_message_activity);

        Bundle bundle = this.getIntent().getExtras();

        txt = (TextView) findViewById(R.id.textView);

        txt.setText(bundle.getString("message"));

    }
}
