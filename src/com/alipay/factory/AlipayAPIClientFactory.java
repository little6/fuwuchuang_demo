/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.factory;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.config.AliConfig;
import com.alipay.constants.AlipayServiceEnvConstants;

/**
 * API调用客户端工厂
 * 
 * @author taixu.zqq
 * @version $Id: AlipayAPIClientFactory.java, v 0.1 2014年7月23日 下午5:07:45
 *          taixu.zqq Exp $
 */
public class AlipayAPIClientFactory {

	/** API调用客户端 */
	private static AlipayClient alipayClient;

	/**
	 * 获得API调用客户端
	 * 
	 * @param config
	 * 
	 * @return
	 */
	public static AlipayClient getAlipayClient(AliConfig config) {
		AlipayServiceEnvConstants aliService = new AlipayServiceEnvConstants(config);
		if (null == alipayClient) {
			alipayClient = new DefaultAlipayClient(aliService.ALIPAY_GATEWAY, aliService.APP_ID, aliService.PRIVATE_KEY,
					"json", aliService.CHARSET, aliService.ALIPAY_PUBLIC_KEY);
		}
		return alipayClient;
	}

	public static AlipayClient getAlipayClient() {
		if (null == alipayClient) {
			alipayClient = new DefaultAlipayClient(AlipayServiceEnvConstants.ALIPAY_GATEWAY,
					AlipayServiceEnvConstants.APP_ID, AlipayServiceEnvConstants.PRIVATE_KEY, "json",
					AlipayServiceEnvConstants.CHARSET, AlipayServiceEnvConstants.ALIPAY_PUBLIC_KEY);
		}
		return alipayClient;
	}
}
