package io.github.fantaros.cipher.base;

import java.util.Map;

/**
 * ����ӿ�.
 * @author ��»��
 *
 */
public interface Cipher {
	/**
	 * ��ȡ�㷨����.
	 * @return
	 */
	String getChipherName();
	
	/**
	 * ��ȡ��չ��.
	 * @return
	 */
	String getExtName();
	
	/**
	 * ִ��.
	 * @param params
	 * @return
	 */
	CipherResult execute(Map<String, Object> params);
}
