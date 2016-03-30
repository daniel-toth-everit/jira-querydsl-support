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
 * QOsWfentry is a Querydsl query type for QOsWfentry
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOsWfentry extends com.querydsl.sql.RelationalPathBase<QOsWfentry> {

    private static final long serialVersionUID = -1737709241;

    public static final QOsWfentry osWfentry = new QOsWfentry("os_wfentry");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> initialized = createNumber("initialized", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> state = createNumber("state", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QOsWfentry> osWfentryPk = createPrimaryKey(id);

    public QOsWfentry(String variable) {
        super(QOsWfentry.class, forVariable(variable), "public", "os_wfentry");
        addMetadata();
    }

    public QOsWfentry(String variable, String schema, String table) {
        super(QOsWfentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsWfentry(Path<? extends QOsWfentry> path) {
        super(path.getType(), path.getMetadata(), "public", "os_wfentry");
        addMetadata();
    }

    public QOsWfentry(PathMetadata metadata) {
        super(QOsWfentry.class, metadata, "public", "os_wfentry");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(initialized, ColumnMetadata.named("initialized").withIndex(3).ofType(Types.NUMERIC).withSize(9));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(state, ColumnMetadata.named("state").withIndex(4).ofType(Types.NUMERIC).withSize(9));
    }

}

