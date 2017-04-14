# android AlertView
A very simple dialog alert

###Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

###Step 2. Add the dependency

	dependencies {
	        compile 'com.github.yzcheng90:AlertView:1.0'
	}

### Or clone to local

	compile project(path: ':alertlibrary')

### invoking
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