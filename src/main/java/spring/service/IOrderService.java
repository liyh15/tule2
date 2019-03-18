package spring.service;

import entity.Order;

/**
 * ���������ӿ�
 * @author ��Ԫ��
 *
 */
public interface IOrderService {
	
    /**
     * ͨ����Ż�ȡ����
     * @param id
     * @return
     */
	public Order getOrderByOrderId(Integer id);
	
	/**
	 * ͨ�����ȡ������
	 * @param id
	 * @return
	 */
	public Integer cancelOrderById(Integer id);
	
	/**
	 * ��ʱ������ʱ����
	 */
	public void cancelOrder();
	
	/**
	 * ͨ�������ı��ɾ������
	 * @param id
	 * @return
	 */
	public Integer deleteOrderById(Integer id);
	
}
