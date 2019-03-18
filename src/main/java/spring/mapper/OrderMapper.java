package spring.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.MapperOrder;
import entity.Order;
/**
 * ������mabatis��mapper��
 * @author ��Ԫ��
 */
public interface OrderMapper {
	
	/**
	 * ͨ��������Ų�ѯָ������
	 * @param id �������
	 * @return
	 */
    public MapperOrder getOrderByOrderId(@Param("id") Integer id);
    
    /**
     * ͨ�����ȡ������
     * @param id �������
     * @return
     */
    public Integer cancelOrderById(@Param("id") Integer id);
    
    /**
     * ��ʱ������ʱ����
     * @return
     */
    public List<Integer> cancelOrder();
    
    /**
	 * ͨ�������ı��ɾ������
	 * @param id
	 * @return
	 */
	public Integer deleteOrderById(@Param("id") Integer id);
	
}
