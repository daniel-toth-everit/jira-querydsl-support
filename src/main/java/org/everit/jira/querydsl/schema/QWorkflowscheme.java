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
 * QWorkflowscheme is a Querydsl query type for QWorkflowscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWorkflowscheme extends com.querydsl.sql.RelationalPathBase<QWorkflowscheme> {

    private static final long serialVersionUID = 2090064476;

    public static final QWorkflowscheme workflowscheme = new QWorkflowscheme("WORKFLOWSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QWorkflowscheme> sysIdx205 = createPrimaryKey(id);

    public QWorkflowscheme(String variable) {
        super(QWorkflowscheme.class, forVariable(variable), "PUBLIC", "WORKFLOWSCHEME");
        addMetadata();
    }

    public QWorkflowscheme(String variable, String schema, String table) {
        super(QWorkflowscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorkflowscheme(Path<? extends QWorkflowscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "WORKFLOWSCHEME");
        addMetadata();
    }

    public QWorkflowscheme(PathMetadata metadata) {
        super(QWorkflowscheme.class, metadata, "PUBLIC", "WORKFLOWSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

