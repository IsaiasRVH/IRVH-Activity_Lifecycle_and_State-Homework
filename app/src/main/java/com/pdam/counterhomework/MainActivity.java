package com.pdam.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mLblCount;
    private Button mBtnCount;
    private  TextView mTxtEditText;

    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLblCount = findViewById(R.id.lbl_count);
        mBtnCount = findViewById(R.id.btn_count);
        mTxtEditText = findViewById(R.id.txt_edittext);

        if(savedInstanceState != null) {
            int count = savedInstanceState.getInt("mCount_value");
            mLblCount.setText(Integer.toString(count));
        }
        else {
            mLblCount.setText("0");
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mCount > 0) {
            outState.putInt("mCount_value", mCount);
        }

    }

    public void countUp (View view) {
        mCount++;
        if(mLblCount != null)
            mLblCount.setText(Integer.toString(mCount));
    }
}