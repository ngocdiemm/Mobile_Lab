package com.uit.lab3_animation;

import android.os.Bundle;
import android.view.View;
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
        initVariables();
        final Animation animation = AnimationUtils.loadAnimation(Q1.this, R.anim.anim_fade_in);
        setupClickListeners();
    }
    private void findViewsByIds() {
        ivUitLogo = findViewById(R.id.iv_uit_logo);
        btnFadeInXml = findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        // ... Repeat for other buttons
    }

    private void initVariables() {
        animationListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Handle onAnimationStart if needed
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                toast.makeText(getApplicationContext(), "Animation Stopped",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Handle onAnimationRepeat if needed
            }
        };
    }

    private void setupClickListeners() {
        btnFadeInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                startFadeInAnimation();
            }
        });

        btnFadeInCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to start fade-in animation
                startFadeInAnimation();
            }
        });

        // Repeat for other buttons
    }

    private void startFadeInAnimation() {
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
        fadeIn.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(fadeIn);
    }

    // Define methods for other animations as needed
}
