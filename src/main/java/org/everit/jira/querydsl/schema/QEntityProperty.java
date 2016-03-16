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
 * QEntityProperty is a Querydsl query type for QEntityProperty
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEntityProperty extends com.querydsl.sql.RelationalPathBase<QEntityProperty> {

    private static final long serialVersionUID = -760255728;

    public static final QEntityProperty entityProperty = new QEntityProperty("ENTITY_PROPERTY");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> entityId = createNumber("entityId", Long.class);

    public final StringPath entityName = createString("entityName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jsonValue = createString("jsonValue");

    public final StringPath propertyKey = createString("propertyKey");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QEntityProperty> sysIdx73 = createPrimaryKey(id);

    public QEntityProperty(String variable) {
        super(QEntityProperty.class, forVariable(variable), "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public QEntityProperty(String variable, String schema, String table) {
        super(QEntityProperty.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEntityProperty(Path<? extends QEntityProperty> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public QEntityProperty(PathMetadata metadata) {
        super(QEntityProperty.class, metadata, "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(entityId, ColumnMetadata.named("ENTITY_ID").withIndex(3).ofType(Types.BIGINT));
        addMetadata(entityName, ColumnMetadata.named("ENTITY_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(jsonValue, ColumnMetadata.named("JSON_VALUE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(propertyKey, ColumnMetadata.named("PROPERTY_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(6).ofType(Types.TIMESTAMP).withSize(6));
    }

}

