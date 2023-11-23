package com.uit.lab3_animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
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
        btnZoomInXml = findViewById(R.id.btn_zoom_in_xml);
        btnZoomInCode = findViewById(R.id.btn_zoom_in_code);
        btnZoomOutXml = findViewById(R.id.btn_zoom_out_xml);
        btnZoomOutCode = findViewById(R.id.btn_zoom_out_code);
        btnRotateXml = findViewById(R.id.btn_rotate_xml);
        btnRotateCode = findViewById(R.id.btn_rotate_code);
        btnMoveXml = findViewById(R.id.btn_move_xml);
        btnMoveCode = findViewById(R.id.btn_move_code);
        btnSlideUpXml = findViewById(R.id.btn_slide_up_xml);
        btnSlideUpCode = findViewById(R.id.btn_slide_up_code);
        btnBounceXml = findViewById(R.id.btn_bounce_xml);
        btnBounceCode = findViewById(R.id.btn_bounce_code);
        btnCombineXml = findViewById(R.id.btn_combine_xml);
        btnCombineCode = findViewById(R.id.btn_combine_code);

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

        //Zoom In
        btnZoomInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startZoomInAnimationXML();
            }
        });
        btnZoomInCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startZoomInAnimationCode());
            }
        });

        //Zoom Out
        btnZoomOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startZoomOutAnimationXML();
            }
        });
        btnZoomOutCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startZoomOutAnimationCode());
            }
        });

        //Rotate
        btnRotateXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRotateAnimationXML();
            }
        });

        btnRotateCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startRotateAnimationCode());
            }
        });

        //Move
        btnMoveXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMoveAnimationXML();
            }
        });

        btnMoveCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startMoveAnimationCode());
            }
        });
        btnSlideUpXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSlideUpAnimationXML();
            }
        });

        btnSlideUpCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startSlideUpAnimationCode());
            }
        });

        //Bounce
        btnBounceXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBounceAnimationXML();
            }
        });

        btnBounceCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(startBounceAnimationCode());
            }
        });


    }

    //Định nghĩa hàm
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
        blinkCode.setAnimationListener(animationListener);
        return blinkCode;
    }

    private void startZoomInAnimationXML() {
        Animation zoomInXML = AnimationUtils.loadAnimation(this, R.anim.anim_zoom_in);
        zoomInXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(zoomInXML);
    }

    private ScaleAnimation startZoomInAnimationCode() {
        ScaleAnimation zoomInCode = new ScaleAnimation(
                1f, // fromScaleX
                3f, // toScaleX
                1f, // fromScaleY
                3f, // toScaleY
                Animation.RELATIVE_TO_SELF, 0.5f, // pivotXType and pivotXValue (center X)
                Animation.RELATIVE_TO_SELF, 0.5f  // pivotYType and pivotYValue (center Y)
        );
        zoomInCode.setDuration(1000);
        return zoomInCode;
    }
    //Zoom Out

    private void startZoomOutAnimationXML() {
        Animation zoomOutXML = AnimationUtils.loadAnimation(this, R.anim.anim_zoom_out);
        zoomOutXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(zoomOutXML);
    }
    private ScaleAnimation startZoomOutAnimationCode() {
        ScaleAnimation zoomOutCode = new ScaleAnimation(
                1f,
                0.5f,
                1f,
                0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f, // pivotXType and pivotXValue (center X)
                Animation.RELATIVE_TO_SELF, 0.5f  // pivotYType and pivotYValue (center Y)
        );
        zoomOutCode.setDuration(1000);
        zoomOutCode.setFillAfter(true); // Keep the final state of the animation
        zoomOutCode.setAnimationListener(animationListener);
        return zoomOutCode;
    }

    //Rotate
    private void startRotateAnimationXML() {
        Animation rotateXML = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        rotateXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(rotateXML);
    }

    private RotateAnimation startRotateAnimationCode() {
        RotateAnimation rotateCode = new RotateAnimation(
                0f,  // fromDegrees
                360f,  // toDegrees
                Animation.RELATIVE_TO_SELF, 0.5f,  // pivotXType and pivotXValue (center X)
                Animation.RELATIVE_TO_SELF, 0.5f  // pivotYType and pivotYValue (center Y)
        );

        rotateCode.setDuration(600);
        rotateCode.setRepeatMode(Animation.RESTART);
        rotateCode.setRepeatCount(2);
        rotateCode.setInterpolator(new android.view.animation.CycleInterpolator(1));
        rotateCode.setAnimationListener(animationListener);

        return rotateCode;
    }

    //Move
    private void startMoveAnimationXML() {
        Animation moveXML = AnimationUtils.loadAnimation(this, R.anim.amin_move);
        moveXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(moveXML);
    }

    private TranslateAnimation startMoveAnimationCode() {
        TranslateAnimation moveCode = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,  // fromXType and fromXValue
                Animation.RELATIVE_TO_SELF, 1f,  // toXType and toXValue
                Animation.RELATIVE_TO_SELF, 0f,  // fromYType and fromYValue
                Animation.RELATIVE_TO_SELF, 0f   // toYType and toYValue
        );
        moveCode.setDuration(1000);
        moveCode.setInterpolator(new AccelerateDecelerateInterpolator());
        moveCode.setAnimationListener(animationListener);

        return moveCode;
    }

    //SlideUp
    private void startSlideUpAnimationXML() {
        Animation slideUpXML = AnimationUtils.loadAnimation(this, R.anim.anim_slide_up);
        slideUpXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(slideUpXML);
    }

    private ScaleAnimation startSlideUpAnimationCode() {
        ScaleAnimation slideUpCode = new ScaleAnimation(
                1.0f,  // fromXScale
                1.0f,  // toXScale
                1.0f,  // fromYScale
                0.0f,  // toYScale
                Animation.RELATIVE_TO_SELF, 0.5f,  // pivotXType and pivotXValue (center X)
                Animation.RELATIVE_TO_SELF, 0.5f   // pivotYType and pivotYValue (center Y)
        );
        slideUpCode.setDuration(500);
        slideUpCode.setFillAfter(true); // Keep the final state of the animation
        slideUpCode.setInterpolator(new AccelerateDecelerateInterpolator());
        slideUpCode.setAnimationListener(animationListener);

        return slideUpCode;
    }

    //Bounce
    private void startBounceAnimationXML() {
        Animation bounceXML = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);
        bounceXML.setAnimationListener(animationListener);
        ivUitLogo.startAnimation(bounceXML);
    }

    private ScaleAnimation startBounceAnimationCode() {
        ScaleAnimation bounceCode = new ScaleAnimation(
                1.0f,  // fromXScale
                1.0f,  // toXScale
                0.5f,  // fromYScale (adjusted to create bounce effect)
                1.0f,  // toYScale
                Animation.RELATIVE_TO_SELF, 0.5f,  // pivotXType and pivotXValue (center X)
                Animation.RELATIVE_TO_SELF, 0.5f   // pivotYType and pivotYValue (center Y)
        );
        bounceCode.setDuration(500);
        bounceCode.setFillAfter(true); // Keep the final state of the animation
        bounceCode.setInterpolator(new BounceInterpolator());
        bounceCode.setAnimationListener(animationListener);

        return bounceCode;
    }




}
