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
 * QOauthconsumertoken is a Querydsl query type for QOauthconsumertoken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOauthconsumertoken extends com.querydsl.sql.RelationalPathBase<QOauthconsumertoken> {

    private static final long serialVersionUID = -493495612;

    public static final QOauthconsumertoken oauthconsumertoken = new QOauthconsumertoken("OAUTHCONSUMERTOKEN");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath tokenKey = createString("tokenKey");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final com.querydsl.sql.PrimaryKey<QOauthconsumertoken> sysIdx134 = createPrimaryKey(id);

    public QOauthconsumertoken(String variable) {
        super(QOauthconsumertoken.class, forVariable(variable), "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public QOauthconsumertoken(String variable, String schema, String table) {
        super(QOauthconsumertoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthconsumertoken(Path<? extends QOauthconsumertoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public QOauthconsumertoken(PathMetadata metadata) {
        super(QOauthconsumertoken.class, metadata, "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenKey, ColumnMetadata.named("TOKEN_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenSecret, ColumnMetadata.named("TOKEN_SECRET").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenType, ColumnMetadata.named("TOKEN_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

