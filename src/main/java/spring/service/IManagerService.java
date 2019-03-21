package spring.service;

import entity.Manager;

/**
 * ����������ӿ�
 * @author ��Ԫ��
 *
 */
public interface IManagerService {
    
	/**
	 * ͨ���˺Ż�ȡ����Ա����
	 * @param phone
	 * @return
	 */
	public Manager getManagerById(String phone);
	
	/**
	 * �ж�����֪����ȷ
	 * @param passowrd  ���������
	 * @param cpassword ����
	 * @param salt ��ֵ
	 * @return
	 */
	public boolean confirmPassword(String passowrd,String cpassword,String salt);
	
	/**
	 * ����һ������Ա
	 */
	public void createManager();
}
