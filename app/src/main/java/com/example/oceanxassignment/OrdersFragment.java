package com.example.oceanxassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrdersFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<OrderModel> orderList;
    OrdersAdapter adapter;

    public OrdersFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_orders, container, false);

        recyclerView = view.findViewById(R.id.recyclerOrders);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        orderList = new ArrayList<>();

        orderList.add(new OrderModel(
                "Four Wheeler",
                "05 Feb, 4:46 PM | Order ID: #ORD12345",
                "₹ 229",
                "Cancelled"
        ));

        orderList.add(new OrderModel(
                "Four Wheeler",
                "05 Feb, 4:46 PM | Order ID: #ORD12346",
                "₹ 1515",
                "Cancelled"
        ));
        orderList.add(new OrderModel(
                "Four Wheeler",
                "05 Feb, 4:46 PM | Order ID: #ORD12347",
                "₹ 1515",
                "Cancelled"
        ));
        orderList.add(new OrderModel(
                "Four Wheeler",
                "05 Feb, 4:46 PM | Order ID: #ORD12348",
                "₹ 1634",
                "Cancelled"
        ));
        orderList.add(new OrderModel(
                "Four Wheeler",
                "05 Feb, 4:46 PM | Order ID: #ORD12349",
                "₹ 1515",
                "Cancelled"
        ));

        adapter = new OrdersAdapter(getContext(), orderList);

        recyclerView.setAdapter(adapter);

        return view;
    }
}