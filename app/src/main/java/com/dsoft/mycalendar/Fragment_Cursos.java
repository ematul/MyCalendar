package com.dsoft.mycalendar;

import android.app.Fragment;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Marco Barrios on 04/10/2014.
 */
public class Fragment_Cursos extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_view_cursos, container, false);
        int diameter = getResources().getDimensionPixelSize(R.dimen.diameter);
        Outline outline = new Outline();
        outline.setOval(0, 0, 72, 72);
        View addButton = v.findViewById(R.id.add_cursos_button);
        addButton.setOutline(outline);
        addButton.setClipToOutline(true);

        return v;
    }
}
