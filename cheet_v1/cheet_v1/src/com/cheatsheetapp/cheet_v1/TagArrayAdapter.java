package com.cheatsheetapp.cheet_v1;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("unused")
public class TagArrayAdapter extends ArrayAdapter<TagRowItem>{
	private Context context;
	private ArrayList<TagRowItem> items;
	public TagArrayAdapter(Context context, ArrayList<TagRowItem> items) {
		super(context,R.layout.rowlayout_tag,items);
	    this.context = context;
	    this.items = items;    
	}
	
  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View rowView = inflater.inflate(R.layout.rowlayout_tag, parent, false);	
   
    TagRowItem item = items.get(position);
    TextView name = (TextView) rowView.findViewById(R.id.tag_name);
    TextView desc = (TextView) rowView.findViewById(R.id.tag_description);
    
    name.setText(item.name);
    desc.setText(item.description);
    
    return rowView;
  }
  @Override
	public int getCount() {
		return items.size();
	}
  

}
