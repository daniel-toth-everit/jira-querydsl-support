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
 * QTrustedapp is a Querydsl query type for QTrustedapp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTrustedapp extends com.querydsl.sql.RelationalPathBase<QTrustedapp> {

    private static final long serialVersionUID = -1686511102;

    public static final QTrustedapp trustedapp = new QTrustedapp("TRUSTEDAPP");

    public final StringPath applicationId = createString("applicationId");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipMatch = createString("ipMatch");

    public final StringPath name = createString("name");

    public final StringPath publicKey = createString("publicKey");

    public final NumberPath<Long> timeout = createNumber("timeout", Long.class);

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final StringPath updatedBy = createString("updatedBy");

    public final StringPath urlMatch = createString("urlMatch");

    public final com.querydsl.sql.PrimaryKey<QTrustedapp> sysIdx191 = createPrimaryKey(id);

    public QTrustedapp(String variable) {
        super(QTrustedapp.class, forVariable(variable), "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public QTrustedapp(String variable, String schema, String table) {
        super(QTrustedapp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTrustedapp(Path<? extends QTrustedapp> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public QTrustedapp(PathMetadata metadata) {
        super(QTrustedapp.class, metadata, "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationId, ColumnMetadata.named("APPLICATION_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(8).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(createdBy, ColumnMetadata.named("CREATED_BY").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(ipMatch, ColumnMetadata.named("IP_MATCH").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(publicKey, ColumnMetadata.named("PUBLIC_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeout, ColumnMetadata.named("TIMEOUT").withIndex(7).ofType(Types.BIGINT));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(10).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(updatedBy, ColumnMetadata.named("UPDATED_BY").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(urlMatch, ColumnMetadata.named("URL_MATCH").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

