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
 * QGroupbase is a Querydsl query type for QGroupbase
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupbase extends com.querydsl.sql.RelationalPathBase<QGroupbase> {

    private static final long serialVersionUID = -1641313640;

    public static final QGroupbase groupbase = new QGroupbase("groupbase");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QGroupbase> groupbasePk = createPrimaryKey(id);

    public QGroupbase(String variable) {
        super(QGroupbase.class, forVariable(variable), "public", "groupbase");
        addMetadata();
    }

    public QGroupbase(String variable, String schema, String table) {
        super(QGroupbase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupbase(Path<? extends QGroupbase> path) {
        super(path.getType(), path.getMetadata(), "public", "groupbase");
        addMetadata();
    }

    public QGroupbase(PathMetadata metadata) {
        super(QGroupbase.class, metadata, "public", "groupbase");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupname, ColumnMetadata.named("groupname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
    }

}

