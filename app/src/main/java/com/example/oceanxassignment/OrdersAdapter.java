package com.example.oceanxassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder> {

    Context context;
    ArrayList<OrderModel> orderList;

    public OrdersAdapter(Context context, ArrayList<OrderModel> orderList) {
        this.context = context;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_order, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        OrderModel model = orderList.get(position);

        holder.txtVehicle.setText(model.getVehicleName());
        holder.txtDate.setText(model.getDate());
        holder.txtPrice.setText(model.getPrice());
        holder.txtStatus.setText(model.getStatus());
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtVehicle, txtDate, txtPrice, txtStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtVehicle = itemView.findViewById(R.id.txtVehicle);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtStatus = itemView.findViewById(R.id.txtStatus);
        }
    }
}