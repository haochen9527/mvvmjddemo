package com.example.mvvmdemo.https;

import com.example.mvvmdemo.entity.ProductEntity;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ApiService {

    //登录
    @FormUrlEncoded
    @POST("/buildcloudMobile/login")
    Observable<ProductEntity> login(@FieldMap Map<String, Object> map);

}
