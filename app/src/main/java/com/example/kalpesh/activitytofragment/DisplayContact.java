package com.example.kalpesh.activitytofragment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*www.101apps.co.za*/


public class DisplayContact extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);

        TextView textView = (TextView) findViewById(R.id.textViewContactsName);

        int position = getIntent().getIntExtra("position", -1);

        if (position != -1) {
            //get the contact's name
            String contactName = ContactsList.contactsList[position];
            textView.setText(contactName);
        } else {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.problem));
            textView.setText("There is a problem");
        }
    }
}
