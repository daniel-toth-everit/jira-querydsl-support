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
 * QIssuetypescreenschemeentity is a Querydsl query type for QIssuetypescreenschemeentity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssuetypescreenschemeentity extends com.querydsl.sql.RelationalPathBase<QIssuetypescreenschemeentity> {

    private static final long serialVersionUID = 1378799567;

    public static final QIssuetypescreenschemeentity issuetypescreenschemeentity = new QIssuetypescreenschemeentity("issuetypescreenschemeentity");

    public final NumberPath<Long> fieldscreenscheme = createNumber("fieldscreenscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.querydsl.sql.PrimaryKey<QIssuetypescreenschemeentity> issuetypescreenschemeentityPk = createPrimaryKey(id);

    public QIssuetypescreenschemeentity(String variable) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), "public", "issuetypescreenschemeentity");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(String variable, String schema, String table) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuetypescreenschemeentity(Path<? extends QIssuetypescreenschemeentity> path) {
        super(path.getType(), path.getMetadata(), "public", "issuetypescreenschemeentity");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(PathMetadata metadata) {
        super(QIssuetypescreenschemeentity.class, metadata, "public", "issuetypescreenschemeentity");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldscreenscheme, ColumnMetadata.named("fieldscreenscheme").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issuetype, ColumnMetadata.named("issuetype").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(scheme, ColumnMetadata.named("scheme").withIndex(3).ofType(Types.NUMERIC).withSize(18));
    }

}

