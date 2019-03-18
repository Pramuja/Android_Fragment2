package id.sch.smktelkom_mlg.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import id.sch.smktelkom_mlg.www.fragment2.R;

public class Gambar3Fragment extends Fragment {
    public Gambar3Fragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multiple_gambar3, container, false);
        Button btnGambar3 = (Button)rootView.findViewById(R.id.btnGambar3);
        btnGambar3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Toast.makeText(getActivity(),"Kamu telah klik gambar 3", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
