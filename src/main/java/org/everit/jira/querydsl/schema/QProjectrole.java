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
 * QProjectrole is a Querydsl query type for QProjectrole
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectrole extends com.querydsl.sql.RelationalPathBase<QProjectrole> {

    private static final long serialVersionUID = 1135372759;

    public static final QProjectrole projectrole = new QProjectrole("PROJECTROLE");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QProjectrole> sysIdx164 = createPrimaryKey(id);

    public QProjectrole(String variable) {
        super(QProjectrole.class, forVariable(variable), "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public QProjectrole(String variable, String schema, String table) {
        super(QProjectrole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectrole(Path<? extends QProjectrole> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public QProjectrole(PathMetadata metadata) {
        super(QProjectrole.class, metadata, "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

