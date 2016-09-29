package com.example.espino.sendmessage_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;


/**
 * Ver patrón Singleton
 * Ver ciclo de vida app android
 * Ver componentes de android
 *
 * Para documentar:
 * Describir lo que hace la clase o método:
 *      clase que envía un mensaje a otra Activity @see{@link android.app.Activity}
 *      @see android.app.Activity
 *      @author espino
 *      @version 1.0
 * */
//TODO Mi primera Activity
public class SendMessage_Activity extends AppCompatActivity {

    private EditText etx;

    public final static String TAG = "com.example.sendMessage";

    /**
     * Método que crea la Activity
     * Bundle: Algo que le paso a la otra activity(clave--valor)
     *      ttodo intent tiene un bundle que le paso a otra
     * @param savedInstanceState @see{@link android.os.Bundle}
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message_);

        Log.d(TAG,"onCreate(): La actividad se ha creado");

        etx = (EditText) findViewById(R.id.etx);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart(): La actividad se ha iniciado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume(): La actividad es visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause): La actividad no es visible");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop(): La actividad ha finalizado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void getEvent(View view)
    {
        switch(view.getId())
        {
            case R.id.btn:
                //TODO RECOGER EL TEXTO DEL COMPONENTE ETX

                //TODO CREAR EL OBJETO BUNDLE
                Bundle bndl = new Bundle();
                bndl.putString("message",etx.getText().toString());

                //TODO CREAR EL INTENT Y AÑADIR EL OBJETO BUNDLE
                Intent intent = new Intent(SendMessage_Activity.this, ViewMessage_Activity.class);
                intent.putExtras(bndl);

                //TODO INICIAR ACTIVITY
                startActivity(intent);
        }
    }
}
