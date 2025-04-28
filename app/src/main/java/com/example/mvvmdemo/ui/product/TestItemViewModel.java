package com.example.mvvmdemo.ui.product;

import android.app.Application;

import androidx.annotation.NonNull;

import com.example.mvvmdemo.entity.TestEntity;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;

public class TestItemViewModel extends ItemViewModel<ProductViewModel> {

    public TestEntity testEntity;

    public TestItemViewModel(@NonNull ProductViewModel viewModel, TestEntity entity) {
        super(viewModel);
        this.testEntity = entity;
    }
}
