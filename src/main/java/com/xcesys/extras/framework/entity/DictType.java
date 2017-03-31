package com.xcesys.extras.framework.entity;

// Generated 2010-11-3 20:32:38 by Hibernate Tools 3.2.4.GA

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
import com.xcesys.extras.framework.core.model.IEditable;
import com.xcesys.extras.framework.core.model.IdAuditableEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
public class DictType extends IdAuditableEntity implements IEditable{
	private static final long serialVersionUID = -2334286394502372010L;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String name;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String description;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private int length = 1;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private Set<Dict> dicts = new HashSet<Dict>(0);
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private boolean editable = true;

}
