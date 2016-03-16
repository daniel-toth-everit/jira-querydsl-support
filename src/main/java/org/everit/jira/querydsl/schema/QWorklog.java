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
 * QWorklog is a Querydsl query type for QWorklog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWorklog extends com.querydsl.sql.RelationalPathBase<QWorklog> {

    private static final long serialVersionUID = 313830747;

    public static final QWorklog worklog = new QWorklog("WORKLOG");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath grouplevel = createString("grouplevel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final NumberPath<Long> timeworked = createNumber("timeworked", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final StringPath worklogbody = createString("worklogbody");

    public final com.querydsl.sql.PrimaryKey<QWorklog> sysIdx207 = createPrimaryKey(id);

    public QWorklog(String variable) {
        super(QWorklog.class, forVariable(variable), "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public QWorklog(String variable, String schema, String table) {
        super(QWorklog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorklog(Path<? extends QWorklog> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public QWorklog(PathMetadata metadata) {
        super(QWorklog.class, metadata, "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(7).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(grouplevel, ColumnMetadata.named("GROUPLEVEL").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(rolelevel, ColumnMetadata.named("ROLELEVEL").withIndex(5).ofType(Types.BIGINT));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(timeworked, ColumnMetadata.named("TIMEWORKED").withIndex(11).ofType(Types.BIGINT));
        addMetadata(updateauthor, ColumnMetadata.named("UPDATEAUTHOR").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(9).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(worklogbody, ColumnMetadata.named("WORKLOGBODY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

