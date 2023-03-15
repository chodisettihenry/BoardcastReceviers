package com.example.boardcastreceviers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BoadCastExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isPlane = intent.getBooleanExtra("state",false);

        if (isPlane==true) {
            Toast.makeText(context, "Ariplanemode is on plase check it", Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(context, "Thankyou for off AriplaneMode", Toast.LENGTH_SHORT).show();


        }

    }
}
