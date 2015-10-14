package com.hw.corcow.samplecustomfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);

        tv1.setTypeface(FontManager.getInstance().getTypeface(this, FontManager.NANUM));
        tv2.setTypeface(FontManager.getInstance().getTypeface(this, FontManager.NOTO));
        tv3.setTypeface(FontManager.getInstance().getTypeface(this, FontManager.ROBOTO));
    }
}
