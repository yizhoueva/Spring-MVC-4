package com.ggw.app.util.chat;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;
/**
 * 证书信任管理器（用于https请求）
 * @author ggw
 *
 */
public class X509TrustManagerImpl implements X509TrustManager {

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {

	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {

	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

}
