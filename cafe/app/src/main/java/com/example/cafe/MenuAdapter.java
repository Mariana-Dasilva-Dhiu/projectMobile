package com.example.cafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;

    public MenuAdapter(Context mcontext,ArrayList<Menu> menuCafe){
        context=mcontext;
        menus=menuCafe;
    }

    @NonNull
    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from (context).inflate (R.layout.item_menu,parent,false);
        return new MenuViewHolder (v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {
        Menu menuBaru=menus.get (position);
        String gambarBaru=menuBaru.getGambar ();
        String harga=menuBaru.getHarga ();
        String nama=menuBaru.getNama ();

        holder.tvNamaData.setText (nama);
        holder.tvHargaData.setText (harga);

        Glide
                .with (context)
                .load(gambarBaru)
                .centerCrop ()
                .into (holder.imData);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{
        public ImageView imData;
        public TextView tvHargaData, tvNamaData;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imData=itemView.findViewById (R.id.img_menu);
            tvHargaData=itemView.findViewById (R.id.tv_harga);
            tvNamaData=itemView.findViewById (R.id.tv_nama);

        }
    }
}
