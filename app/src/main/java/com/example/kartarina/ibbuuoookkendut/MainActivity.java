package com.example.kartarina.ibbuuoookkendut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.like.LikeButton;

public class MainActivity extends AppCompatActivity {

    LikeButton likeButton;
    Button btnFeedMe;
    private int iconSize = 24;
    private boolean udahEndut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        likeButton = findViewById(R.id.star_button);
        btnFeedMe = findViewById(R.id.btnFeedMe);
        btnFeedMe.setOnClickListener(feedIbbuokEndut());
        likeButton.setOnClickListener(null);
    }

    private View.OnClickListener feedIbbuokEndut() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (udahEndut)
                    return;
                if (iconSize <= 80) {
                    likeButton.setIconSizeDp(iconSize += 10);
                    likeButton.setIcon();
                } else {
                    likeButton.onClick(v);
                    udahEndut = true;
                }
            }
        };
    }

}
