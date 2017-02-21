package com.example.yutzuliu.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by yutzuliu on 2017/2/19.
 */

public class MemClass extends BaseAdapter  {

    String account[];
    String name[];
    String gender[];
    String phone[];

    Context context; //查
    static LayoutInflater layoutInflater =null;  //查



    public MemClass(Context context,String account[],String name[],String gender[],String phone[]){
        this.account=account;
        this.name=name;
        this.gender=gender;
        this.phone=phone;
    }


    public MemClass(Context context){}

    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row==null){
            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);  //查
            row=layoutInflater.inflate(R.layout.list_item_layout , null);


        }

        TextView account = (TextView) row.findViewById(R.id.accountTV);
        TextView name = (TextView)row.findViewById(R.id.nameTV);
        TextView gender = (TextView)row.findViewById(R.id.genderTV);
        TextView phone = (TextView)row.findViewById(R.id.phoneTV);

        account.setText("12");
        name.setText("b");
        gender.setText("c");
        phone.setText("d");

        return null;
    }
}
