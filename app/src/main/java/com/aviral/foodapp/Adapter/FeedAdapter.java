package com.aviral.foodapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.foodapp.Domain.CategoryDomain;
import com.aviral.foodapp.Domain.FeedDomain;
import com.aviral.foodapp.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    ArrayList<FeedDomain> feedDomains;

    public FeedAdapter(ArrayList<FeedDomain> feedDomains) {
        this.feedDomains = feedDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_adpter_feed,
                parent, false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(feedDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(feedDomains.get(position).getFee()));


        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(
                feedDomains.get(position).getPic(), "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return feedDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, fee, btnAdd;
        ImageView pic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_feed);
            fee = itemView.findViewById(R.id.fee);
            btnAdd = itemView.findViewById(R.id.btnAdd);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
