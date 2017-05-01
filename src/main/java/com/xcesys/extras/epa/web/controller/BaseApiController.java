package com.xcesys.extras.epa.web.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;

import com.xcesys.extras.framework.core.controller.BaseCrudRestController;
import com.xcesys.extras.framework.core.model.IdEntity;

import io.swagger.annotations.ApiOperation;

public abstract class BaseApiController<T extends IdEntity, ID extends Serializable> extends BaseCrudRestController<T,ID>  {

	@ApiOperation("取得所有可用数据列表")
	@GetMapping("/list")
	public Iterable<T> List() {
		return getCrudService().findAll();
	}

}