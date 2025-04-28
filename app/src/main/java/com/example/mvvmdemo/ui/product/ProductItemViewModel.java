package com.example.mvvmdemo.ui.product;

import androidx.annotation.NonNull;

import com.example.mvvmdemo.entity.ProductEntity;

import me.goldze.mvvmhabit.base.ItemViewModel;

//在ItemViewModel中声明实体类和viewModel
public class ProductItemViewModel extends ItemViewModel<ProductViewModel> {

    public ProductEntity productEntity;

    //构造方法声明viewModel和实体类
    public ProductItemViewModel(@NonNull ProductViewModel viewModel, ProductEntity entity) {
        super(viewModel);
        this.productEntity = entity;
    }

}
