package com.android.training.zoologico.usa;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.training.zoologico.R;
import com.android.training.zoologico.main.Utilities;

/**
 * Created by Alejandro on 9/3/16.
 */
public class PrincipalDebugUSA extends AppCompatActivity{
    private ImageView icono;
    private TextView appId;
    private TextView appVersionName;
    private TextView appVersionCode;
    private TextView appController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);

        // Managing the interface
        loadInterface();
        fillInterface();
    }

    private void loadInterface(){
        appId          = (TextView) findViewById(R.id.appId);
        appVersionName = (TextView) findViewById(R.id.appVersionName);
        appVersionCode = (TextView) findViewById(R.id.appVersionCode);
        appController  = (TextView) findViewById(R.id.appController);
        icono          = (ImageView) findViewById(R.id.icono);
    }

    private void fillInterface(){
        appId          .setText( Utilities.getAppId() );
        appVersionName .setText( Utilities.getAppVersionName() );
        appVersionCode .setText( Utilities.getAppVersionCode() );
        appController  .setText( this.getClass().getCanonicalName() );
        icono          .setBackground(ContextCompat.getDrawable(this, R.drawable.aguila_usa));
    }
}
