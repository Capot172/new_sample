package com.example.new_sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubscriptionsRecyclerViewAdapter extends RecyclerView.Adapter<SubscriptionsRecyclerViewAdapter.SubscriptionsViewHolder>{

    List<String> list;

    public SubscriptionsRecyclerViewAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SubscriptionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new SubscriptionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubscriptionsViewHolder holder, int position) {
        holder.product_name.setText(list.get(position));
        holder.item_layout.setOnClickListener(view -> {
            Toast.makeText(view.getContext(), "Item " + position + " clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SubscriptionsViewHolder extends RecyclerView.ViewHolder {

        TextView product_name;
        LinearLayout item_layout;

        public SubscriptionsViewHolder(@NonNull View itemView) {
            super(itemView);
            product_name = itemView.findViewById(R.id.product_name);
            item_layout = itemView.findViewById(R.id.item_layout);
        }
    }
}
