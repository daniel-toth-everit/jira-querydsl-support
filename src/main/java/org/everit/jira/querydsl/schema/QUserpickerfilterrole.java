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
 * QUserpickerfilterrole is a Querydsl query type for QUserpickerfilterrole
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserpickerfilterrole extends com.querydsl.sql.RelationalPathBase<QUserpickerfilterrole> {

    private static final long serialVersionUID = 1281278719;

    public static final QUserpickerfilterrole userpickerfilterrole = new QUserpickerfilterrole("userpickerfilterrole");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectroleid = createNumber("projectroleid", Long.class);

    public final NumberPath<Long> userpickerfilter = createNumber("userpickerfilter", Long.class);

    public final com.querydsl.sql.PrimaryKey<QUserpickerfilterrole> userpickerfilterrolePk = createPrimaryKey(id);

    public QUserpickerfilterrole(String variable) {
        super(QUserpickerfilterrole.class, forVariable(variable), "public", "userpickerfilterrole");
        addMetadata();
    }

    public QUserpickerfilterrole(String variable, String schema, String table) {
        super(QUserpickerfilterrole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfilterrole(Path<? extends QUserpickerfilterrole> path) {
        super(path.getType(), path.getMetadata(), "public", "userpickerfilterrole");
        addMetadata();
    }

    public QUserpickerfilterrole(PathMetadata metadata) {
        super(QUserpickerfilterrole.class, metadata, "public", "userpickerfilterrole");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(projectroleid, ColumnMetadata.named("projectroleid").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(userpickerfilter, ColumnMetadata.named("userpickerfilter").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

