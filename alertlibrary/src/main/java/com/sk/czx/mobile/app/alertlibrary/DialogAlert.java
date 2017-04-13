package com.sk.czx.mobile.app.alertlibrary;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by czx on 2017/4/10.
 */

public class DialogAlert extends Dialog implements View.OnClickListener{

    public static final int ALERT_DEFAULT = 0;
    public static final int ALERT_WARNING = 1;
    public static final int ALERT_ERROR = 2;
    public static final int ALERT_SUCCESS = 3;
    private LinearLayout top;
    private String msg;
    private String title_text;
    private String cancel_text;
    private String submit_text;
    private int type;
    private Context context;
    private OnDialogAlertClickListener listener;

    public void setOnDialogAlertClickListener(OnDialogAlertClickListener listener){
        this.listener = listener;
    }

    public interface OnDialogAlertClickListener {
        void onSubmitClick(DialogAlert dialogAlert);
        void onCancelClick(DialogAlert dialogAlert);
    }

    public DialogAlert(Context context, int type){
        super(context,R.style.record_voice_dialog);
        this.type = type;
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public void init(){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_dialog, null);
        setContentView(view);
        setCanceledOnTouchOutside(false);

        top = (LinearLayout) view.findViewById(R.id.top);
        if(type == ALERT_DEFAULT){
            top.setBackgroundResource(R.color.colorPrimary);
        }else if(type == ALERT_WARNING){
            top.setBackgroundResource(R.color.dialog_alert_warning);
        }else if(type == ALERT_ERROR){
            top.setBackgroundResource(R.color.dialog_alert_error);
        }else if(type == ALERT_SUCCESS){
            top.setBackgroundResource(R.color.dialog_alert_success);
        }
        TextView context_tv = (TextView) view.findViewById(R.id.context);
        TextView title = (TextView) view.findViewById(R.id.title);
        LinearLayout linear = (LinearLayout) view.findViewById(R.id.linear);
        LinearLayout title_layout = (LinearLayout) view.findViewById(R.id.title_layout);
        TextView cancel = (TextView) view.findViewById(R.id.cancel);
        TextView submit = (TextView) view.findViewById(R.id.submit);

        if(title_text == null || title_text.isEmpty()){
            title_layout.setVisibility(View.GONE);
            linear.setVisibility(View.GONE);
        }else{
            title_layout.setVisibility(View.VISIBLE);
            linear.setVisibility(View.VISIBLE);
        }
        title.setText(title_text);
        context_tv.setText(msg);
        submit.setText(submit_text);
        cancel.setText(cancel_text);
        cancel.setOnClickListener(this);
        submit.setOnClickListener(this);
        Window window = getWindow();
        window.setGravity(Gravity.CENTER);
        window.setWindowAnimations(R.style.DialogAnimation);
        WindowManager m = ((Activity) context).getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = (int) (d.getWidth() * 0.9);
        getWindow().setAttributes(p);
    }

    public DialogAlert setMsg(String msg){
       this.msg = msg;
        return this;
    }

    public DialogAlert setSubmitText(String text){
        this.submit_text = text;
        return this;
    }

    public DialogAlert setCancelText(String text){
        this.cancel_text = text;
        return this;
    }

    public DialogAlert setTitle(String text){
        this.title_text = text;
        return this;
    }

    public DialogAlert showAlert(){
        this.show();
        return this;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.cancel) {
            listener.onCancelClick(this);
        } else if (i == R.id.submit) {
            listener.onSubmitClick(this);

        }
    }

}
