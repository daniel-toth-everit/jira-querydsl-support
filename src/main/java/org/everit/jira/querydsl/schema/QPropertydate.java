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
 * QPropertydate is a Querydsl query type for QPropertydate
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPropertydate extends com.querydsl.sql.RelationalPathBase<QPropertydate> {

    private static final long serialVersionUID = -984194757;

    public static final QPropertydate propertydate = new QPropertydate("PROPERTYDATE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> propertyvalue = createDateTime("propertyvalue", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QPropertydate> sysIdx144 = createPrimaryKey(id);

    public QPropertydate(String variable) {
        super(QPropertydate.class, forVariable(variable), "PUBLIC", "PROPERTYDATE");
        addMetadata();
    }

    public QPropertydate(String variable, String schema, String table) {
        super(QPropertydate.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydate(Path<? extends QPropertydate> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDATE");
        addMetadata();
    }

    public QPropertydate(PathMetadata metadata) {
        super(QPropertydate.class, metadata, "PUBLIC", "PROPERTYDATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.TIMESTAMP).withSize(6));
    }

}

