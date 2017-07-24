package com.xiaoyuan.hloli.ui.me.model;

import com.xiaoyuan.hloli.bean.LoginEntity;
import com.xiaoyuan.hloli.http.HttpMethod;
import com.xiaoyuan.hloli.ui.me.contract.LoginContract;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by yzc on 2017/7/19.
 */

public class LoginModelImpl implements LoginContract.Model {

    @Override
    public void getLoginData(String name, String pwd, Action1<LoginEntity> s) {
        HttpMethod.getInstance().requestLogin(name,pwd).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(s);
    }
}
