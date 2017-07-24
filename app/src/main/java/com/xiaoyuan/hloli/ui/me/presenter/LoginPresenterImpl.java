package com.xiaoyuan.hloli.ui.me.presenter;

import com.xiaoyuan.hloli.bean.LoginEntity;
import com.xiaoyuan.hloli.ui.me.contract.LoginContract;

import rx.functions.Action1;

/**
 * Created by yzc on 2017/7/19.
 */

public class LoginPresenterImpl extends LoginContract.Presenter {

    @Override
    public void getLoginData(String name,String pwd) {
        mModel.getLoginData(name, pwd, new Action1<LoginEntity>() {
            @Override
            public void call(LoginEntity loginEntity) {
                mView.onLoginDataPost(loginEntity);
            }

        });
    }

}
