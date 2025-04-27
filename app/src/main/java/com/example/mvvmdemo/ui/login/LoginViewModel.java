package com.example.mvvmdemo.ui.login;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.example.mvvmdemo.entity.LoginResponseEntity;
import com.example.mvvmdemo.https.ApiService;
import com.example.mvvmdemo.https.RetrofitClient;
import com.example.mvvmdemo.ui.product.ProductActivity;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.utils.RxUtils;
import me.goldze.mvvmhabit.utils.ToastUtils;

public class LoginViewModel extends BaseViewModel {

    public ObservableField<String> mUsernameField = new ObservableField<>("");

    public ObservableField<String> mPasswordField = new ObservableField<>("");

    public SingleLiveEvent<String> mImageChangeEvent = new SingleLiveEvent();

    public SingleLiveEvent<Boolean> mPasswordSwitchEvent = new SingleLiveEvent<>();


    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    //登录的逻辑
    public BindingCommand loginCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            login();
        }

        private void login() {
            if (mUsernameField.get() == null) {
                Toast.makeText(getApplication(), "请输入用户名", Toast.LENGTH_SHORT).show();
                return;
            }
            if (mPasswordField.get() == null) {
                Toast.makeText(getApplication(), "请输入密码", Toast.LENGTH_SHORT).show();
                return;
            }

            Map<String, Object> map = new HashMap<>();

            map.put("username", mUsernameField.get());
            map.put("password", mPasswordField.get());
            RetrofitClient.getInstance().create(ApiService.class)
                    .login(map)
                    .compose(RxUtils.bindToLifecycle(getLifecycleProvider()))
                    .compose(RxUtils.schedulersTransformer())
                    .compose(RxUtils.exceptionTransformer())
                    .doOnSubscribe(new Consumer<Disposable>() {
                        @Override
                        public void accept(Disposable disposable) throws Exception {
                            showDialog("正在登录...");
                        }
                    })
                    .subscribe(new Consumer<LoginResponseEntity>() {
                                   @Override
                                   public void accept(LoginResponseEntity loginResponseEntity) throws Exception {
                                       //登录成功的逻辑
                                   }
                               }, new Consumer<Throwable>() {
                                   @Override
                                   public void accept(Throwable throwable) throws Exception {
                                       //登录失败的逻辑
                                       ToastUtils.showLong("没有数据库跳转到首页");
//                                       startActivity(ProductActivity.class);
                                   }
                               }
                    );
        }
    });


    public BindingCommand imageChangeCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            mImageChangeEvent.call();
        }
    });


    public BindingCommand<Boolean> mPasswordSwitchCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            mPasswordSwitchEvent.setValue(mPasswordSwitchEvent.getValue() == null || !mPasswordSwitchEvent.getValue());
        }
    });

    //清空用户名的逻辑
    public BindingCommand clearUsernameCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            mUsernameField.set("");
        }
    });
    //清空密码的逻辑
    public BindingCommand clearPasswordCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            mPasswordField.set("");
        }
    });




}
