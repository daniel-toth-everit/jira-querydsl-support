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
 * QFieldscreenscheme is a Querydsl query type for QFieldscreenscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldscreenscheme extends com.querydsl.sql.RelationalPathBase<QFieldscreenscheme> {

    private static final long serialVersionUID = -2008577069;

    public static final QFieldscreenscheme fieldscreenscheme = new QFieldscreenscheme("fieldscreenscheme");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QFieldscreenscheme> fieldscreenschemePk = createPrimaryKey(id);

    public QFieldscreenscheme(String variable) {
        super(QFieldscreenscheme.class, forVariable(variable), "public", "fieldscreenscheme");
        addMetadata();
    }

    public QFieldscreenscheme(String variable, String schema, String table) {
        super(QFieldscreenscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenscheme(Path<? extends QFieldscreenscheme> path) {
        super(path.getType(), path.getMetadata(), "public", "fieldscreenscheme");
        addMetadata();
    }

    public QFieldscreenscheme(PathMetadata metadata) {
        super(QFieldscreenscheme.class, metadata, "public", "fieldscreenscheme");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

