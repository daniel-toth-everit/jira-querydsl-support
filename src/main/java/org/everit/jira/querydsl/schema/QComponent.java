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
 * QComponent is a Querydsl query type for QComponent
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QComponent extends com.querydsl.sql.RelationalPathBase<QComponent> {

    private static final long serialVersionUID = -1558642235;

    public static final QComponent component = new QComponent("COMPONENT");

    public final NumberPath<Long> assigneetype = createNumber("assigneetype", Long.class);

    public final StringPath cname = createString("cname");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lead = createString("lead");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QComponent> sysIdx62 = createPrimaryKey(id);

    public QComponent(String variable) {
        super(QComponent.class, forVariable(variable), "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public QComponent(String variable, String schema, String table) {
        super(QComponent.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QComponent(Path<? extends QComponent> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public QComponent(PathMetadata metadata) {
        super(QComponent.class, metadata, "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assigneetype, ColumnMetadata.named("ASSIGNEETYPE").withIndex(7).ofType(Types.BIGINT));
        addMetadata(cname, ColumnMetadata.named("CNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(lead, ColumnMetadata.named("LEAD").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(2).ofType(Types.BIGINT));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

