# AlertView
一个非常简洁的dialog alert

### 使用方法 下载clone到本地
compile project(path: ':alertlibrary')

### 调用方法
 new DialogAlert(activity,DialogAlert.ALERT_DEFAULT)
                .setMsg("这里是消息内容")
                .setTitle("提示信息")
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
 


![image](https://github.com/yzcheng90/AlertView/blob/master/pic/2017-04-13-16-33-27.png)
![image](https://github.com/yzcheng90/AlertView/blob/master/pic/2017-04-13-16-33-56.png)
![image](https://github.com/yzcheng90/AlertView/blob/master/pic/2017-04-13-16-34-03.png)
![image](https://github.com/yzcheng90/AlertView/blob/master/pic/2017-04-13-16-34-09.png)
![image](https://github.com/yzcheng90/AlertView/blob/master/pic/2017-04-13-16-34-15.png)