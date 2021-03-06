package com.gregb.library.androidhelper.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Collection;
import java.util.List;

/**
 * Created by gregoire on 9/17/14.
 */
public abstract class GbBaseAdapter<T> extends BaseAdapter {

    protected List<T> items;
    private Context mContext;
    protected LayoutInflater inflater;

    public GbBaseAdapter(List<T> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
        this.inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        if(i<0) return null;
        if(i < items.size()){
            return items.get(i);
        }else if(items.size() > 0){
            return items.get(items.size()-1);
        }else{
            return null;
        }

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return view;
    }

    public Context getContext() {
        return mContext;
    }

    public void appendItems(Collection<T> items){
        this.items.addAll(items);
    }

    public void appendItem(T item){
        this.items.add(item);
    }

    public void clear(){
        this.items.clear();
    }

}
