package com.example.kalpesh.activitytofragment;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*www.101apps.co.za*/
public class ContactsList extends ListActivity {

    static String[] contactsList = {"Harry", "Peter", "Sally", "Bruno", "Jack", "Peter", "Mary", "Elizabeth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                contactsList);

        setListAdapter(myAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(this, DisplayContact.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
