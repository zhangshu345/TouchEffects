package com.lky.toucheffectsviewdemo.activity;

import android.os.Bundle;
import android.view.View;

import com.lky.toucheffectsmodule.factory.TouchEffectsFactory;
import com.lky.toucheffectsmodule.types.TouchEffectsWholeType;
import com.lky.toucheffectsviewdemo.R;

import androidx.annotation.Nullable;

public class TouchEffectsScaleActivity extends TouchEffectsBaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_effects_sample);

        findViewById(R.id.touch_effects_sample_txt).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_btn).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_img).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_ib).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_fl).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_ll).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_rl).setOnClickListener(this);
        findViewById(R.id.touch_effects_sample_cl).setOnClickListener(this);

    }

//    @Override
//    protected void initTouchEffects() {
//        TouchEffectsFactory.initTouchEffects(this,TouchEffectsWholeType.SCALE);
//    }

    @Override
    public void onClick(View v) {

    }
}
