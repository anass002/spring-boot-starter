package com.saic.epa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="TM_AREA")
public class Area extends IdAuditableEntity {
	private static final long serialVersionUID = -3356325683038483403L;

	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@Override
	@Column(name = "TM_AREA_ID")
	public Long getId() {
		return super.getId();
	}

	/**
	 * 功能分类 1点检 2工艺 3质量
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private int type;

	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String picture;
	/**
	 * 名称
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String name;
	/**
	 * 说明
	 */
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String description;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "area")
	private Set<DataBar> databars = new HashSet<DataBar>(0);
}
