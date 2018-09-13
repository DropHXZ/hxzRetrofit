package leetcode.com.smartretrofit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * create by huzx on 2018/9/13
 * 功能：
 */
public class Utils {

	public static String getVersionName(Context context){
		PackageManager manager = context.getPackageManager();
		String packageName = context.getPackageName();
		try {
			PackageInfo info = manager.getPackageInfo(packageName,0);
			return info.versionName;
		} catch (PackageManager.NameNotFoundException e){
			return "";
		}
	}
}
