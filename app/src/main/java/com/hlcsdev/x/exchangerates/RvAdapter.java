package com.hlcsdev.x.exchangerates;


import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private ArrayList<Rate> rates;


    RvAdapter(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment, parent, false);

        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Rate rate = rates.get(position);

        holder.textViewName.setText(rate.getCur_Name());
        holder.textViewValue.setText(Double.toString(rate.getCur_OfficialRate()));
    }

    @Override
    public int getItemCount() {
        return rates.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewValue;

        ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewValue = (TextView) itemView.findViewById(R.id.textViewValue);
        }
    }
}
