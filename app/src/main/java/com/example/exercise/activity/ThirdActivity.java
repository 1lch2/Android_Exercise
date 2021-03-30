package com.example.exercise.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exercise.R;
import com.example.exercise.fragment.ThirdFragment;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button5) {
            replaceFragment(new ThirdFragment());
        }
    }

    /**
     * 替换当前下侧的Fragment
     * @param fragment 用于替换的新Fragment
     */
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment2, fragment); // 将第一个Fragment替换为第二个
        fragmentTransaction.addToBackStack(null); // 将事务传入返回栈
        fragmentTransaction.commit();
    }
}