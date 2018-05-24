package com.dubbo.company.core.dao;


import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dubbo.company.api.entity.Company;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author jun
 * @since 2018-04-26
 */
public interface CompanyMapper extends BaseMapper<Company> {

	Company selectCompanyById(@Param("id")Long id);

}