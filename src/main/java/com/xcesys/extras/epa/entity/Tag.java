package com.xcesys.extras.epa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;
import com.xcesys.extras.framework.core.bean.PageResult;
import com.xcesys.extras.framework.core.model.IdAuditableEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 标签
 * @author danne
 *
 */
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class Tag extends IdAuditableEntity {
	private static final long serialVersionUID = 9067340437829608488L;
	/**
	 * 数据类型
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String type;
	/**
	 * 名称
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String name;
	/**
	 * 默认值
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String defaultValue;
	
	/**
	 * 单位
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String unit;
	
	/**
	 * 枚举值
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String valueCode;
	/**
	 * 检验算式
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String calculate;
	/**
	 * 检验标准值
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String standard;
	/**
	 * 允许空值
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String isnull;
	
	
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "area")
	@JoinColumn
	private Set<DataBar> databars = new HashSet<DataBar>(0);
}
