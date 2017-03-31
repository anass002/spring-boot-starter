package com.xcesys.extras.framework.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.xcesys.extras.framework.core.model.IdAuditableEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
public class Country extends IdAuditableEntity implements java.io.Serializable {

	private static final long serialVersionUID = -2844056007401254101L;
	/** 编码 */
	private String code;
	/** 名称 */
	private String name;
	/** 显示名称 */
	private String displayName;
	/** ISO标准名 */
	private String iso3;

}
