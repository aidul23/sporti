package com.duodevloopers.teammanagement.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.duodevloopers.teammanagement.Model.Match;
import com.duodevloopers.teammanagement.R;

import java.util.ArrayList;
import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder>{
    private List<Match> mMatches = new ArrayList<>();

    public MatchAdapter(List<Match> mMatches) {
        this.mMatches = mMatches;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match match = mMatches.get(position);

        holder.matchCode.setText(match.getMatchCode());
        holder.status.setText(match.getMatchStatus());
        holder.teamName.setText(match.getTeamName());
        holder.matchDate.setText(match.getMatchDay());
        holder.matchTime.setText(match.getMatchTime());
        holder.matchPlace.setText(match.getMatchPlace());
    }

    @Override
    public int getItemCount() {
        return mMatches.size();
    }


    public class MatchViewHolder extends RecyclerView.ViewHolder{
        private TextView matchCode, status, teamName, matchDate, matchTime, matchPlace;
        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            matchCode = itemView.findViewById(R.id.matchCode);
            status = itemView.findViewById(R.id.statusText);
            teamName = itemView.findViewById(R.id.teamName);
            matchDate = itemView.findViewById(R.id.matchDay);
            matchTime = itemView.findViewById(R.id.matchTime);
            matchPlace = itemView.findViewById(R.id.matchLocation);
        }
    }
}
