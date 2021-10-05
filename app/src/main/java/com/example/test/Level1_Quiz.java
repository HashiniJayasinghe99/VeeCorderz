package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Level1_Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView SelectedTopicName = findViewById(R.id.topic_name);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        SelectedTopicName.setText(getSelectedTopicName);

    }
}