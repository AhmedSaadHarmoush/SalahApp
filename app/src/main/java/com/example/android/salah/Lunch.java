package com.example.android.salah;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class Lunch extends AppCompatActivity {

    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    private  ProgressBar progressBar;

    /**
     * Called when the activity is first created.
     */
    public static void saveToPrefs(Context context, String key, String value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.lunch_activity);
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        open();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Lunch.this, LogActivity.class);
                Lunch.this.startActivity(mainIntent);
                Lunch.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    public void open() {
        progressBar =(ProgressBar) findViewById(R.id.progress);
        final int totalProgressTime = 3000;
        final Thread t = new Thread() {
            @Override
            public void run() {

                int jumpTime = 0;
                while (jumpTime < totalProgressTime) {
                    try {
                        sleep(200);
                        jumpTime += 5;
                        progressBar.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }
        };
        t.start();
    }
}
