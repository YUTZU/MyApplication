package com.example.yutzuliu.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.fingerprintAuthDrawable;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private Button showBT;
    String [] account ={"1","2"};
    String [] name ={"1","2"};
    String [] gender ={"1","2"};
    String [] phone = {"1","2"};

  //  MyAdapter adapter = null; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listView);
        showBT=(Button)findViewById(R.id.showBt);

       // listView.setAdapter(new MemClass(MainActivity.this,account,name,gender,phone));  //
        listView.setAdapter(new MemClass((MainActivity.this)));
 //       listView.setAdapter(adapter);
    }


/*
    private class MyAdapter extends BaseAdapter{

        private LayoutInflater layoutInflater ;

        public MyAdapter(Context c){
            layoutInflater = LayoutInflater.from(c);
        }


        @Override
        public int getCount() {
            return account.length ;
        }

        @Override
        public Object getItem(int position) {
            return account[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        private class ViewHolder{
            TextView name ;
            TextView account;
            TextView gender;
            TextView phone;

            public ViewHolder(TextView name,TextView account,TextView gender,TextView phone){

                this.name=name;
                this.gender=gender;
                this.account=account;
                this.phone=phone;
            }

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;

            if(convertView==null) {


                convertView = layoutInflater.inflate(R.layout.list_item_layout, null);

                holder = new ViewHolder(

                (TextView) convertView.findViewById(R.id.accountTV),
                (TextView) convertView.findViewById(R.id.nameTV),
                (TextView) convertView.findViewById(R.id.genderTV),
                (TextView) convertView.findViewById(R.id.phoneTV)
                );

                convertView.setTag(holder);

            }
            else
                holder= (ViewHolder)convertView.getTag();

            Member mem = (Member) getItem(position);

            holder.account.setText("1");
            holder.name.setText("1");
            holder.gender.setText("1");
            holder.phone.setText("1");

            return convertView;





        }
    }


  */


}
