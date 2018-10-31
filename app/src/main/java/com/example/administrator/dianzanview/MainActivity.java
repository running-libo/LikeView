package com.example.administrator.dianzanview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    GoodView mGoodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGoodView = new GoodView(this);
    }

    public void good(View view) {
        ((ImageView) view).setImageResource(R.drawable.good_checked);
        mGoodView.setTextInfo("+1", Color.parseColor("#f66467"), 30);
        mGoodView.show(view);
    }

    public void good2(View view) {
        ((ImageView) view).setImageResource(R.drawable.collection_checked);
        mGoodView.setImage(getResources().getDrawable(R.drawable.collection_checked));
        mGoodView.show(view);
    }

}
