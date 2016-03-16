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
 * QIssuesecurityscheme is a Querydsl query type for QIssuesecurityscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssuesecurityscheme extends com.querydsl.sql.RelationalPathBase<QIssuesecurityscheme> {

    private static final long serialVersionUID = -1658158906;

    public static final QIssuesecurityscheme issuesecurityscheme = new QIssuesecurityscheme("ISSUESECURITYSCHEME");

    public final NumberPath<Long> defaultlevel = createNumber("defaultlevel", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QIssuesecurityscheme> sysIdx103 = createPrimaryKey(id);

    public QIssuesecurityscheme(String variable) {
        super(QIssuesecurityscheme.class, forVariable(variable), "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public QIssuesecurityscheme(String variable, String schema, String table) {
        super(QIssuesecurityscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuesecurityscheme(Path<? extends QIssuesecurityscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public QIssuesecurityscheme(PathMetadata metadata) {
        super(QIssuesecurityscheme.class, metadata, "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultlevel, ColumnMetadata.named("DEFAULTLEVEL").withIndex(4).ofType(Types.BIGINT));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

