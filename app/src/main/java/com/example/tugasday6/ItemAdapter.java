package com.example.tugasday6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final ArrayList<ItemModel> ItemModels;
    private final Context mContext;

    public ItemAdapter(ArrayList<ItemModel> itemModels, Context context) {
        ItemModels = itemModels;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        final ItemModel itemModel = ItemModels.get(position);
        holder.namaBarang.setText(itemModel.getNamaBarang());
        holder.deskBarang.setText(itemModel.getDeskBarang());
        holder.hargaBarang.setText(itemModel.getHargaBarang());
        holder.fotoBarang.setImageResource(itemModel.getPhotoBarang());

        // Set click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click, for example, start detail activity
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("itemId", itemModel.getId()); // Pass item ID to detail activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ItemModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaBarang, deskBarang, hargaBarang;
        ImageView fotoBarang;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaBarang = itemView.findViewById(R.id.tvnamaBarang);
            deskBarang = itemView.findViewById(R.id.tvDeskBarang);
            hargaBarang = itemView.findViewById(R.id.tvHargaBarang);
            fotoBarang = itemView.findViewById(R.id.ivBarang);

        }
    }
}
