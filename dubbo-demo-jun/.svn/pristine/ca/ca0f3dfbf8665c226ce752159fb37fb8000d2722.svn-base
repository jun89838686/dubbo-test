package com.dubbo.company.core.service.impl;

import com.dubbo.company.api.entity.Company;
import com.dubbo.company.api.face.ICompanyService;
import com.dubbo.company.core.dao.CompanyMapper;
import com.dubbo.company.core.service.support.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jun
 * @since 2018-04-26
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<CompanyMapper, Company> implements ICompanyService {
	@Autowired
	private CompanyMapper companyMapper;

	@Override
	public Company selectCompanyById(Long id) {
		System.out.println("companyMapper---------------------------------"+companyMapper);
		System.out.println("id--------------------------------------------"+id);
		return companyMapper.selectCompanyById(id);
	}
	
}
