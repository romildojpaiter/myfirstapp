package br.com.paiter.myfirstapp.fragmento;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.paiter.myfirstapp.R;

import com.google.android.gms.plus.PlusOneButton;


public class ArtigoFragmento extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){

        return inflater.inflate(R.layout.activity_artigo_view, container, false);
    }

}
