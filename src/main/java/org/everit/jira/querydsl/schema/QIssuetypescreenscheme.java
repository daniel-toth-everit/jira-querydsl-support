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
 * QIssuetypescreenscheme is a Querydsl query type for QIssuetypescreenscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssuetypescreenscheme extends com.querydsl.sql.RelationalPathBase<QIssuetypescreenscheme> {

    private static final long serialVersionUID = 704335084;

    public static final QIssuetypescreenscheme issuetypescreenscheme = new QIssuetypescreenscheme("ISSUETYPESCREENSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QIssuetypescreenscheme> sysIdx105 = createPrimaryKey(id);

    public QIssuetypescreenscheme(String variable) {
        super(QIssuetypescreenscheme.class, forVariable(variable), "PUBLIC", "ISSUETYPESCREENSCHEME");
        addMetadata();
    }

    public QIssuetypescreenscheme(String variable, String schema, String table) {
        super(QIssuetypescreenscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuetypescreenscheme(Path<? extends QIssuetypescreenscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUETYPESCREENSCHEME");
        addMetadata();
    }

    public QIssuetypescreenscheme(PathMetadata metadata) {
        super(QIssuetypescreenscheme.class, metadata, "PUBLIC", "ISSUETYPESCREENSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

