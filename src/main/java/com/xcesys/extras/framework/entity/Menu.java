package com.xcesys.extras.framework.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;
import com.xcesys.extras.framework.core.bean.PageResult;
import com.xcesys.extras.framework.core.model.IdTreeEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class Menu extends IdTreeEntity<Menu> implements java.io.Serializable {
	private static final long serialVersionUID = -2166097395146569342L;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String description;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private boolean editable = true;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String iconClass;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private boolean enabled = true;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private boolean top = false;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String title;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String tooltip;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Permission permission;
	@JsonView(value = { DataTablesOutput.View.class, PageResult.View.class })
	private String url;

	@Override
	@Transient
	public String getDisplayName() {
		if (this.depth > 1) {
			this.displayName = StringUtils.leftPad("　　", this.depth - 1) + "－" + this.title;
		} else {
			this.displayName = "+ " + this.title;
		}
		return displayName;
	}

	@Override
	@Transient
	public String getLineage() {
		this.lineage = (this.parent == null ? "0" : this.parent.getLineage())
				+ (this.sort == 0 ? "" : ("_" + StringUtils.leftPad("0", 3) + "" + this.sort)) + "." + this.getId();
		return this.lineage;
	}

	@Override
	public String toString() {
		return name + "," + title;
	}
}
