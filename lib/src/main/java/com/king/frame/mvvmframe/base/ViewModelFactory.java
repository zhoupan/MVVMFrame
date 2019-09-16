package com.king.frame.mvvmframe.base;


import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class ViewModelFactory implements ViewModelProvider.Factory {

 private final Map<Class<? extends ViewModel>, Provider<ViewModel>> creators;

 @Inject
 public ViewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
  this.creators = creators;
 }

 @NonNull
 @Override
 public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
  Provider<? extends ViewModel> creator = creators.get(modelClass);
  if (creator == null) {
   for (Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>> entry : creators.entrySet()) {
    if (modelClass.isAssignableFrom(entry.getKey())) {
     creator = entry.getValue();
    }
   }
  }

  if (creator == null) {
   throw new IllegalArgumentException("Unknown model class " + modelClass);
  }

  try {
   return (T) creator.get();
  } catch (Exception e) {
   throw new RuntimeException(e);
  }
 }
}

