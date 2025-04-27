package com.example.mvvmdemo.ui.main;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mvvmdemo.BR;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.ui.main.home.HomeFragment;
import com.example.mvvmdemo.ui.main.me.MeFragment;
import com.qinjie.mainnavigatetabbar.MainNavigateTabBar;

import me.goldze.mvvmhabit.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.mainViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.mainTabBar.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(@Nullable Bundle outState) {
        super.onSaveInstanceState(outState);
        binding.mainTabBar.onSaveInstanceState(outState);
    }


    @Override
    public void initData() {
        binding.mainTabBar.setFrameLayoutId(R.id.main_container);//将fragment容器的id设置给tabbar
        binding.mainTabBar.addTab(HomeFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_launcher, R.mipmap.ic_launcher, "首页"));
        binding.mainTabBar.addTab(MeFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_launcher, R.mipmap.ic_launcher, "我的"));
    }
}