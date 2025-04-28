package com.example.mvvmdemo.ui.main.home;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.mvvmdemo.BR;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.qinjie.pagerslidingtabstrip.PagerSlidingTabStrip;
import com.qinjie.pagerslidingtabstrip.adapter.TabIconTextPagerAdapter;
import com.qinjie.pagerslidingtabstrip.adapter.TabTextPagerAdapter;

import me.goldze.mvvmhabit.base.BaseFragment;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> implements TabTextPagerAdapter.TabPagerListener {


    private String[] titles = new String[]{"推荐", "热门", "最新"};

    private TabTextPagerAdapter mAdapter;

    private ViewPager viewPager;

    private PagerSlidingTabStrip pagerSlidingTabStrip;


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_home;
    }


    @Override
    public int initVariableId() {
        return BR.homeViewModel;
    }

    @Override
    public void initData() {
        mAdapter = new TabTextPagerAdapter(getChildFragmentManager(),3,titles);
        mAdapter.setListener(this);
        viewPager = binding.vpHome;
        viewPager.setAdapter(mAdapter);
        pagerSlidingTabStrip = binding.pstsHome;
        pagerSlidingTabStrip.setViewPager(viewPager);
    }

    @Override
    public Fragment getFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
        }
        return new FirstFragment();
    }
}