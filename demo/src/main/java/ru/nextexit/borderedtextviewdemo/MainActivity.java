package ru.nextexit.borderedtextviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import ru.nextexit.borderedtextview.BorderedTextView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BorderedTextView textView = findViewById(R.id.hello_text);
        textView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BorderedTextView btv = (BorderedTextView) v;
                btv.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                btv.setBorderRadius(24.0f);

            }
        });
    }
}
