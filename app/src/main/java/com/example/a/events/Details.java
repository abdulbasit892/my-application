package com.example.a.events;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Captain Code on 07/10/2017.
 */

public class Details extends AppCompatActivity {

    @Override
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.imagedetail);

        Integer IMAGE = getIntent().getIntExtra("image", 1/*Default Value of Int*/);

        ImageView img = (ImageView)findViewById(R.id.images);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img.setImageResource(IMAGE);
    }
}