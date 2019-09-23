package com.example.student.ltk_c1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuItemAdapter extends BaseAdapter{
    private Context ctx;
    private int layout;
    private ArrayList<MenuItem> list;

    public MenuItemAdapter(Context ctx, int layout, ArrayList<MenuItem> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            // inflate the layout
            LayoutInflater inflater = LayoutInflater.from(ctx);
            convertView = inflater.inflate(R.layout.layout_item, null);

            // set up the ViewHolder
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvCountry = (TextView) convertView.findViewById(R.id.tvCountry);
            viewHolder.tvPrice = (TextView) convertView.findViewById(R.id.tvPrice);

            // store the holder with the view
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText("SwordFish");
        viewHolder.tvCountry.setText("American");
        viewHolder.tvPrice.setText("15.000");
        return convertView;
    }

    static class ViewHolder {
        TextView tvName;
        TextView tvCountry;
        TextView tvPrice;
    }
}
