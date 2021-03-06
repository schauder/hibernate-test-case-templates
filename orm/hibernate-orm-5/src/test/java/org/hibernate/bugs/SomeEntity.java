/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hibernate.bugs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

/**
 * @author Jens Schauder
 */
@Entity
@IdClass(SomeEntityPK.class)
public class SomeEntity {

	@Id
	private long id;

	@Id
	@ManyToOne
	private ReferencedEntity referencedEntity;

	public ReferencedEntity getReferencedEntity() {
		return referencedEntity;
	}

	public void setReferencedEntity(ReferencedEntity referencedEntity) {
		this.referencedEntity = referencedEntity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
