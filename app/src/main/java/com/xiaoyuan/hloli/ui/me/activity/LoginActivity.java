package com.xiaoyuan.hloli.ui.me.activity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiaoyuan.hloli.R;
import com.xiaoyuan.hloli.bean.LoginEntity;
import com.xiaoyuan.hloli.ui.base.BaseActivity;
import com.xiaoyuan.hloli.ui.me.contract.LoginService;
import com.xiaoyuan.hloli.utils.NetUtil;

import butterknife.Bind;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends BaseActivity{


    @Bind(R.id.title_left_activity_login)
    TextView titleLeftActivityLogin;
    @Bind(R.id.title_right_activity_login)
    TextView titleRightActivityLogin;
    @Bind(R.id.title_center_activity_login)
    TextView titleCenterActivityLogin;
    @Bind(R.id.rl_title)
    RelativeLayout rlTitle;
    @Bind(R.id.edt_phone_activity_login)
    EditText edtPhoneActivityLogin;
    @Bind(R.id.imgv_clear_num_activity_login)
    ImageView imgvClearNumActivityLogin;
    @Bind(R.id.ll_activity_login)
    LinearLayout llActivityLogin;
    @Bind(R.id.edt_pwd_activity_login)
    EditText edtPwdActivityLogin;
    @Bind(R.id.imgv_eye_activity_login)
    ImageView imgvEyeActivityLogin;
    @Bind(R.id.ll_activity_pwd)
    LinearLayout llActivityPwd;
    @Bind(R.id.bt_commit_activity_login)
    Button btCommitActivityLogin;
    @Bind(R.id.tv_phone_fast_activity_login)
    TextView tvPhoneFastActivityLogin;
    @Bind(R.id.tv_forget_pwd_activity_login)
    TextView tvForgetPwdActivityLogin;
    @Bind(R.id.imgv_wx_activity_login)
    ImageView imgvWxActivityLogin;
    @Bind(R.id.ll_activity_wx)
    LinearLayout llActivityWx;
    @Bind(R.id.imgv_wb_activity_login)
    ImageView imgvWbActivityLogin;
    @Bind(R.id.ll_activity_wb)
    LinearLayout llActivityWb;
    @Bind(R.id.imgv_qq_activity_login)
    ImageView imgvQqActivityLogin;
    @Bind(R.id.ll_activity_qq)
    LinearLayout llActivityQq;
    @Bind(R.id.ll_activity_qq_wx)
    LinearLayout llActivityQqWx;
    @Bind(R.id.rl_one)
    RelativeLayout rlOne;
    @Bind(R.id.activity_login)
    RelativeLayout activityLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

    }


    @OnClick(R.id.title_left_activity_login)
    public void onTitleLeftActivityLoginClicked() {
    }

    @OnClick(R.id.title_right_activity_login)
    public void onTitleRightActivityLoginClicked() {
    }

    @OnClick(R.id.title_center_activity_login)
    public void onTitleCenterActivityLoginClicked() {
    }

    @OnClick(R.id.imgv_clear_num_activity_login)
    public void onImgvClearNumActivityLoginClicked() {
    }

    @OnClick(R.id.imgv_eye_activity_login)
    public void onImgvEyeActivityLoginClicked() {
    }

    //登录
    @OnClick(R.id.bt_commit_activity_login)
    public void onBtCommitActivityLoginClicked() {
        String name=edtPhoneActivityLogin.getText().toString();
        String pwd=edtPwdActivityLogin.getText().toString();
        LoginService loginService= NetUtil.getRetrofit(LoginService.class);
        Call<LoginEntity> call = loginService.getLogin(name,pwd);
        call.enqueue(new Callback<LoginEntity>() {
            @Override
            public void onResponse(Call<LoginEntity> call, Response<LoginEntity> response) {
                LoginEntity loginEntity = response.body();
                System.out.println("system--------------->"+loginEntity);
                if(loginEntity.getMessage()==null){
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this, loginEntity.getMessage(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<LoginEntity> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "联网失败", Toast.LENGTH_SHORT).show();
            }
        });

    }

    //快速登录
    @OnClick(R.id.tv_phone_fast_activity_login)
    public void onTvPhoneFastActivityLoginClicked() {

    }

    //忘记密码
    @OnClick(R.id.tv_forget_pwd_activity_login)
    public void onTvForgetPwdActivityLoginClicked() {
    }

    //微信登录
    @OnClick(R.id.ll_activity_wx)
    public void onLlActivityWxClicked() {
    }

    //微博登录
    @OnClick(R.id.ll_activity_wb)
    public void onLlActivityWbClicked() {
    }

    @OnClick(R.id.ll_activity_qq)
    public void onLlActivityQqClicked() {
    }

    @OnClick(R.id.ll_activity_qq_wx)
    public void onLlActivityQqWxClicked() {
    }
}
