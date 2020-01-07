package com.yashas003.verticaltextview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    VerticalTextView t1, t2, t3, t4, t5, t6, t7, t8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView0);
        t2 = findViewById(R.id.textView1);
        t3 = findViewById(R.id.textView2);
        t4 = findViewById(R.id.textView3);
        t5 = findViewById(R.id.textView4);
        t6 = findViewById(R.id.textView5);
        t7 = findViewById(R.id.textView6);
        t8 = findViewById(R.id.textView7);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
        t6.setOnClickListener(this);
        t7.setOnClickListener(this);
        t8.setOnClickListener(this);
    }

    private void setNotSelected() {
        setTextUnselected(t1);
        setTextUnselected(t2);
        setTextUnselected(t3);
        setTextUnselected(t4);
        setTextUnselected(t5);
        setTextUnselected(t6);
        setTextUnselected(t7);
        setTextUnselected(t8);
    }

    @Override
    public void onClick(View v) {
        if (t1.equals(v)) {
            setTextSelected(t1);
        } else if (t2.equals(v)) {
            setTextSelected(t2);
        } else if (t3.equals(v)) {
            setTextSelected(t3);
        } else if (t4.equals(v)) {
            setTextSelected(t4);
        } else if (t5.equals(v)) {
            setTextSelected(t5);
        } else if (t6.equals(v)) {
            setTextSelected(t6);
        } else if (t7.equals(v)) {
            setTextSelected(t7);
        } else if (t8.equals(v)) {
            setTextSelected(t8);
        }
    }

    @SuppressLint("SetTextI18n")
    private void setTextSelected(TextView selected) {
        setNotSelected();
        selected.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
        selected.setTypeface(selected.getTypeface(), Typeface.BOLD);
        selected.setTextColor(Color.parseColor("#ff000000"));
        selected.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));

        float scale = getResources().getDisplayMetrics().density;
        selected.setPadding(
                ((int) (20 * scale + 0.5f)),
                ((int) (10 * scale + 0.5f)),
                ((int) (20 * scale + 0.5f)),
                ((int) (10 * scale + 0.5f)));
    }

    private void setTextUnselected(TextView unselected) {
        unselected.setTypeface(null, Typeface.NORMAL);
        unselected.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        unselected.setTextColor(Color.parseColor("#80000000"));
        unselected.setTypeface(ResourcesCompat.getFont(this, R.font.quicksand_medium));

        float scale = getResources().getDisplayMetrics().density;
        unselected.setPadding(
                ((int) (20 * scale + 0.5f)),
                ((int) (8 * scale + 0.5f)),
                ((int) (20 * scale + 0.5f)),
                ((int) (8 * scale + 0.5f)));
    }
}
