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
 * QPortalpage is a Querydsl query type for QPortalpage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPortalpage extends com.querydsl.sql.RelationalPathBase<QPortalpage> {

    private static final long serialVersionUID = -356153037;

    public static final QPortalpage portalpage = new QPortalpage("PORTALPAGE");

    public final StringPath description = createString("description");

    public final NumberPath<Long> favCount = createNumber("favCount", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath layout = createString("layout");

    public final StringPath pagename = createString("pagename");

    public final NumberPath<Long> ppversion = createNumber("ppversion", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QPortalpage> sysIdx157 = createPrimaryKey(id);

    public QPortalpage(String variable) {
        super(QPortalpage.class, forVariable(variable), "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public QPortalpage(String variable, String schema, String table) {
        super(QPortalpage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPortalpage(Path<? extends QPortalpage> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public QPortalpage(PathMetadata metadata) {
        super(QPortalpage.class, metadata, "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(favCount, ColumnMetadata.named("FAV_COUNT").withIndex(6).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(layout, ColumnMetadata.named("LAYOUT").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pagename, ColumnMetadata.named("PAGENAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(ppversion, ColumnMetadata.named("PPVERSION").withIndex(8).ofType(Types.BIGINT));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

