package com.anggitprayogo.uberdriverclone;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn, btnRegister;


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //SET DAFAULT FONT
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                                        .setDefaultFontPath("fonts/Arkhip_font.ttf")
                                        .setFontAttrId(R.attr.fontPath)
                                        .build());

        setContentView(R.layout.activity_main);

        btnSignIn   =   (Button)findViewById(R.id.btnSignIn);
        btnRegister =   (Button)findViewById(R.id.btnRegister);
    }
}
