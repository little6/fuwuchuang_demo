package com.alipay.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 支付配置信息实现类
 * 
 * @author Yujinshui
 *
 */
public class AliPropertiesConfig implements AliConfig {
	private static final Logger logger = Logger.getLogger(AliPropertiesConfig.class);
	private String PARTNER;
	private String APP_ID;
	private String PRIVATE_KEY;
	private String PUBLIC_KEY;
	private String ALIPAY_PUBLIC_KEY;
	private String ALIPAY_GATEWAY;
	private String SIGN_CHARSET;
	private String CHARSET;
	private String SIGN_TYPE;
	private String NOTIFY_URL;

	public AliPropertiesConfig() {
		getProperties("Alipay2.properties");
	}

	/**
	 * 自定义配置文件名（文件在项目中的路径+名称）
	 * 
	 * @param fileName
	 */
	public AliPropertiesConfig(String fileName) {
		getProperties(fileName);
	}

	/**
	 * 其他方式输入配置内容
	 * 
	 * @param map
	 */
	public AliPropertiesConfig(Map<String, String> map) {
		PARTNER = map.get("PARTNER");
		APP_ID = map.get("APP_ID");
		PRIVATE_KEY = map.get("PRIVATE_KEY");
		PUBLIC_KEY = map.get("PUBLIC_KEY");
		ALIPAY_PUBLIC_KEY = map.get("ALIPAY_PUBLIC_KEY");
		ALIPAY_GATEWAY = map.get("ALIPAY_GATEWAY");
		NOTIFY_URL = map.get("NOTIFY_URL");
		SIGN_CHARSET = map.get("SIGN_CHARSET");
		CHARSET = map.get("CHARSET");
		SIGN_TYPE = map.get("SIGN_TYPE");
	}

	/**
	 * 通过读取指定位置配置文件加载微信支付的商户及系统配置信息
	 * <p>
	 * 用于开发人员进行测试使用，以防误操作上传真实配置文件内容
	 * 
	 * @param fileName
	 *            文件路径+名称[E:/wechat/wechatpay.properties]
	 * @param encoding
	 *            读取编码
	 * @time 2016年1月11日 下午7:16:26
	 */
	public AliPropertiesConfig(String fileName, String encoding) {
		getFileProperties(fileName, encoding);
	}

	/**
	 * 
	 * @param fileName
	 *            文件路径+名称[E:/wechat/wechatpay.properties]
	 * @param encoding
	 *            读取编码
	 * @author Yujinshui
	 * @time 2016年1月12日 下午10:18:09
	 */
	private void getFileProperties(String fileName, String encoding) {
		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream(fileName), encoding);
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			System.out.println("读取指定路径配置失败。" + fileName);
			logger.error("读取指定路径配置文件失败，请检查文件是否存在。" + fileName);
		}
		Properties p = new Properties();
		try {
			p.load(reader);
		} catch (IOException e1) {
			System.out.println("配置文件读取失败，请检查.");
			e1.printStackTrace();
		}
		setPropertiesValues(p);

	}

	/**
	 * 读取项目配置文件参数
	 * <p>
	 * 采用ISO-8859-1默认字符集
	 * 
	 * @param fileName
	 * @author Yujinshui
	 */
	private void getProperties(String fileName) {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
		Properties p = new Properties();
		try {
			p.load(inputStream);
		} catch (IOException e1) {
			System.out.println("配置文件读取失败，请检查.");
			e1.printStackTrace();
		}
		setPropertiesValues(p);
	}

	/**
	 * 配置参数赋值
	 * 
	 * @param p
	 * @author Yujinshui
	 * @time 2016年1月11日 下午7:01:52
	 */
	private void setPropertiesValues(Properties p) {
		PARTNER = p.getProperty("PARTNER");
		APP_ID = p.getProperty("APP_ID");
		PRIVATE_KEY = p.getProperty("PRIVATE_KEY");
		PUBLIC_KEY = p.getProperty("PUBLIC_KEY");
		ALIPAY_PUBLIC_KEY = p.getProperty("ALIPAY_PUBLIC_KEY");
		ALIPAY_GATEWAY = p.getProperty("ALIPAY_GATEWAY");
		NOTIFY_URL = p.getProperty("NOTIFY_URL");
		SIGN_CHARSET = p.getProperty("SIGN_CHARSET");
		CHARSET = p.getProperty("CHARSET");
		SIGN_TYPE = p.getProperty("SIGN_TYPE");

	}

	public String toString() {
		return "PARTNER=" + PARTNER + "\r\n"//
				+ "APP_ID=" + APP_ID + "\r\n"//
				+ "PRIVATE_KEY=" + PRIVATE_KEY + "\r\n"//
				+ "PUBLIC_KEY=" + PUBLIC_KEY + "\r\n"//
				+ "ALIPAY_PUBLIC_KEY=" + ALIPAY_PUBLIC_KEY + "\r\n"//
				+ "ALIPAY_GATEWAY=" + ALIPAY_GATEWAY + "\r\n"//
				+ "NOTIFY_URL=" + NOTIFY_URL + "\r\n"//
				+ "SIGN_CHARSET=" + SIGN_CHARSET + "\r\n"//
				+ "CHARSET=" + CHARSET + "\r\n"//
				+ "SIGN_TYPE=" + SIGN_TYPE + "\r\n";//
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#partner()
	 */
	@Override
	public String partner() {
		return PARTNER;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#appId()
	 */
	@Override
	public String appId() {
		return APP_ID;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#private_key()
	 */
	@Override
	public String private_key() {
		return PRIVATE_KEY;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#public_key()
	 */
	@Override
	public String public_key() {
		return PUBLIC_KEY;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#alipay_public_key()
	 */
	@Override
	public String alipay_public_key() {
		return ALIPAY_PUBLIC_KEY;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#alipay_gateway()
	 */
	@Override
	public String alipay_gateway() {
		return ALIPAY_GATEWAY;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#sign_charset()
	 */
	@Override
	public String sign_charset() {
		return SIGN_CHARSET;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#charset()
	 */
	@Override
	public String charset() {
		return CHARSET;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#sign_type()
	 */
	@Override
	public String sign_type() {
		return SIGN_TYPE;
	}

	/**
	 * 
	 * @see com.alipay.config.AliConfig#notify_url()
	 */
	@Override
	public String notify_url() {
		return NOTIFY_URL;
	}
}
