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
 * QGadgetuserpreference is a Querydsl query type for QGadgetuserpreference
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGadgetuserpreference extends com.querydsl.sql.RelationalPathBase<QGadgetuserpreference> {

    private static final long serialVersionUID = 1980109930;

    public static final QGadgetuserpreference gadgetuserpreference = new QGadgetuserpreference("GADGETUSERPREFERENCE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> portletconfiguration = createNumber("portletconfiguration", Long.class);

    public final StringPath userprefkey = createString("userprefkey");

    public final StringPath userprefvalue = createString("userprefvalue");

    public final com.querydsl.sql.PrimaryKey<QGadgetuserpreference> sysIdx95 = createPrimaryKey(id);

    public QGadgetuserpreference(String variable) {
        super(QGadgetuserpreference.class, forVariable(variable), "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public QGadgetuserpreference(String variable, String schema, String table) {
        super(QGadgetuserpreference.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGadgetuserpreference(Path<? extends QGadgetuserpreference> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public QGadgetuserpreference(PathMetadata metadata) {
        super(QGadgetuserpreference.class, metadata, "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(portletconfiguration, ColumnMetadata.named("PORTLETCONFIGURATION").withIndex(2).ofType(Types.BIGINT));
        addMetadata(userprefkey, ColumnMetadata.named("USERPREFKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(userprefvalue, ColumnMetadata.named("USERPREFVALUE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

