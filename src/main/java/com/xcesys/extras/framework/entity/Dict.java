package com.xcesys.extras.framework.entity;

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

/**
 * Dict generated by hbm2java
 */
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class Dict extends IdAuditableEntity {

	private static final long serialVersionUID = -8572522105499245114L;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private DictType type;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String name;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String value;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private Integer sort;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String description;

}
