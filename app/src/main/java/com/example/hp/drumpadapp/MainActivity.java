package com.example.hp.drumpadapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer, m1, m2, m3, m4, m5, m6, m7, m8,m9,m10,m11,m12,m13,m14,m15,m16;
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    float count = 100 * .01f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.imageButton1);
        b2= findViewById(R.id.imageButton2);
        b3= findViewById(R.id.imageButton3);
        b4= findViewById(R.id.imageButton4);
        b5= findViewById(R.id.imageButton5);
        b6= findViewById(R.id.imageButton6);
        b7= findViewById(R.id.imageButton7);
        b8= findViewById(R.id.imageButton8);
        b9= findViewById(R.id.imageButton9);
        b10= findViewById(R.id.imageButton10);
        b11= findViewById(R.id.imageButton11);
        b12= findViewById(R.id.imageButton12);

        m1 = MediaPlayer.create(this, R.raw.one);
        m2 = MediaPlayer.create(this, R.raw.two);
        m3 = MediaPlayer.create(this, R.raw.three);
        m4 = MediaPlayer.create(this, R.raw.four);
        m5 = MediaPlayer.create(this, R.raw.fv);
        m6 = MediaPlayer.create(this, R.raw.sixth);
        m7 = MediaPlayer.create(this, R.raw.seventh);
        m8 = MediaPlayer.create(this, R.raw.eighth);
        m9 = MediaPlayer.create(this, R.raw.bass);
        m10 = MediaPlayer.create(this, R.raw.closehihat);
        m11 = MediaPlayer.create(this, R.raw.crashcymbal);
        m12= MediaPlayer.create(this, R.raw.openhihat);
        m13= MediaPlayer.create(this, R.raw.ridecymbal);
        m14= MediaPlayer.create(this, R.raw.snare);
        m15= MediaPlayer.create(this, R.raw.tom2);
        m16= MediaPlayer.create(this, R.raw.four);

        b1.setOnClickListener(play_sound);
        b2.setOnClickListener(play_sound);
        b3.setOnClickListener(play_sound);
        b4.setOnClickListener(play_sound);
        b5.setOnClickListener(play_sound);
        b6.setOnClickListener(play_sound);
        b7.setOnClickListener(play_sound);
        b8.setOnClickListener(play_sound);
        b9.setOnClickListener(play_sound);
        b10.setOnClickListener(play_sound);
        b11.setOnClickListener(play_sound);
        b12.setOnClickListener(play_sound);

    }


    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }



         View.OnClickListener play_sound = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.imageButton1:
                                if (m1 != null) {
                                    m1.stop();
                                    m1.release();
                                }

                                m1 = MediaPlayer.create(MainActivity.this, R.raw.one);
                                m1.setVolume(count, count);
                                m1.start();
                                break;
                    case R.id.imageButton2:
                        if (m2 != null) {
                            m2.stop();
                            m2.release();
                        }

                        m2 = MediaPlayer.create(MainActivity.this, R.raw.two);
                        m2.setVolume(count, count);
                        m2.start();
                        break;

                    case R.id.imageButton3:
                        if (m3 != null) {
                            m3.stop();
                            m3.release();
                        }

                        m3 = MediaPlayer.create(MainActivity.this, R.raw.three);
                        m3.setVolume(count, count);
                        m3.start();
                        break;

                    case R.id.imageButton4:
                        if (m4 != null) {
                            m4.stop();
                            m4.release();
                        }

                        m4 = MediaPlayer.create(MainActivity.this, R.raw.four);
                        m4.setVolume(count, count);
                        m4.start();
                        break;

                    case R.id.imageButton5:
                        if (m5 != null) {
                            m5.stop();
                            m5.release();
                        }

                        m5 = MediaPlayer.create(MainActivity.this, R.raw.fv);
                        m5.setVolume(count, count);
                        m5.start();
                        break;

                    case R.id.imageButton6:
                        if (m6 != null) {
                            m6.stop();
                            m6.release();
                        }

                        m6 = MediaPlayer.create(MainActivity.this, R.raw.sixth);
                        m6.setVolume(count, count);
                        m6.start();
                        break;

                    case R.id.imageButton7:
                        if (m7 != null) {
                            m7.stop();
                            m7.release();
                        }

                        m7 = MediaPlayer.create(MainActivity.this, R.raw.seventh);
                        m7.setVolume(count, count);
                        m7.start();
                        break;

                    case R.id.imageButton8:
                        if (m8 != null) {
                            m8.stop();
                            m8.release();
                        }

                        m8 = MediaPlayer.create(MainActivity.this, R.raw.eighth);
                        m8.setVolume(count, count);
                        m8.start();
                        break;



                    case R.id.imageButton9:
                        if (m10 != null) {
                            m10.stop();
                            m10.release();
                        }
                        m10 = MediaPlayer.create(MainActivity.this, R.raw.closehihat);
                        m10.setVolume(count, count);
                        m10.start();
                        break;


                    case R.id.imageButton10:
                        if (m9 != null) {
                            m9.stop();
                            m9.release();
                        }
                        m9 = MediaPlayer.create(MainActivity.this, R.raw.bass);
                        m9.setVolume(count, count);
                        m9.start();
                        break;

                    case R.id.imageButton11:
                        if (m15 != null) {
                            m15.stop();
                            m15.release();
                        }
                        m15 = MediaPlayer.create(MainActivity.this, R.raw.tom2);

                        m15.setVolume(count, count);
                        m15.start();
                        break;

                    case R.id.imageButton12:
                        if (m16 != null) {
                            m16.stop();
                            m16.release();
                        }

                        m16 = MediaPlayer.create(MainActivity.this, R.raw.four);
                        m16.setVolume(count, count);
                        m16.start();
                        break;






                }

            }
        };


    }


