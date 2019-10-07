package com.csuf.cspc411.a411_hw_1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setColumnCount(20);
        root.setRowCount(13);

        TextView tv = new TextView(this);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(12);
        tv.setTextColor(Color.WHITE);

        GridLayout.Spec row_spec = GridLayout.spec(0, 1);
        GridLayout.Spec col_spec = GridLayout.spec(0, 6);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("properties");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(1, 2);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("Rule");
        tv.setTextSize(12);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(3, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("test");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(4, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("test");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(5, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("Rule");
        tv.setTextSize(12);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(6, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("R10");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(7, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("R20");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(8, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("R30");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(9, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("R40");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(10, 1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.CENTER);
        tv.setText("name");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(1, 1);
        col_spec = GridLayout.spec(1, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.CENTER);
        tv.setText("category");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(2, 1);
        col_spec = GridLayout.spec(1, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("C1");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(3, 1);
        col_spec = GridLayout.spec(1, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("min <= hour && hour <= max");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(4, 1);
        col_spec = GridLayout.spec(1, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("int min");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(5, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("From");
        tv.setTextSize(12);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(6, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("0");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(7, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("12");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(8, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("18");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(9, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("22");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(10, 1);
        col_spec = GridLayout.spec(1, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("int max");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(5, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("To");
        tv.setTextSize(12);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(6, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("11");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(7, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("17");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(8, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("21");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(9, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setGravity(Gravity.RIGHT);
        tv.setText("23");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#f4fcb1"));

        row_spec = GridLayout.spec(10, 1);
        col_spec = GridLayout.spec(2, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(1, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(12);

        row_spec = GridLayout.spec(2, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("A1");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(3, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("System.out.println(greeting + \", World!\")");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(4, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setText("String greeting");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#c9f3f5"));

        row_spec = GridLayout.spec(5, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextSize(12);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.parseColor("#edc38c"));

        row_spec = GridLayout.spec(6, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#edc38c"));

        row_spec = GridLayout.spec(7, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        tv = new TextView(this);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#edc38c"));

        row_spec = GridLayout.spec(8, 1);
        col_spec = GridLayout.spec(4, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        tv = new TextView(this);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#edc38c"));

        row_spec = GridLayout.spec(9, 0);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.parseColor("#edc38c"));

        row_spec = GridLayout.spec(10, 1);
        col_spec = GridLayout.spec(4, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        HorizontalScrollView hv = new HorizontalScrollView(this);
        hv.addView(root);
        setContentView(hv);
        // XML file
        // setContentView(R.layout.grid);

    }
}
