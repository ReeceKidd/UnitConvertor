package rki.yh.cs.stir.ac.uk.unitconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by User on 13/03/2018.
 */

public class UnitFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_unit, container, false);

        LinearLayout speedLinearLayout = (LinearLayout) rootView.findViewById(R.id.speedLinearLayout);

        speedLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),SpeedConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        return rootView;

    }




}
