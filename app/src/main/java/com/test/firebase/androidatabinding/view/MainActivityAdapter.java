package com.test.firebase.androidatabinding.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.firebase.androidatabinding.R;
import com.test.firebase.androidatabinding.databinding.LayoutItemBinding;
import com.test.firebase.androidatabinding.model.Profile;

import java.util.ArrayList;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Profile> profiles;

    public MainActivityAdapter(Context context, ArrayList<Profile> profiles) {
        this.context = context;
        this.profiles = profiles;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.layout_item, parent, false);
        return new MainActivityAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.layoutItemBinding.setProfile(profiles.get(position));
        holder.layoutItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        LayoutItemBinding layoutItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItemBinding = LayoutItemBinding.bind(itemView);
        }
    }
}
