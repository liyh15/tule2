package spring.mapper;

import org.apache.ibatis.annotations.Param;

import entity.Manager;

public interface ManagerMapper {
    
	/**
	 * ͨ���˺Ż�ȡ����Ա����
	 * @param phone
	 * @return
	 */
	public Manager getManagerById(@Param("phone") String phone);
	
	/**
	 * ����һ������Ա
	 * @return
	 */
	public Integer createManager(@Param("phone") String phone,@Param("password") String password,@Param("salt") String salt);
}
