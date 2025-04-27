package com.example.mvvmdemo.ui.product;

import android.os.Bundle;

import androidx.databinding.ObservableField;
import androidx.lifecycle.Observer;

import com.example.mvvmdemo.BR;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.app.AppApplication;
import com.example.mvvmdemo.databinding.ActivityProductBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

public class ProductActivity extends BaseActivity<ActivityProductBinding, ProductViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_product;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();

    }
}

