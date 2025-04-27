package com.example.mvvmdemo.ui.main.home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HomeStateAdapter extends FragmentStateAdapter {

    private static final String[] TITLES = new String[]{"推荐", "关注"};

    public HomeStateAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment(); // 假设你有一个RecommendFragment
            case 1:
                return new SecondFragment(); // 假设你有一个FollowFragment
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getItemCount() {
        return TITLES.length;
    }


}
