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
        LinearLayout lengthLinearLayout = (LinearLayout) rootView.findViewById(R.id.lengthLinearLayout);
        LinearLayout energyLinearLayout = (LinearLayout) rootView.findViewById(R.id.energyLinearLayout);
        LinearLayout storageLinearLayout = (LinearLayout) rootView.findViewById(R.id.storageLinearLayout);
        LinearLayout temperatureLinearLayout = (LinearLayout) rootView.findViewById(R.id.temperatureLinearLayout);
        LinearLayout weightLinearLayout = (LinearLayout) rootView.findViewById(R.id.weightLinearLayout);

        /*
        Sets up the click events for the navigation buttons
         */

        speedLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),SpeedConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        lengthLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),LengthConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        energyLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),EnergyConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        storageLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),StorageConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        temperatureLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),TemperatureConvertor.class);
                getActivity().startActivity(redirect);
            }
        });

        weightLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect=new Intent(getActivity(),WeightConvertor.class);
                getActivity().startActivity(redirect);
            }
        });







        return rootView;

    }




}
