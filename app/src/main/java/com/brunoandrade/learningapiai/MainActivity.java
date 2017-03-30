package com.brunoandrade.learningapiai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import ai.api.AIListener;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIResponse;

public class MainActivity extends AppCompatActivity implements AIListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AIConfiguration config = new AIConfiguration("5a0ef70c3cb8420fa5463b2e65e11fd1",
                AIConfiguration.SupportedLanguages.PortugueseBrazil,
                AIConfiguration.RecognitionEngine.System);

        AIService aiService = AIService.getService(this, config);
        aiService.setListener(this);

        Button listenButton = (Button) findViewById(R.id.listenButton);
        Button stopListeningButton = (Button) findViewById(R.id.stopListeningButton);
    }

    @Override
    public void onResult(AIResponse result) {

    }

    @Override
    public void onError(AIError error) {

    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningCanceled() {

    }

    @Override
    public void onListeningFinished() {

    }
}
