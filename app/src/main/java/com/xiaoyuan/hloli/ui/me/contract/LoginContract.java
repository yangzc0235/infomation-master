package com.xiaoyuan.hloli.ui.me.contract;

import com.xiaoyuan.hloli.bean.LoginEntity;
import com.xiaoyuan.hloli.ui.base.BaseModel;
import com.xiaoyuan.hloli.ui.base.BasePresenter;
import com.xiaoyuan.hloli.ui.base.BaseView;

import rx.functions.Action1;

/**
 * Created by yzc on 2017/7/19.
 */

public interface LoginContract {
    interface View extends BaseView {
        void onLoginDataPost(LoginEntity data);
    }

     abstract class Presenter extends BasePresenter<LoginContract.View, LoginContract.Model> {
        public abstract void getLoginData(String name,String pwd);
    }

    interface Model extends BaseModel {
        void getLoginData(String name,String pwd,Action1<LoginEntity> s);

    }
}
