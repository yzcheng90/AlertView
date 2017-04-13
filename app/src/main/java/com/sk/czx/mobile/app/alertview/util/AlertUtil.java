package com.sk.czx.mobile.app.alertview.util;

import android.app.Activity;
import com.sk.czx.mobile.app.alertlibrary.DialogAlert;
/**
 * Created by Administrator on 2017/1/12.
 */

public class AlertUtil {

    public static DialogAlert showError(Activity activity, String msg){
        DialogAlert dialogAlert = new DialogAlert(activity, DialogAlert.ALERT_ERROR)
        .setMsg(msg)
        .setSubmitText("确定")
        .setCancelText("取消")
        .showAlert();
        return dialogAlert;
    }

    public static void showWarning(Activity activity, String msg){
        new DialogAlert(activity,DialogAlert.ALERT_WARNING)
        .setMsg(msg)
        .setSubmitText("确定")
        .setCancelText("取消")
        .showAlert()
        .setOnDialogAlertClickListener(new DialogAlert.OnDialogAlertClickListener() {
            @Override
            public void onSubmitClick(DialogAlert d) {
                d.dismiss();
            }

            @Override
            public void onCancelClick(DialogAlert d) {
                d.dismiss();
            }
        });
    }

    public static void showSuccess(Activity activity, String msg){
        new DialogAlert(activity,DialogAlert.ALERT_SUCCESS)
            .setMsg(msg)
            .setSubmitText("确定")
            .setCancelText("取消")
            .showAlert()
            .setOnDialogAlertClickListener(new DialogAlert.OnDialogAlertClickListener() {
                @Override
                public void onSubmitClick(DialogAlert d) {
                    d.dismiss();
                }

                @Override
                public void onCancelClick(DialogAlert d) {
                    d.dismiss();
                }
            });
    }

    public static void showAlert(Activity activity, String msg){
        new DialogAlert(activity,DialogAlert.ALERT_DEFAULT)
                .setMsg(msg)
                .setSubmitText("确定")
                .setCancelText("取消")
                .showAlert()
                .setOnDialogAlertClickListener(new DialogAlert.OnDialogAlertClickListener() {
                    @Override
                    public void onSubmitClick(DialogAlert d) {
                        d.dismiss();
                    }

                    @Override
                    public void onCancelClick(DialogAlert d) {
                        d.dismiss();
                    }
                });
    }

    public static void showAlert(Activity activity, String msg,String title){
        new DialogAlert(activity,DialogAlert.ALERT_DEFAULT)
                .setMsg(msg)
                .setTitle(title)
                .setSubmitText("确定")
                .setCancelText("取消")
                .showAlert()
                .setOnDialogAlertClickListener(new DialogAlert.OnDialogAlertClickListener() {
                    @Override
                    public void onSubmitClick(DialogAlert d) {
                        d.dismiss();
                    }

                    @Override
                    public void onCancelClick(DialogAlert d) {
                        d.dismiss();
                    }
                });
    }
}
