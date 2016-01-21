package com.alipay.bean;

/**
 * 二维码支付成功后-异步回调接口封装bean
 * 
 * @author Yujinshui
 *
 */
public class AlipayTradeNotifyResponse {
	private String notify_time;// |通知时间 |
	private String notify_type;// | 通知类型 |
	private String notify_id;// | 通知校验ID |
	private String sign_type;// | 签名类型 |
	private String sign;// | 签名 |
	private String trade_no;// | 支付宝交易号 |
	private String app_id;// | 开发者的app_id |
	private String out_trade_no;// | 商户订单号 |
	private String out_biz_no;// | 商户业务号 |
	private String buyer_id;// | 买家支付宝用户号 |
	private String buyer_logon_id;// | 买家支付宝账号 |
	private String seller_id;// | 卖家支付宝用户号 |
	private String seller_email;// | 卖家支付宝账号 |
	private String trade_status;// | 交易状态 |
	private String total_amount;// | 订单金额 |
	private String receipt_amount;// | 实收金额 |
	private String invoice_amount;// | 开票金额 |
	private String buyer_pay_amount;// | 付款金额 |
	private String point_amount;// | 积分宝金额 |
	private String refund_fee;// | 总退款金额 |
	private String send_back_fee;// | 实际退款金额 |
	private String subject;// | 订单标题 |
	private String body;// | 商品描述 |
	private String gmt_create;// | 交易创建时间 |
	private String gmt_payment;// | 交易付款时间 |
	private String gmt_refund;// | 交易退款时间 |
	private String gmt_close;// | 交易结束时间 |
	private String fund_bill_list;// | 支付金额信息 |

	/**
	 * 通知时间 | Date |是 | 通知的发送时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @param notify_time
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:35
	 */
	public void setNotify_time(String notify_time) {
		this.notify_time = notify_time;
	}

	/**
	 * 通知类型 |String(64) |是 | 通知的类型 |
	 * 
	 * @param notify_type
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:43
	 */
	public void setNotify_type(String notify_type) {
		this.notify_type = notify_type;
	}

	/**
	 * 通知校验ID |String(128) | 是 | 通知校验ID |
	 * 
	 * @param notify_id
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:49
	 */
	public void setNotify_id(String notify_id) {
		this.notify_id = notify_id;
	}

	/**
	 * 签名类型 |String(10) |是 | 签名算法类型，目前支持RSA |
	 * 
	 * @param sign_type
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:55
	 */
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	/**
	 * 签名 |String(256) | 是 | 请参考签名 |
	 * 
	 * @param sign
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:01
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * 支付宝交易号 |String(64) |是 | 支付宝交易凭证号 |
	 * 
	 * @param trade_no
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:06
	 */
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	/**
	 * 开发者的app_id |String(32) |是 | 支付宝分配给开发者的应用Id |
	 * 
	 * @param app_id
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:11
	 */
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	/**
	 * 商户订单号 |String(64) |是 | 原支付请求的商户订单号 |
	 * 
	 * @param out_trade_no
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:17
	 */
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	/**
	 * 商户业务号 |String(64) |否 | 商户业务ID，主要是退款通知中返回退款申请的流水号 |
	 * 
	 * @param out_biz_no
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:22
	 */
	public void setOut_biz_no(String out_biz_no) {
		this.out_biz_no = out_biz_no;
	}

	/**
	 * 买家支付宝用户号 |String(16) |否 | 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字 |
	 * 
	 * @param buyer_id
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:27
	 */
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	/**
	 * 买家支付宝账号 |String(100) | 否 | 买家支付宝账号 |
	 * 
	 * @param buyer_logon_id
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:33
	 */
	public void setBuyer_logon_id(String buyer_logon_id) {
		this.buyer_logon_id = buyer_logon_id;
	}

	/**
	 * 卖家支付宝用户号 |String(30) |否 | 卖家支付宝用户号 |
	 * 
	 * @param seller_id
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:38
	 */
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	/**
	 * 卖家支付宝账号 |String(100) | 否 | 卖家支付宝账号 |
	 * 
	 * @param seller_email
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:42
	 */
	public void setSeller_email(String seller_email) {
		this.seller_email = seller_email;
	}

	/**
	 * 交易状态 |String(32) |否 | 交易目前所处的状态 |
	 * 
	 * @param trade_status
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:48
	 */
	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
	}

	/**
	 * 订单金额 |Number(9,2) | 否 | 本次交易支付的订单金额，单位为人民币（元） |
	 * 
	 * @param total_amount
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:52
	 */
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	/**
	 * 实收金额 |Number(9,2) | 否 | 商家在交易中实际收到的款项，单位为元 |
	 * 
	 * @param receipt_amount
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:59
	 */
	public void setReceipt_amount(String receipt_amount) {
		this.receipt_amount = receipt_amount;
	}

	/**
	 * 开票金额 |Number(9,2) | 否 | 用户在交易中支付的可开发票的金额 |
	 * 
	 * @param invoice_amount
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:04
	 */
	public void setInvoice_amount(String invoice_amount) {
		this.invoice_amount = invoice_amount;
	}

	/**
	 * 付款金额 |Number(9,2) | 否 | 用户在交易中支付的金额 |
	 * 
	 * @param buyer_pay_amount
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:10
	 */
	public void setBuyer_pay_amount(String buyer_pay_amount) {
		this.buyer_pay_amount = buyer_pay_amount;
	}

	/**
	 * 积分宝金额 |Number(9,2) | 否 | 使用积分宝支付的金额 |
	 * 
	 * @param point_amount
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:16
	 */
	public void setPoint_amount(String point_amount) {
		this.point_amount = point_amount;
	}

	/**
	 * 总退款金额 |Number(9,2) | 否 | 退款通知中，返回总退款金额，单位为元，支持两位小数 |
	 * 
	 * @param refund_fee
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:21
	 */
	public void setRefund_fee(String refund_fee) {
		this.refund_fee = refund_fee;
	}

	/**
	 * 实际退款金额 |Number(9,2) | 否 | 商户实际退款给用户的金额，单位为元，支持两位小数 |
	 * 
	 * @param send_back_fee
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:27
	 */
	public void setSend_back_fee(String send_back_fee) {
		this.send_back_fee = send_back_fee;
	}

	/**
	 * 订单标题 |String(256) | 否 | 商品的标题/交易标题/订单标题/订单关键字等，是请求时对应的参数，原样通知回来 |
	 * 
	 * @param subject
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:32
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 商品描述 |String(400) | 否 | 该订单的备注、描述、明细等。对应请求时的body参数，原样通知回来 |
	 * 
	 * @param body
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:38
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * 交易创建时间 |Date |否 | 该笔交易创建的时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @param gmt_create
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:44
	 */
	public void setGmt_create(String gmt_create) {
		this.gmt_create = gmt_create;
	}

	/**
	 * 交易付款时间 |Date |否 | 该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @param gmt_payment
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:49
	 */
	public void setGmt_payment(String gmt_payment) {
		this.gmt_payment = gmt_payment;
	}

	/**
	 * 交易退款时间 |Date |否 | 该笔交易的退款时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @param gmt_refund
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:56
	 */
	public void setGmt_refund(String gmt_refund) {
		this.gmt_refund = gmt_refund;
	}

	/**
	 * 交易结束时间 |Date |否 | 该笔交易结束时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @param gmt_close
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:02:02
	 */
	public void setGmt_close(String gmt_close) {
		this.gmt_close = gmt_close;
	}

	/**
	 * 支付金额信息 |String(512) | 否 | 支付成功的各个渠道金额信息，详见资金明细信息说明 |
	 * 
	 * @param fund_bill_list
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:02:07
	 */
	public void setFund_bill_list(String fund_bill_list) {
		this.fund_bill_list = fund_bill_list;
	}

	/**
	 * 通知时间 | Date |是 | 通知的发送时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:27
	 */
	public String getNotify_time() {
		return notify_time;
	}

	/**
	 * 通知类型 |String(64) |是 | 通知的类型 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:40
	 */
	public String getNotify_type() {
		return notify_type;
	}

	/**
	 * 通知校验ID |String(128) | 是 | 通知校验ID |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:45
	 */
	public String getNotify_id() {
		return notify_id;
	}

	/**
	 * 签名类型 |String(10) |是 | 签名算法类型，目前支持RSA |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:53
	 */
	public String getSign_type() {
		return sign_type;
	}

	/**
	 * 签名 |String(256) | 是 | 请参考签名 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午4:59:58
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * 支付宝交易号 |String(64) |是 | 支付宝交易凭证号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:04
	 */
	public String getTrade_no() {
		return trade_no;
	}

	/**
	 * 开发者的app_id |String(32) |是 | 支付宝分配给开发者的应用Id |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:09
	 */
	public String getApp_id() {
		return app_id;
	}

	/**
	 * 商户订单号 |String(64) |是 | 原支付请求的商户订单号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:14
	 */
	public String getOut_trade_no() {
		return out_trade_no;
	}

	/**
	 * 商户业务号 |String(64) |否 | 商户业务ID，主要是退款通知中返回退款申请的流水号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:19
	 */
	public String getOut_biz_no() {
		return out_biz_no;
	}

	/**
	 * 买家支付宝用户号 |String(16) |否 | 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:24
	 */
	public String getBuyer_id() {
		return buyer_id;
	}

	/**
	 * 买家支付宝账号 |String(100) | 否 | 买家支付宝账号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:30
	 */
	public String getBuyer_logon_id() {
		return buyer_logon_id;
	}

	/**
	 * 卖家支付宝用户号 |String(30) |否 | 卖家支付宝用户号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:35
	 */
	public String getSeller_id() {
		return seller_id;
	}

	/**
	 * 卖家支付宝账号 |String(100) | 否 | 卖家支付宝账号 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:40
	 */
	public String getSeller_email() {
		return seller_email;
	}

	/**
	 * 交易状态 |String(32) |否 | 交易目前所处的状态 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:46
	 */
	public String getTrade_status() {
		return trade_status;
	}

	/**
	 * 订单金额 |Number(9,2) | 否 | 本次交易支付的订单金额，单位为人民币（元） |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:50
	 */
	public String getTotal_amount() {
		return total_amount;
	}

	/**
	 * 实收金额 |Number(9,2) | 否 | 商家在交易中实际收到的款项，单位为元 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:00:56
	 */
	public String getReceipt_amount() {
		return receipt_amount;
	}

	/**
	 * 开票金额 |Number(9,2) | 否 | 用户在交易中支付的可开发票的金额 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:01
	 */
	public String getInvoice_amount() {
		return invoice_amount;
	}

	/**
	 * 付款金额 |Number(9,2) | 否 | 用户在交易中支付的金额 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:08
	 */
	public String getBuyer_pay_amount() {
		return buyer_pay_amount;
	}

	/**
	 * 积分宝金额 |Number(9,2) | 否 | 使用积分宝支付的金额 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:12
	 */
	public String getPoint_amount() {
		return point_amount;
	}

	/**
	 * 总退款金额 |Number(9,2) | 否 | 退款通知中，返回总退款金额，单位为元，支持两位小数 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:19
	 */
	public String getRefund_fee() {
		return refund_fee;
	}

	/**
	 * 实际退款金额 |Number(9,2) | 否 | 商户实际退款给用户的金额，单位为元，支持两位小数 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:24
	 */
	public String getSend_back_fee() {
		return send_back_fee;
	}

	/**
	 * 订单标题 |String(256) | 否 | 商品的标题/交易标题/订单标题/订单关键字等，是请求时对应的参数，原样通知回来 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:29
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 商品描述 |String(400) | 否 | 该订单的备注、描述、明细等。对应请求时的body参数，原样通知回来 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:36
	 */
	public String getBody() {
		return body;
	}

	/**
	 * 交易创建时间 |Date |否 | 该笔交易创建的时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:41
	 */
	public String getGmt_create() {
		return gmt_create;
	}

	/**
	 * 交易付款时间 |Date |否 | 该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:47
	 */
	public String getGmt_payment() {
		return gmt_payment;
	}

	/**
	 * 交易退款时间 |Date |否 | 该笔交易的退款时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:53
	 */
	public String getGmt_refund() {
		return gmt_refund;
	}

	/**
	 * 交易结束时间 |Date |否 | 该笔交易结束时间。格式为yyyy-MM-dd HH:mm:ss |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:01:59
	 */
	public String getGmt_close() {
		return gmt_close;
	}

	/**
	 * 支付金额信息 |String(512) | 否 | 支付成功的各个渠道金额信息，详见资金明细信息说明 |
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月13日 下午5:02:04
	 */
	public String getFund_bill_list() {
		return fund_bill_list;
	}
}
