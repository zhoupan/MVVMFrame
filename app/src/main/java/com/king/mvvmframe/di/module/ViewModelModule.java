package com.king.mvvmframe.di.module;


import androidx.lifecycle.ViewModel;

import com.king.frame.mvvmframe.di.scope.ViewModelKey;
import com.king.mvvmframe.app.likepoetry.LikePoetryViewModel;
import com.king.mvvmframe.app.poetry.PoetryViewModel;
import com.king.mvvmframe.app.poetrylite.PoetryLiteViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * ViewModel模块统一管理：通过{@link Binds}和{@link ViewModelKey}绑定关联对应的ViewModel
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module
public abstract class ViewModelModule {

 @Binds
 @IntoMap
 @ViewModelKey(PoetryViewModel.class)
 abstract ViewModel bindPoetryViewModel(PoetryViewModel viewModel);

 @Binds
 @IntoMap
 @ViewModelKey(PoetryLiteViewModel.class)
 abstract ViewModel bindPoetryLiteViewModel(PoetryLiteViewModel viewModel);

 @Binds
 @IntoMap
 @ViewModelKey(LikePoetryViewModel.class)
 abstract ViewModel bindLikePoetryViewModel(LikePoetryViewModel viewModel);

}
