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
 * QNotificationinstance is a Querydsl query type for QNotificationinstance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNotificationinstance extends com.querydsl.sql.RelationalPathBase<QNotificationinstance> {

    private static final long serialVersionUID = -1539059528;

    public static final QNotificationinstance notificationinstance = new QNotificationinstance("NOTIFICATIONINSTANCE");

    public final StringPath emailaddress = createString("emailaddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath messageid = createString("messageid");

    public final StringPath notificationtype = createString("notificationtype");

    public final NumberPath<Long> source = createNumber("source", Long.class);

    public final com.querydsl.sql.PrimaryKey<QNotificationinstance> sysIdx131 = createPrimaryKey(id);

    public QNotificationinstance(String variable) {
        super(QNotificationinstance.class, forVariable(variable), "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public QNotificationinstance(String variable, String schema, String table) {
        super(QNotificationinstance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotificationinstance(Path<? extends QNotificationinstance> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public QNotificationinstance(PathMetadata metadata) {
        super(QNotificationinstance.class, metadata, "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(emailaddress, ColumnMetadata.named("EMAILADDRESS").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(messageid, ColumnMetadata.named("MESSAGEID").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(notificationtype, ColumnMetadata.named("NOTIFICATIONTYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(3).ofType(Types.BIGINT));
    }

}

