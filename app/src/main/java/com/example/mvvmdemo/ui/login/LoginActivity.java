package com.example.mvvmdemo.ui.login;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.example.mvvmdemo.BR;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityLoginBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.loginViewModel;
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();
        viewModel.mImageChangeEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.ivImage.setImageResource(R.mipmap.icon_delete);
            }
        });


        viewModel.mPasswordSwitchEvent.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean isPasswordVisible) {
                if (isPasswordVisible != null) {
                    if (isPasswordVisible) {
                        binding.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    } else {
                        binding.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                }
            }
        });
    }
}