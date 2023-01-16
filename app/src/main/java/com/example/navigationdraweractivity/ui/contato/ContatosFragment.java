package com.example.navigationdraweractivity.ui.contato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigationdraweractivity.R;



public class ContatosFragment extends Fragment {

    private TextView textViewContatos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_contatos, container, false);

       textViewContatos = view.findViewById(R.id.textViewContatos);
       textViewContatos.setText("Pra cima contato");



        return view;
    }
}