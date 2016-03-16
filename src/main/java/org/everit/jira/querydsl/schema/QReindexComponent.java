/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.querydsl.schema;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QReindexComponent is a Querydsl query type for QReindexComponent
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QReindexComponent extends com.querydsl.sql.RelationalPathBase<QReindexComponent> {

    private static final long serialVersionUID = 1846559606;

    public static final QReindexComponent reindexComponent = new QReindexComponent("REINDEX_COMPONENT");

    public final StringPath affectedIndex = createString("affectedIndex");

    public final StringPath entityType = createString("entityType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> requestId = createNumber("requestId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QReindexComponent> sysIdx174 = createPrimaryKey(id);

    public QReindexComponent(String variable) {
        super(QReindexComponent.class, forVariable(variable), "PUBLIC", "REINDEX_COMPONENT");
        addMetadata();
    }

    public QReindexComponent(String variable, String schema, String table) {
        super(QReindexComponent.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReindexComponent(Path<? extends QReindexComponent> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REINDEX_COMPONENT");
        addMetadata();
    }

    public QReindexComponent(PathMetadata metadata) {
        super(QReindexComponent.class, metadata, "PUBLIC", "REINDEX_COMPONENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affectedIndex, ColumnMetadata.named("AFFECTED_INDEX").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityType, ColumnMetadata.named("ENTITY_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(requestId, ColumnMetadata.named("REQUEST_ID").withIndex(2).ofType(Types.BIGINT));
    }

}

