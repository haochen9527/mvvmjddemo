package com.example.mvvmdemo.ui.product;

import android.app.Application;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.entity.ProductEntity;
import com.example.mvvmdemo.entity.TestEntity;
import com.example.mvvmdemo.ui.base.ToolbarViewModel;

import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.tatarka.bindingcollectionadapter2.BR;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class ProductViewModel extends ToolbarViewModel {

    //提供第一种样式数据源
    public ObservableList<ProductItemViewModel> observableList = new ObservableArrayList<>();

    //绑定第一种样式
    public ItemBinding<ProductItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.item_product);

    //提供第二种样式数据源
    public ObservableList<TestItemViewModel> observableList2 = new ObservableArrayList<>();

    //绑定第二种样式
    public ItemBinding<TestItemViewModel> itemBinding2 = ItemBinding.of(BR.testViewModel, R.layout.item_test);


    public ProductViewModel(@NonNull Application application) {
        super(application);
        requestDatas();
        initToolbar();
    }


    public void initToolbar() {
        //初始化标题栏
        setTitleText("列表");
        setRightText("设置");
        setLeftIconVisible(View.VISIBLE);

    }

    private void requestDatas() {
        observableList.add(new ProductItemViewModel(this, new ProductEntity("小米", "data:image/jpeg;base64,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")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("华为", "https://tse1-mm.cn.bing.net/th/id/OIP-C.HPsgqqo_QDnacGc95goolwHaFj?w=239&h=180&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("苹果", "https://tse2-mm.cn.bing.net/th/id/OIP-C.Jzoyr-sww_lhEgThhJNkhQHaHa?w=203&h=202&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("阿达三打五", "https://tse2-mm.cn.bing.net/th/id/OIP-C.8tYuzRiE9GMb0pMEl8BbRAHaEo?w=297&h=185&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("发发发", "https://tse1-mm.cn.bing.net/th/id/OIP-C.Bb53CsfGJ2Kmbouis4Zj3QHaFj?w=247&h=185&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("压风机房他今天已经", "https://tse2-mm.cn.bing.net/th/id/OIP-C.ORdLVjqOAebUmtfJnzCWSAHaE8?w=277&h=184&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("尬歌认识", "https://tse4-mm.cn.bing.net/th/id/OIP-C.yL-V6qIp4af36wK_Xwkh_wAAAA?w=277&h=184&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("干啥额干部", "https://tse4-mm.cn.bing.net/th/id/OIP-C.EG8ARSw6lTISorkQSHgMIwHaFs?w=244&h=187&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("电饭锅功能用途", "https://tse1-mm.cn.bing.net/th/id/OIP-C.wVH1RnQhi1ebymwH09QchQHaE7?w=289&h=193&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("过生日DVD方便不是的贴吧", "https://tse4-mm.cn.bing.net/th/id/OIP-C.Jzit_m_KgWR4RDgAnWMy7gHaFj?w=241&h=180&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("一控股与", "https://tse3-mm.cn.bing.net/th/id/OIP-C.VlYMSV8FfEMCUb0lz4O2MAHaE8?w=223&h=180&c=7&r=0&o=5&dpr=1.4&pid=1.7")));
        observableList.add(new ProductItemViewModel(this, new ProductEntity("没有的哦啊打开王建红i合计哦", "https://tse3-mm.cn.bing.net/th/id/OIP-C.i2BPRISpm3ifz_J7i0RiTwHaEK?w=303&h=180&c=7&r=0&o=5&dpr=1.4&pid=1.7")));


        observableList2.add(new TestItemViewModel(this, new TestEntity("哈哈哈", "123123")));
        observableList2.add(new TestItemViewModel(this, new TestEntity("阿达伟大伟大", "各色让国人")));
        observableList2.add(new TestItemViewModel(this, new TestEntity("达瓦达瓦达瓦", "府库")));

    }

}
