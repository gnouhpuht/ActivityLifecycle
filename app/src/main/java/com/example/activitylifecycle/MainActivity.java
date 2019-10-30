package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    private  int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.tv_number);

//        if (savedInstanceState!=null){
//            count=savedInstanceState.getInt("count");
//            number.setText(String.valueOf(count));
//        }

    }

    public void count(View view){
        count++;
        if (number != null)
            number.setText(String.valueOf(count));
    }


    //vẫn giữ nguyên trạng thái
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
//        outState.putInt("count",count);
    }


}
