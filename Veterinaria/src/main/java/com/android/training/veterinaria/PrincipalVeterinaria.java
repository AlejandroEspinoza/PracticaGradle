package com.android.training.veterinaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PrincipalVeterinaria extends AppCompatActivity {
    private static String TAG = PrincipalVeterinaria.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_veterinaria);
        Log.i(TAG, "----- ----- ----- OnCreate.");
    }
}