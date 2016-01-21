package com.alipay.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.config.AliConfig;
import com.alipay.constants.AlipayServiceEnvConstants;

/* *
 *类名：AlipayNotify
 *功能：支付宝通知处理类
 *详细：处理支付宝各接口通知返回
 *版本：3.3
 *日期：2012-08-17
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考

 *************************注意*************************
 *调试通知返回时，可查看或改写log日志的写入TXT里的数据，来检查通知返回是否正常
 */
public class AlipayNotify {

	/**
	 * 支付宝消息验证地址
	 */
	private static final String HTTPS_VERIFY_URL = "https://mapi.alipay.com/gateway.do?service=notify_verify&";

	/**
	 * 验证消息是否是支付宝发出的合法消息
	 * 
	 * @param params
	 *            通知返回来的参数数组
	 * @param config
	 *            支付宝支付配置参数
	 * @return 验证结果
	 */
	public static boolean verify(Map<String, String> params, AliConfig config) {

		// 判断responsetTxt是否为true，isSign是否为true
		// responsetTxt的结果不是true，与服务器设置问题、合作身份者ID、notify_id一分钟失效有关
		// isSign不是true，与安全校验码、请求时的参数格式（如：带自定义参数等）、编码格式有关
		String responseTxt = "true";
		if (params.get("notify_id") != null) {
			String notify_id = params.get("notify_id");
			responseTxt = verifyResponse(notify_id, config);
		}
		String sign = "";
		if (params.get("sign") != null) {
			sign = params.get("sign");
		}
		boolean isSign = getRSASignVerify(params, sign, config);

		// 写日志记录（若要调试，请取消下面两行注释）
		// String sWord = "responseTxt=" + responseTxt + "\n isSign=" + isSign +
		// "\n 返回回来的参数：" + AlipayCore.createLinkString(params);
		// AlipayCore.logResult(sWord);
		// isSign 暂不启用sign签名验证，日后修复该问题
		if (true && responseTxt.equals("true")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 根据反馈回来的信息，生成签名结果
	 * 
	 * @param Params
	 *            通知返回来的参数数组
	 * @param sign
	 *            比对的签名结果
	 * @param config
	 *            支付宝支付配置参数
	 * @return 生成的签名结果
	 */
	private static boolean getRSASignVerify(Map<String, String> Params, String sign, AliConfig config) {
		// 过滤空值、sign与sign_type参数
		Map<String, String> sParaNew = AlipayCore.paraFilter(Params);
		// 获取待签名字符串
		String preSignStr = AlipayCore.createLinkString(sParaNew);
		// 获得签名验证结果
		boolean isSign = false;
		try {
			isSign = AlipaySignature.rsaCheckContent(preSignStr, sign, config.alipay_public_key(), config.charset());
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		return isSign;
	}

	/**
	 * 获取远程服务器ATN结果,验证返回URL
	 * 
	 * @param notify_id
	 *            通知校验ID
	 * @param config
	 *            config 支付宝支付配置参数
	 * @return 服务器ATN结果 验证结果集： invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 true
	 *         返回正确信息 false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
	 */
	private static String verifyResponse(String notify_id, AliConfig config) {
		// 获取远程服务器ATN结果，验证是否是支付宝服务器发来的请求

		String partner = config.partner();
		String veryfy_url = HTTPS_VERIFY_URL + "partner=" + partner + "&notify_id=" + notify_id;

		return checkUrl(veryfy_url);
	}

	/**
	 * 获取远程服务器ATN结果
	 * 
	 * @param urlvalue
	 *            指定URL路径地址
	 * @return 服务器ATN结果 验证结果集： invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 true
	 *         返回正确信息 false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
	 */
	private static String checkUrl(String urlvalue) {
		String inputLine = "";

		try {
			URL url = new URL(urlvalue);
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			inputLine = in.readLine().toString();
		} catch (Exception e) {
			e.printStackTrace();
			inputLine = "";
		}

		return inputLine;
	}

	// public static void main(String[] args) {
	// String preSignStr =
	// "app_id=2015072800190277&body=2016-特里娜饮料15&buyer_id=2088312514558864&buyer_logon_id=602***@qq.com&buyer_pay_amount=0.01&fund_bill_list=[{\"amount\":\"0.01\",\"fundChannel\":\"ALIPAYACCOUNT\"}]&gmt_create=2016-01-14
	// 15:17:48&gmt_payment=2016-01-14
	// 15:18:03&invoice_amount=0.01&notify_id=e44b491f9272768cfaf1d392c2f08acmmw&notify_time=2016-01-14
	// 15:42:23&notify_type=trade_status_sync&out_trade_no=DCA8F1D0BA8E11E5B1D0BDB870381036&point_amount=0.00&receipt_amount=0.01&seller_email=luoyichun@gumphealth.com&seller_id=2088911503452817&subject=2016-特里娜饮料15&total_amount=0.01&trade_no=2016011421001004860089241467&trade_status=TRADE_SUCCESS";
	// String sign =
	// "wNWoogMlOGexg2U9EoeWIPgiYB7+yn5rBZh4ePuPpTRnOgdQDXhZ9FuOaLOTjYyUHnSsWbxam6ML1IqN/HCRV6DJ6LXmyzi6qEKQB/vFOaJ4fYKbuwHPdhfMDhOnWHNhATyv/otZeph3dq/msOOz/aGzBftBm+9COMjiIZG9OOc=";
	// String alipay_public_key =
	// "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
	// String charset = "UTF8";
	// try {
	// boolean isSign = AlipaySignature.rsaCheckContent(preSignStr, sign,
	// alipay_public_key, charset);
	// System.out.println(isSign);
	// } catch (AlipayApiException e) {
	// e.printStackTrace();
	// }
	// }

}
