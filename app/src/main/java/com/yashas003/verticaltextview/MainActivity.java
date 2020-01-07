package com.yashas003.verticaltextview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener;
import com.azoft.carousellayoutmanager.CenterScrollListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    VerticalTextView t1, t2, t3, t4, t5, t6, t7, t8;
    RecyclerView listView;
    ImageView tt1, tt2, tt3, tt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        catAttr();
        listView = findViewById(R.id.list_view);
        listView.setAdapter(new Adapter(this, getList()));
        listView.setHasFixedSize(true);

        CarouselLayoutManager layoutManager = new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL);
        listView.setLayoutManager(layoutManager);
        listView.addOnScrollListener(new CenterScrollListener());
        layoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());
    }

    private ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("https://cdn.pixabay.com/photo/2019/12/30/03/28/banana-4728754_960_720.jpg");
        list.add("https://images.unsplash.com/photo-1578344919995-48d5cd9b4b5d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578329664739-48a7607b63bd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578339375118-628ef3e36a59?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578305034019-32f5ff2a7be7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80");
        list.add("https://images.unsplash.com/photo-1578357932180-12a8e56d1003?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578158336951-51d459eb48e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578340501424-43287e19f344?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578347485480-71eedddf6a05?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        list.add("https://images.unsplash.com/photo-1578357365558-e4154c11b284?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=333&q=80");
        list.add("https://images.unsplash.com/photo-1578336504024-20931c050c66?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        return list;
    }

    private void catAttr() {
        t1 = findViewById(R.id.textView0);
        t2 = findViewById(R.id.textView1);
        t3 = findViewById(R.id.textView2);
        t4 = findViewById(R.id.textView3);
        t5 = findViewById(R.id.textView4);
        t6 = findViewById(R.id.textView5);
        t7 = findViewById(R.id.textView6);
        t8 = findViewById(R.id.textView7);

        tt1 = findViewById(R.id.t1);
        tt2 = findViewById(R.id.t2);
        tt3 = findViewById(R.id.t3);
        tt4 = findViewById(R.id.t4);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
        t6.setOnClickListener(this);
        t7.setOnClickListener(this);
        t8.setOnClickListener(this);


        Picasso.get().load("https://cdn.pixabay.com/photo/2019/01/27/22/31/braids-3959201_960_720.jpg").into(tt1);
        Picasso.get().load("https://cdn.pixabay.com/photo/2020/01/02/01/58/love-4734812_960_720.jpg").into(tt2);
        Picasso.get().load("https://cdn.pixabay.com/photo/2019/12/24/05/59/butterfly-4716054_960_720.jpg").into(tt3);
        Picasso.get().load("https://cdn.pixabay.com/photo/2020/01/02/11/17/fallow-deer-4735582_960_720.jpg").into(tt4);
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
