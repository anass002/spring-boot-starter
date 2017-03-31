package com.xcesys.extras.framework.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.xcesys.extras.framework.core.model.IdTreeEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
public class MediaFolder extends IdTreeEntity<MediaFolder> implements java.io.Serializable {

	private static final long serialVersionUID = -868417412189641151L;
	private String relPath;
	private String name;

}
