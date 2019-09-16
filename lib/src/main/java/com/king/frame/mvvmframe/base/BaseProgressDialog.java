package com.king.frame.mvvmframe.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;

import androidx.annotation.NonNull;

import com.king.frame.mvvmframe.R;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class BaseProgressDialog extends Dialog {

 public BaseProgressDialog(@NonNull Context context) {
  this(context, R.style.mvvmframe_progress_dialog);
 }

 public BaseProgressDialog(@NonNull Context context, int themeResId) {
  super(context, themeResId);
  initUI();
 }

 public BaseProgressDialog(@NonNull Context context, boolean cancelable, DialogInterface.OnCancelListener cancelListener) {
  super(context, cancelable, cancelListener);
  initUI();
 }

 public static BaseProgressDialog newInstance(Context context) {
  return new BaseProgressDialog(context);
 }

 private void initUI() {
  getWindow().getAttributes().gravity = Gravity.CENTER;
  setCanceledOnTouchOutside(false);
 }

}
