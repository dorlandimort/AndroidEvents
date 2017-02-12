package mx.edu.ulsaoaxaca.eventos.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Dorlan on 12/02/2017.
 */

public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Se ha conectado/desconectado el cable usb.", Toast.LENGTH_LONG).show();
    }
}
