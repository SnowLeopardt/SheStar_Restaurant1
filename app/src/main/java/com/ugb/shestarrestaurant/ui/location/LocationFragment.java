package com.ugb.shestarrestaurant.ui.location;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.ugb.shestarrestaurant.R;

public class LocationFragment extends AppCompatActivity implements View.OnClickListener {

    private Button btnmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_fragment);

        btnmapa = findViewById(R.id.btnmapa);

        btnmapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnmapa:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gle/maps/e786kV1L3efxeFFcA")));
                break;
        }

    }
}
