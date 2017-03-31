package com.xcesys.extras.epa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;
import com.xcesys.extras.framework.core.bean.PageResult;
import com.xcesys.extras.framework.core.model.IdAuditableEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class DataBar extends IdAuditableEntity {

	private static final long serialVersionUID = -5012274748925500133L;
	/**
	 * 区域
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Area area;
	/**
	 * 功能分类
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String type;
	/**
	 * 描述
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String name;
	/**
	 * 图片路径
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String picture;
}
