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
 * QSharepermissions is a Querydsl query type for QSharepermissions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSharepermissions extends com.querydsl.sql.RelationalPathBase<QSharepermissions> {

    private static final long serialVersionUID = -286392963;

    public static final QSharepermissions sharepermissions = new QSharepermissions("sharepermissions");

    public final NumberPath<Long> entityid = createNumber("entityid", Long.class);

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath param1 = createString("param1");

    public final StringPath param2 = createString("param2");

    public final StringPath sharetype = createString("sharetype");

    public final com.querydsl.sql.PrimaryKey<QSharepermissions> sharepermissionsPk = createPrimaryKey(id);

    public QSharepermissions(String variable) {
        super(QSharepermissions.class, forVariable(variable), "public", "sharepermissions");
        addMetadata();
    }

    public QSharepermissions(String variable, String schema, String table) {
        super(QSharepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSharepermissions(Path<? extends QSharepermissions> path) {
        super(path.getType(), path.getMetadata(), "public", "sharepermissions");
        addMetadata();
    }

    public QSharepermissions(PathMetadata metadata) {
        super(QSharepermissions.class, metadata, "public", "sharepermissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityid, ColumnMetadata.named("entityid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(entitytype, ColumnMetadata.named("entitytype").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(param1, ColumnMetadata.named("param1").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(param2, ColumnMetadata.named("param2").withIndex(6).ofType(Types.VARCHAR).withSize(60));
        addMetadata(sharetype, ColumnMetadata.named("sharetype").withIndex(4).ofType(Types.VARCHAR).withSize(10));
    }

}

