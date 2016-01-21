package com.alipay;

import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.config.AliConfig;

/**
 * 支付宝服务接口
 * 
 * @author Yujinshui
 *
 */
public interface AliTradeService {
	/**
	 * 交易查询
	 * 
	 * @param out_trade_no
	 *            商户交易订单号
	 * @param config
	 *            支付账号参数配置
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月15日 上午11:32:00
	 */
	AlipayTradeQueryResponse query(String out_trade_no, AliConfig config);
}
