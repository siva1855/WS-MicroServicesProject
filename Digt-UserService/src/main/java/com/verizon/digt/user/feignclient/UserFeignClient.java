package com.verizon.digt.user.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.verizon.digt.user.vo.DepartmentVO;

//producer Application URL
@FeignClient(name = "DIGT-DEPARTMENT-SERVICE")
public interface UserFeignClient {

	/* producer ----- get all records */
	@RequestMapping(value = "/departmentservice/all", method = RequestMethod.GET, consumes = "application/json")
	public List<DepartmentVO> getData();

	/* producer ----- get one record */
	@RequestMapping(value = "/departmentservice/one/{departmentId}", method = RequestMethod.GET, consumes = "application/json")
	public DepartmentVO getUserDept(@PathVariable("departmentId") Integer departmentId);
}
