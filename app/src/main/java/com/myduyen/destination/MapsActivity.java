package com.myduyen.destination;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
//        final String longtitude= getIntent().getStringExtra("longtitude");
//        final String latitude = getIntent().getStringExtra("latitude");
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        double latitude = getIntent().getDoubleExtra("a",0);
        double longtitude= getIntent().getDoubleExtra("b",0);
        final String ten = getIntent().getStringExtra("ten");



        // Add a marker in Sydney and move the camera
        //LatLng myPosition = new LatLng(21.586855,105.806503);
        //LatLng vanmieu = new LatLng(21.029387, 105.836165);
        //mMap.addMarker(new MarkerOptions().position(vanmieu).title("Văn Miếu Quốc Tử Giám"));
//        LatLng nhatholon = new LatLng(21.028953,105.848900);
//        mMap.addMarker(new MarkerOptions().position(nhatholon).title("Nhà Thờ Lớn"));
        //mMap.addMarker(new MarkerOptions().position(myPosition).title("Trường ĐH CNTT & TT Thái Nguyên").icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vanmieu, 18));
        LatLng latLng = new LatLng(latitude,longtitude);
        Log.e("a",latitude+"   "+ longtitude);
        mMap.addMarker(new MarkerOptions().position(latLng).title(ten));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,16));

        //hiển thị bản đồ vệ tinh
        // mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //hàm lấy vị trí của mình
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
