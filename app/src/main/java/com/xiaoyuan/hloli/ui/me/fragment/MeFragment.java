package com.xiaoyuan.hloli.ui.me.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.xiaoyuan.hloli.R;
import com.xiaoyuan.hloli.ui.base.BaseFragment;
import com.xiaoyuan.hloli.ui.me.activity.LoginActivity;

import butterknife.Bind;

/**
 * Created by yzc on 2017/7/19.
 */

public class MeFragment extends BaseFragment {

    @Bind(R.id.bt)
    TextView mBt;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_me;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
