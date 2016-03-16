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
 * QCwdGroupAttributes is a Querydsl query type for QCwdGroupAttributes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdGroupAttributes extends com.querydsl.sql.RelationalPathBase<QCwdGroupAttributes> {

    private static final long serialVersionUID = 1488891102;

    public static final QCwdGroupAttributes cwdGroupAttributes = new QCwdGroupAttributes("CWD_GROUP_ATTRIBUTES");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerAttributeValue = createString("lowerAttributeValue");

    public final com.querydsl.sql.PrimaryKey<QCwdGroupAttributes> sysIdx99 = createPrimaryKey(id);

    public QCwdGroupAttributes(String variable) {
        super(QCwdGroupAttributes.class, forVariable(variable), "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public QCwdGroupAttributes(String variable, String schema, String table) {
        super(QCwdGroupAttributes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdGroupAttributes(Path<? extends QCwdGroupAttributes> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public QCwdGroupAttributes(PathMetadata metadata) {
        super(QCwdGroupAttributes.class, metadata, "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("ATTRIBUTE_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(attributeValue, ColumnMetadata.named("ATTRIBUTE_VALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(3).ofType(Types.BIGINT));
        addMetadata(groupId, ColumnMetadata.named("GROUP_ID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(lowerAttributeValue, ColumnMetadata.named("LOWER_ATTRIBUTE_VALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

