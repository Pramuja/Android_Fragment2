package id.sch.smktelkom_mlg.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.sch.smktelkom_mlg.www.fragment2.R;

public class MenuFragment extends Fragment {
    Button btnGambar1, btnGambar2, btnGambar3;
    Fragment frag;
    FragmentTransaction fragTransaction;

    public MenuFragment() {
    }
        public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.menu_fragment, container, false);
            frag = new Gambar1Fragment();
            fragTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
            fragTransaction.commit();

            Button btnGambar1 = (Button) view.findViewById(R.id.btnGambar1);
            Button btnGambar2 = (Button) view.findViewById(R.id.btnGambar2);
            Button btnGambar3 = (Button) view.findViewById(R.id.btnGambar3);

            btnGambar1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    frag = new Gambar1Fragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTransaction.commit();
                }
            });
            btnGambar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    frag = new Gambar2Fragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTransaction.commit();
                }
            });
            btnGambar3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    frag = new Gambar3Fragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTransaction.commit();
                }
            });
            return view;
        }
    }
