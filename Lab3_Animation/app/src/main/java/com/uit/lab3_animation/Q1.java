package com.uit.lab3_animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Q1 extends AppCompatActivity {

    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode,
            btnBlinkXml, btnBlinkCode, btnZoomInXml, btnZoomInCode, btnZoomOutXml,
            btnZoomOutCode, btnRotateXml, btnRotateCode, btnMoveXml, btnMoveCode,
            btnSlideUpXml, btnSlideUpCode, btnBounceXml, btnBounceCode,
            btnCombineXml, btnCombineCode;
    private Toast toast;
    private ImageView ivUitLogo;
    private Animation.AnimationListener animationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        findViewsByIds();
        setupClickListeners();
    }
    private void findViewsByIds() {
        ivUitLogo = findViewById(R.id.iv_uit_logo);
        btnFadeInXml = findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        btnFadeOutXml = findViewById(R.id.btn_fade_out_xml);
        btnFadeOutCode = findViewById(R.id.btn_fade_out_code);
        btnBlinkXml = findViewById(R.id.btn_blink_xml);
        btnBlinkCode = findViewById(R.id.btn_blink_code);
    }
    private void setupClickListeners() {
        //Fade in
        btnFadeInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFadeInAnimationXML();
            }
        });

        btnFadeInCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startFadeInAnimationCode());
            }
        });
        //Fade out
        btnFadeOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                startFadeOutAnimationXML();
            }
        });

        btnFadeOutCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                ivUitLogo.startAnimation(startFadeOutAnimationCode());
            }
        });
        //Blink
        btnBlinkXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                startBlinkAnimationXML();
            }
        });

        btnBlinkCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                ivUitLogo.startAnimation(startBlinkAnimationCode());
            }
        });

    }

    //Fade in
    private void startFadeInAnimationXML() {
        Animation fadeInXML = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
        fadeInXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(fadeInXML);
    }
    private AlphaAnimation startFadeInAnimationCode() {
        AlphaAnimation fadeInCode = new AlphaAnimation(0f, 1f);
        fadeInCode.setDuration(3000);
        fadeInCode.setFillAfter(true);
        fadeInCode.setAnimationListener(animationListener);
        return fadeInCode;
    }

    //Fade out
    private void startFadeOutAnimationXML() {
        Animation fadeOutXML = AnimationUtils.loadAnimation(this, R.anim.anim_fade_out);
        fadeOutXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(fadeOutXML);
    }
    private AlphaAnimation startFadeOutAnimationCode() {
        AlphaAnimation fadeOutCode = new AlphaAnimation(0f, 1f);
        fadeOutCode.setDuration(3000);
        fadeOutCode.setFillAfter(true);
        fadeOutCode.setAnimationListener(animationListener);
        return fadeOutCode;
    }

    //Blink
    private void startBlinkAnimationXML() {
        Animation blinkXML = AnimationUtils.loadAnimation(this, R.anim.anim_blink);
        blinkXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(blinkXML);
    }
    private AlphaAnimation startBlinkAnimationCode() {
        AlphaAnimation blinkCode = new AlphaAnimation(0f, 1f);
        blinkCode.setDuration(300);
        blinkCode.setRepeatMode(Animation.REVERSE); // Use setRepeatMode instead of getRepeatMode
        blinkCode.setRepeatCount(3);
//         android:toAlpha="1.0"
//        android:duration="300"
//        android:repeatMode="reverse"
//        android:repeatCount="3"/>
        blinkCode.setAnimationListener(animationListener);
        return blinkCode;
    }
}
