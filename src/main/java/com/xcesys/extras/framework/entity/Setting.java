package com.xcesys.extras.framework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;
import com.xcesys.extras.framework.core.bean.PageResult;
import com.xcesys.extras.framework.core.model.IdAuditableEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class Setting extends IdAuditableEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1914923621183428105L;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String type;
	// @ManyToOne
	// private Module module;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@Column(unique = true)
	@NonNull
	private String name;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String value;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String description;
	private String credentials;

}
