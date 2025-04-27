package com.example.mvvmdemo.ui.main;

import android.app.Application;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

import com.example.mvvmdemo.ui.base.ToolbarViewModel;
import com.example.mvvmdemo.ui.login.LoginActivity;
import com.example.mvvmdemo.ui.product.ProductActivity;
import com.qinjie.mainnavigatetabbar.MainNavigateTabBar;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

//
public class MainViewModel extends ToolbarViewModel {

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand mGotoLoginCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(LoginActivity.class);
        }
    });

    public BindingCommand mGotoListCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(ProductActivity.class);
        }
    });
}
