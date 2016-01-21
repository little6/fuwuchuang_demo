package com.alipay.util;

import java.util.HashMap;
import java.util.Map;

import com.alipay.bean.AlipayTradeNotifyResponse;

/**
 * 创建待验证map，用于进行verify操作
 * 
 * @author Yujinshui
 *
 */
public class MapUtil {
	/**
	 * 创建map内容，用于进行支付宝参数验签
	 * 
	 * @param aliNotifyRes
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月14日 上午11:41:04
	 */
	public static Map<String, String> createVerifyMap(AlipayTradeNotifyResponse aliNotifyRes) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("notify_time", aliNotifyRes.getNotify_time());//
		map.put("notify_type", aliNotifyRes.getNotify_type());//
		map.put("notify_id", aliNotifyRes.getNotify_id());//
		map.put("sign_type", aliNotifyRes.getSign_type());//
		map.put("sign", aliNotifyRes.getSign());//
		map.put("trade_no", aliNotifyRes.getTrade_no());//
		map.put("app_id", aliNotifyRes.getApp_id());//
		map.put("out_trade_no", aliNotifyRes.getOut_trade_no());//
		map.put("out_biz_no", aliNotifyRes.getOut_biz_no());//
		map.put("buyer_id", aliNotifyRes.getBuyer_id());//
		map.put("buyer_logon_id", aliNotifyRes.getBuyer_logon_id());//
		map.put("seller_id", aliNotifyRes.getSeller_id());//
		map.put("seller_email", aliNotifyRes.getSeller_email());//
		map.put("trade_status", aliNotifyRes.getTrade_status());//
		map.put("total_amount", aliNotifyRes.getTotal_amount());//
		map.put("receipt_amount", aliNotifyRes.getReceipt_amount());//
		map.put("invoice_amount", aliNotifyRes.getInvoice_amount());//
		map.put("buyer_pay_amount", aliNotifyRes.getBuyer_pay_amount());//
		map.put("point_amount", aliNotifyRes.getPoint_amount());//
		map.put("refund_fee", aliNotifyRes.getRefund_fee());//
		map.put("send_back_fee", aliNotifyRes.getSend_back_fee());//
		map.put("subject", aliNotifyRes.getSubject());//
		map.put("body", aliNotifyRes.getBody());//
		map.put("gmt_create", aliNotifyRes.getGmt_create());//
		map.put("gmt_payment", aliNotifyRes.getGmt_payment());//
		map.put("gmt_refund", aliNotifyRes.getGmt_refund());//
		map.put("gmt_close", aliNotifyRes.getGmt_close());//
		map.put("fund_bill_list", aliNotifyRes.getFund_bill_list());//

		return map;
	}

	private MapUtil() {

	}

}
