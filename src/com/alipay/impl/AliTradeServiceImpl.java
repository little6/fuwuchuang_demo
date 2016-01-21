package com.alipay.impl;

import org.apache.log4j.Logger;

import com.alipay.AliTradeService;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.config.AliConfig;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 支付宝服务接口实现类
 * 
 * @author Yujinshui
 *
 */
public class AliTradeServiceImpl implements AliTradeService {
	private static final Logger log = Logger.getLogger(AliTradeServiceImpl.class);

	/**
	 * 
	 * @see com.alipay.AliTradeService#query(java.lang.String,
	 *      com.alipay.config.AliConfig)
	 */
	@Override
	public AlipayTradeQueryResponse query(String out_trade_no, AliConfig config) {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient(config);
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		String biz_content = "{\"out_trade_no\":\"" + out_trade_no + "\"}";
		if (out_trade_no != null && !"".equals(out_trade_no))
			request.setBizContent(biz_content);
		AlipayTradeQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
		} catch (AlipayApiException e) {
			log.error("支付宝V4订单查询请求异常", e);
		}
		return response;
	}
}
