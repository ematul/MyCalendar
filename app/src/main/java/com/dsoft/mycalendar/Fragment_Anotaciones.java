package com.dsoft.mycalendar;

import android.app.Fragment;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Marco Barrios on 03/10/2014.
 */
public class Fragment_Anotaciones extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_view_anotaciones, container, false);
        int diameter = getResources().getDimensionPixelSize(R.dimen.diameter);
        Outline outline = new Outline();
        outline.setOval(0, 0, 72, 72);
        View addButton = v.findViewById(R.id.add_anotacion_button);
        addButton.setOutline(outline);
        addButton.setClipToOutline(true);

        return v;
        }
    }
