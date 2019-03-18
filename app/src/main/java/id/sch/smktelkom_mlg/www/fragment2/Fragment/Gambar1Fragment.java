package id.sch.smktelkom_mlg.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.www.fragment2.R;

public class Gambar1Fragment extends Fragment {
    public Gambar1Fragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multiple_gambar1, container, false);
        return rootView;
    }
}
