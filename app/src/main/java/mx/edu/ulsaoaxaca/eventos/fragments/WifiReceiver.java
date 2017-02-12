package mx.edu.ulsaoaxaca.eventos.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class WifiReceiver extends BroadcastReceiver {

    private final static String TAG = WifiReceiver.class.getSimpleName();

    @Override
    public void onReceive(final Context context, final Intent intent) {
        int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, -1);
        if (WifiManager.WIFI_STATE_CHANGED_ACTION.equals(intent.getAction())
                && WifiManager.WIFI_STATE_ENABLED == wifiState) {
            Toast.makeText(context, "Wifi encendido", Toast.LENGTH_LONG).show();
        } else
            Toast.makeText(context, "Wifi apagado", Toast.LENGTH_LONG).show();
    }

}