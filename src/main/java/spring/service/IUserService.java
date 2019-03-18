package spring.service;

import java.io.File;

import spring.service.ex.PassErrorException;

public interface IUserService {
	
    public void changeUserPass(String phone,String oldPass,String newPass) throws PassErrorException;
    
    public File getUserImageUrlByUserId(Integer id);
    
	/**
	 * �ϴ�ͷ��·�������ݿ�
	 * @param id
	 * @param imageUrl
	 * @return
	 */
	public Integer putHeadImage(Integer id,String imageUrl);
}
