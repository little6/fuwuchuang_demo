
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.constants;

import com.alipay.config.AliConfig;
import com.alipay.config.AliPropertiesConfig;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49
 *          taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {
	private static AliConfig config;

	/** 支付宝公钥-从支付宝服务窗获取 */
	public static String ALIPAY_PUBLIC_KEY = "";// config.alipay_public_key();

	/** 签名编码-视支付宝服务窗要求 */
	public static String SIGN_CHARSET = "";// config.sign_charset();

	/** 字符编码-传递给支付宝的数据编码 */
	public static String CHARSET = "";// config.charset();

	/** 签名类型-视支付宝服务窗要求 */
	public static String SIGN_TYPE = "";// config.sign_type();

	public static String PARTNER = "";// config.partner();

	/** 服务窗appId */
	// TODO !!!! 注：该appId必须设为开发者自己的服务窗id 这里只是个测试id
	public static String APP_ID = "";// config.appId();

	// 开发者请使用openssl生成的密钥替换此处
	// 请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
	// TODO !!!! 注：该私钥为测试账号私钥 开发者必须设置自己的私钥 , 否则会存在安全隐患
	public static String PRIVATE_KEY = "";// config.private_key();

	// TODO !!!! 注：该公钥为测试账号公钥 开发者必须设置自己的公钥 ,否则会存在安全隐患
	public static String PUBLIC_KEY = "";// config.public_key();

	/** 支付宝网关 */
	public static String ALIPAY_GATEWAY = "";// config.alipay_gateway();

	/** 授权访问令牌的授权类型 */
	public static String GRANT_TYPE = "authorization_code";

	public AlipayServiceEnvConstants(AliConfig config) {
		/** 支付宝公钥-从支付宝服务窗获取 */
		ALIPAY_PUBLIC_KEY = config.alipay_public_key();

		/** 签名编码-视支付宝服务窗要求 */
		SIGN_CHARSET = config.sign_charset();

		/** 字符编码-传递给支付宝的数据编码 */
		CHARSET = config.charset();

		/** 签名类型-视支付宝服务窗要求 */
		SIGN_TYPE = config.sign_type();

		PARTNER = config.partner();

		/** 服务窗appId */
		// !!!! 注：该appId必须设为开发者自己的服务窗id 这里只是个测试id
		APP_ID = config.appId();

		// 开发者请使用openssl生成的密钥替换此处
		// 请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
		// !!!! 注：该私钥为测试账号私钥 开发者必须设置自己的私钥 , 否则会存在安全隐患
		PRIVATE_KEY = config.private_key();

		// !!!! 注：该公钥为测试账号公钥 开发者必须设置自己的公钥 ,否则会存在安全隐患
		PUBLIC_KEY = config.public_key();

		/** 支付宝网关 */
		ALIPAY_GATEWAY = config.alipay_gateway();
	}
}