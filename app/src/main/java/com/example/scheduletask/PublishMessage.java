package com.example.scheduletask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

public class PublishMessage extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String hello=intent.getStringExtra("hello");
        MediaPlayer mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.start();
        Toast.makeText(context,""+hello,Toast.LENGTH_SHORT).show();
    }
}
