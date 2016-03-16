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
 * QOptionconfiguration is a Querydsl query type for QOptionconfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOptionconfiguration extends com.querydsl.sql.RelationalPathBase<QOptionconfiguration> {

    private static final long serialVersionUID = -699687575;

    public static final QOptionconfiguration optionconfiguration = new QOptionconfiguration("OPTIONCONFIGURATION");

    public final NumberPath<Long> fieldconfig = createNumber("fieldconfig", Long.class);

    public final StringPath fieldid = createString("fieldid");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath optionid = createString("optionid");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOptionconfiguration> sysIdx152 = createPrimaryKey(id);

    public QOptionconfiguration(String variable) {
        super(QOptionconfiguration.class, forVariable(variable), "PUBLIC", "OPTIONCONFIGURATION");
        addMetadata();
    }

    public QOptionconfiguration(String variable, String schema, String table) {
        super(QOptionconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOptionconfiguration(Path<? extends QOptionconfiguration> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OPTIONCONFIGURATION");
        addMetadata();
    }

    public QOptionconfiguration(PathMetadata metadata) {
        super(QOptionconfiguration.class, metadata, "PUBLIC", "OPTIONCONFIGURATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldconfig, ColumnMetadata.named("FIELDCONFIG").withIndex(4).ofType(Types.BIGINT));
        addMetadata(fieldid, ColumnMetadata.named("FIELDID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(optionid, ColumnMetadata.named("OPTIONID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT));
    }

}

