package com.example.mvvmdemo.ui.base;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import me.goldze.mvvmhabit.base.BaseModel;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

public class ToolbarViewModel<M extends BaseModel> extends BaseViewModel<M> {

    //标题文字
    public ObservableField<String> titleText = new ObservableField<>("");
    //右边图标
    public Drawable rightIcon;
    //右边文字
    public ObservableField<String> rightText = new ObservableField<>("");

    //右边文字的观察者
    public ObservableInt leftIconVisibleObservable = new ObservableInt(View.VISIBLE);
    //右边文字的观察者
    public ObservableInt rightTextVisibleObservable = new ObservableInt(View.GONE);
    //右边图标的观察者
    public ObservableInt rightIconVisibleObservable = new ObservableInt(View.GONE);
    //右边图标文字的观察者
    public ObservableInt rightIconTextVisibleObservable = new ObservableInt(View.GONE);

    //兼容databinding，去泛型化
    public ToolbarViewModel toolbarViewModel;

    public ToolbarViewModel(@NonNull Application application) {
        this(application, null);
    }

    public ToolbarViewModel(@NonNull Application application, M model) {
        super(application, model);
        toolbarViewModel = this;
    }

    /**
     * 设置标题
     *
     * @param text 标题文字
     */
    public void setTitleText(String text) {
        titleText.set(text);
    }

    /**
     * 设置右边图标
     *
     * @param resId 右边图标
     */
    public void setRightIcon(int resId) {
        rightIconVisibleObservable.set(View.VISIBLE);
        rightTextVisibleObservable.set(View.GONE);
        rightIconTextVisibleObservable.set(View.GONE);
        rightIcon = ContextCompat.getDrawable(getApplication(), resId);
    }

    /**
     * 设置右边文字
     *
     * @param text 右边文字
     */
    public void setRightText(String text) {
        rightIconVisibleObservable.set(View.GONE);
        rightTextVisibleObservable.set(View.VISIBLE);
        rightIconTextVisibleObservable.set(View.GONE);
        rightText.set(text);
    }

    /**
     * 设置右边图标文字
     *
     * @param text 右边文字
     */
    public void setRightIconText(int resId, String text) {
        rightIconVisibleObservable.set(View.GONE);
        rightTextVisibleObservable.set(View.GONE);
        rightIconTextVisibleObservable.set(View.VISIBLE);
        rightIcon = ContextCompat.getDrawable(getApplication(), resId);
        rightText.set(text);
    }

    /**
     * 设置右边文字的显示和隐藏
     *
     * @param visibility
     */
    public void setLeftIconVisible(int visibility) {
        leftIconVisibleObservable.set(visibility);
    }

    /**
     * 设置右边图标的显示和隐藏
     *
     * @param visibility
     */
    public void setRightIconVisible(int visibility) {
        rightIconVisibleObservable.set(visibility);
    }

    /**
     * 设置右边文字的显示和隐藏
     *
     * @param visibility
     */
    public void setRightTextVisible(int visibility) {
        rightTextVisibleObservable.set(visibility);
    }

    /**
     * 设置右边图标文字的显示和隐藏
     *
     * @param visibility
     */
    public void setRightIconTextVisible(int visibility) {
        rightIconTextVisibleObservable.set(visibility);
    }

    /**
     * 返回按钮的点击事件
     */
    public final BindingCommand backOnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            leftIconOnClick();
        }
    });

    /**
     * 右边图标的点击事件
     */
    public BindingCommand rightIconOnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            rightIconOnClick();
        }
    });

    /**
     * 右边文字的点击事件
     */
    public BindingCommand rightTextOnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            rightTextOnClick();
        }
    });

    /**
     * 右边图标文字的点击事件
     */
    public BindingCommand rightIconTextOnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            rightIconTextOnClick();
        }
    });

    /**
     * 左边图标的点击事件，子类可重写
     */
    protected void leftIconOnClick() {
        finish();
    }

    /**
     * 右边图标的点击事件，子类可重写
     */
    protected void rightIconOnClick() {
    }

    /**
     * 右边文字的点击事件，子类可重写
     */
    protected void rightTextOnClick() {
    }

    /**
     * 右边图标文字的点击事件，子类可重写
     */
    protected void rightIconTextOnClick() {
    }

}
