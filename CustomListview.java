package com.example.recipes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListview extends ArrayAdapter<String> {

    private String[] breadname;
    private Integer[] imageid;
    private Activity context;


    public CustomListview(Activity context, String[] breadname, Integer[] imageid){

        super(context, R.layout.listview_layout, breadname);

        this.context=context;
        this.breadname=breadname;
        this.imageid=imageid;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View r = convertView;

        ViewHolder viewHolder = null;

        if(r == null)
        {

            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {

            viewHolder = (ViewHolder) r.getTag();

        }

        viewHolder.pic1.setImageResource(imageid[position]);
        viewHolder.text1.setText(breadname[position]);

        return r;

    }

    class ViewHolder
    {

        TextView text1;
        ImageView pic1;
        ViewHolder(View v)
        {

            text1= (TextView) v.findViewById(R.id.tvbreadname);
            pic1= (ImageView) v.findViewById(R.id.imageView);

        }

    }

}
