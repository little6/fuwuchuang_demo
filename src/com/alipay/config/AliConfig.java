package com.alipay.config;

/**
 * 获取配置文件信息
 * 
 * @author Yujinshui
 *
 */
public interface AliConfig {
	/**
	 * 合作伙伴partner
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:21
	 */
	String partner();

	/**
	 * #服务窗appId<br>
	 * 该appId必须设为开发者自己的服务窗id
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String appId();

	/**
	 * #开发者请使用openssl生成的密钥替换此处 请看文档：
	 * {@link https://fuwu.alipay.com/platform/doc.htm#2-1}接入指南 <br>
	 * 【注：该私钥为测试账号私钥 开发者必须设置自己的私钥 , 否则会存在安全隐患 】
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String private_key();

	/**
	 * 该公钥为测试账号公钥 开发者必须设置自己的公钥 ,否则会存在安全隐患
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String public_key();

	/**
	 * 支付宝公钥-从支付宝服务窗获取
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String alipay_public_key();

	/**
	 * 支付宝网关
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String alipay_gateway();

	/**
	 * 签名编码-视支付宝服务窗要求
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String sign_charset();

	/**
	 * 字符编码-传递给支付宝的数据编码
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String charset();

	/**
	 * 签名类型-视支付宝服务窗要求
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月11日 下午6:51:35
	 */
	String sign_type();

	/**
	 * 支付完成后的异步回调通知
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2016年1月12日 下午10:57:22
	 */
	String notify_url();

}
