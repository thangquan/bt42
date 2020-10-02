package com.example.mohsin.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[]= {"Monkey D.Luffy","Roronoa Zoro"," God Ussop","Vinsmoke Sanji","Nami","Ace","Trafalgar Law"};
    String mDescription[] = {"Băng Mũ Rơm", "Băng Mũ Rơm", "Băng Mũ Rơm", "Băng Mũ Rơm", "Băng Mũ Rơm",  "Băng Râu Trắng","Băng j Không Nhớ Tên Nữa"};
    int images[] = {R.drawable.luffy, R.drawable.zoro, R.drawable.ussop, R.drawable.sanji, R.drawable.nami,R.drawable.ace,R.drawable.low};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Mũ Rơm", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Mũ Rơm", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Mũ Rơm", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Mũ Rơm", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Mũ Rơm", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng Râu Trắng", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MainActivity.this, "Băng j Không Nhớ Tên Nữa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }

}
