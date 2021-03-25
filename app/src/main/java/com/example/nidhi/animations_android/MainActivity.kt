package com.example.nidhi.animations_android

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnblink.setOnClickListener {

            val blink = AnimationUtils.loadAnimation(this, R.anim.blink)
            blinktw.startAnimation(blink)

        }

        btnbounce.setOnClickListener {

            val bounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            BounceTW.startAnimation(bounce)
        }

        btnfadein.setOnClickListener {

            val fadein = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            fadeinTW.startAnimation(fadein)
        }

        btnFadeout.setOnClickListener {

            val fadeout = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            fadeOutTW.startAnimation(fadeout)
        }

        btnflip.setOnClickListener {

            val flip = AnimationUtils.loadAnimation(this, R.anim.flip)
            FlipTW.startAnimation(flip)
        }

        btnmove.setOnClickListener {

            val move = AnimationUtils.loadAnimation(this, R.anim.move)
            MoveTW.startAnimation(move)
        }

        btnrotate.setOnClickListener {

            val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            RotateTW.startAnimation(rotate)
        }

        btnSequential.setOnClickListener {

            val sequential = AnimationUtils.loadAnimation(this, R.anim.sequential)
            SequentailTW.startAnimation(sequential)
        }

        btnSlideDown.setOnClickListener {

            val sd = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            SlidedownTW.startAnimation(sd)
        }

        btnSlideUp.setOnClickListener {

            val su = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            SlideupTW.startAnimation(su)
        }

        btntogether.setOnClickListener {

            val together = AnimationUtils.loadAnimation(this, R.anim.together)
            togtherTW.startAnimation(together)
        }

        btnzoomin.setOnClickListener {

            val zi = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            zoominTW.startAnimation(zi)
        }

        btnzoomout.setOnClickListener {

            val zo = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            ZoomoutTW.startAnimation(zo)
        }

    }
}