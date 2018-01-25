package com.example.zhengxiaohu.dialchartdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhengxiaohu.dialchartdemo.view.DialChartSLoadView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    DialChartSLoadView mChartSLoadView;

    Button randomBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        randomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int max=100;
                int min=1;

                Random random=new Random();
                int p=random.nextInt(max)%(max-min+1)+min;
                float pf=p/100f;

                mChartSLoadView.setCurrentStatus(pf);
                mChartSLoadView.invalidate();
            }
        });

        mChartSLoadView.invalidate();
    }

    private void initView() {

        mChartSLoadView= (DialChartSLoadView) findViewById(R.id.fill_circle_view);
        randomBtn= (Button) findViewById(R.id.randomBtn);
    }
}
