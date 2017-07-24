package com.xiaoyuan.hloli.utils;

import com.xiaoyuan.hloli.constant.Constant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gold on 2016.11.15.
 */
public class NetUtil {

    public static <T> T getRetrofit(Class<T> service){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL_3)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return (T)retrofit.create(service);
    }
}
