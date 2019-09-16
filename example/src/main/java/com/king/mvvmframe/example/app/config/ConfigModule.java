package com.king.mvvmframe.example.app.config;

import android.content.Context;

import com.google.gson.GsonBuilder;
import com.king.frame.mvvmframe.config.FrameConfigModule;
import com.king.mvvmframe.example.app.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;


/**
 * 自定义全局配置
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class ConfigModule extends FrameConfigModule {
 @Override
 public void applyOptions(Context context, com.king.frame.mvvmframe.di.module.ConfigModule.Builder builder) {
  builder.baseUrl(Constants.BASE_URL)//TODO 配置Retrofit中的baseUrl
   .retrofitOptions(new RetrofitOptions() {
    @Override
    public void applyOptions(Retrofit.Builder builder) {
     //TODO 配置Retrofit
     //如想使用RxJava
     //builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }
   })
   .okHttpClientOptions(new OkHttpClientOptions() {
    @Override
    public void applyOptions(OkHttpClient.Builder builder) {
     //TODO 配置OkHttpClient
    }
   })
   .gsonOptions(new GsonOptions() {
    @Override
    public void applyOptions(GsonBuilder builder) {
     //TODO 配置Gson
    }
   });
 }
}
