package com.example.a04implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.web: // 암시적 인텐트로 웹페이지를 본다.
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                break;
            case R.id.call: // 암시적 인텐트로 전화를 건다.
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+82)12345678"));
                break;
            case R.id.map: // 암시적 인텐트로 지도를 본다.
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.30,127.2?z=10"));
                break;
            case R.id.contact: // 암시적 인텐트로 연락처를 본다.
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                break;
        }
        if (intent != null){
            startActivity(intent);
        }

    }
}
