package com.xiaoyuan.hloli.ui.me.contract;

import com.xiaoyuan.hloli.bean.LoginEntity;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by yzc on 2017/7/19.
 */

public interface LoginService {

//    @FormUrlEncoded
//    @POST(Constant.UPLOAD_CHECK_URL)
//    public Call<UploadCheckEntity> check(@Field("pid") String pid, @Field("name") String name, @Header("Cookie") String cookie);

    @FormUrlEncoded
    @POST("/dologin.html")
    public Call<LoginEntity> getLogin(@Field("name") String name, @Field("password") String password);
}
