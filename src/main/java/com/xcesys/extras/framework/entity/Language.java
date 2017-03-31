package com.xcesys.extras.framework.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
public class Language extends IdAuditableEntity implements java.io.Serializable {

	private static final long serialVersionUID = 3463110262347781928L;
	/***/
	private String name;
	/***/
	private String code;
	/***/
	private String locale;
	/***/
	private String image;
	/***/
	private String directory;
	/***/
	private int sortOrder;
	/***/
	private boolean status;

}
