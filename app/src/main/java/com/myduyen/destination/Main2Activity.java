package com.myduyen.destination;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

public class Main2Activity extends AppCompatActivity {
private ImageView img2;
private TextView tv2,tvdc,tvreview,longtitude2,latitude2;
private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img2=findViewById(R.id.img2);
        tv2=findViewById(R.id.tv2);
        tvdc=findViewById(R.id.tvdc);
        tvreview=findViewById(R.id.tvreview);
        latitude2=findViewById(R.id.latitude2);
        longtitude2=findViewById(R.id.longtitude2);

        int anh = getIntent().getIntExtra("anh",0);final String ten = getIntent().getStringExtra("ten");

       final String dc = getIntent().getStringExtra("dc");
       final String review = getIntent().getStringExtra("review");
       final double longtitude= getIntent().getDoubleExtra("longtitude",0);
       final double latitude = getIntent().getDoubleExtra("latitude",0);



        tv2.setText(ten);
        img2.setImageResource(anh);
        tvdc.setText(dc);
        tvreview.setText(review);
        longtitude2.setText(longtitude+"");
        latitude2.setText(latitude+"");


        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MapsActivity.class);
                intent.putExtra("a",latitude);
                intent.putExtra("b",longtitude);
                intent.putExtra("dc",dc);
                intent.putExtra("ten",ten);
                startActivity(intent);

            }
        });

    }
//    private void getData(){
////        Uri gmmIntentUri = Uri.parse("geo:0,0?q="+tvgeo.getText().toString()+"("+tvdc.getText().toString()+")");
////        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//// Make the Intent explicit by setting the Google Maps package
////        mapIntent.setPackage("com.google.android.apps.maps");
//        Intent intent = new Intent(this,MapsActivity.class);
//       intent.putExtra("ten",);
//        startActivity(intent);
//
//    }
}
