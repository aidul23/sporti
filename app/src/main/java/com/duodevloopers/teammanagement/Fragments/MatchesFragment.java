package com.duodevloopers.teammanagement.Fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duodevloopers.teammanagement.Adapter.MatchAdapter;
import com.duodevloopers.teammanagement.Custom.MatchCreateDialog;
import com.duodevloopers.teammanagement.Model.Match;
import com.duodevloopers.teammanagement.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MatchesFragment extends Fragment {

    private List<Match> matchList = new ArrayList<>();
    public RecyclerView matchRecyclerView;
    public MatchAdapter matchAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_matches, container, false);

        matchList.add(new Match("#dsfe32f","Active","Tampere Titan","12 January, 2024","8.30 am","Hervanta Field", 90,40,22,"Insinorinkatu 60, 33720"));
        matchList.add(new Match("#dsfe32f","Active","Tampere Titan","12 January, 2024","8.30 am","Hervanta Field", 90,40,22,"Insinorinkatu 60, 33720"));
        matchList.add(new Match("#dsfe32f","Active","Tampere Titan","12 January, 2024","8.30 am","Hervanta Field", 90,40,22,"Insinorinkatu 60, 33720"));
        matchList.add(new Match("#dsfe32f","Active","Tampere Titan","12 January, 2024","8.30 am","Hervanta Field", 90,40,22,"Insinorinkatu 60, 33720"));

        matchRecyclerView = v.findViewById(R.id.matchList);
        matchRecyclerView.setHasFixedSize(true);
        matchRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        matchAdapter = new MatchAdapter(matchList);
        matchRecyclerView.setAdapter(matchAdapter);

        FloatingActionButton fab = v.findViewById(R.id.createMatch);
        fab.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
        return v;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void openDialog() {
        MatchCreateDialog matchCreateDialog = new MatchCreateDialog();
        matchCreateDialog.show(getFragmentManager(),"Create Match");
    }
}