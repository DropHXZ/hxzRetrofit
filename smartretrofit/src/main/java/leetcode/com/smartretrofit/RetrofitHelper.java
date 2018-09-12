package leetcode.com.smartretrofit;

/**
 * create by huzx on 2018/9/12
 * 功能：
 */
public class RetrofitHelper {

	private static RetrofitHelper retrofitHelper = null;

	public RetrofitHelper getInstence() {
		if (retrofitHelper == null) {
			retrofitHelper = new RetrofitHelper();
		}
		return retrofitHelper;
	}

	private RetrofitHelper() {

	}
}
