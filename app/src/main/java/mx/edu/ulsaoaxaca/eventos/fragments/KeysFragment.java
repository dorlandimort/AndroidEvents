package mx.edu.ulsaoaxaca.eventos.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.edu.ulsaoaxaca.eventos.R;

public class KeysFragment extends Fragment implements View.OnKeyListener {

    TextView txtKey;

    public KeysFragment() {
        // Required empty public constructor
    }

    public static KeysFragment newInstance() {
        KeysFragment fragment = new KeysFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_keys, container, false);
        this.txtKey = (TextView) view.findViewById(R.id.txtKey);
        this.txtKey.setText("Hola");
        view.setOnKeyListener(this);
        return view;
    }


    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        Log.i("key", keyEvent.toString());
        return true;
    }
}
