package com.example.androidbase.rxjava;

import android.app.Application;
import android.provider.Settings;
import android.widget.Toast;

import com.example.androidbase.BaseApplication;

import rx.Subscriber;

public class SubscriberCallBack<T> extends Subscriber<T> {
    private ApiCallback<T> apiCallback;

    public SubscriberCallBack(ApiCallback<T> apiCallback) {
        this.apiCallback = apiCallback;
    }

    @Override
    public void onStart() {
        apiCallback.onStart();
    }

    @Override
    public void onCompleted() {
        apiCallback.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
//        Toast.makeText(BaseApplication.getContext(),e.toString(),Toast.LENGTH_LONG).show();
        e.printStackTrace();
        System.out.print(e.toString());
        apiCallback.onFaild("系统繁忙,请稍候再试！");
        apiCallback.onCompleted();
    }

    @Override
    public void onNext(T t) {
        if(t==null){
        }
        else{
        }
        apiCallback.onSuccess(t);
    }
}
