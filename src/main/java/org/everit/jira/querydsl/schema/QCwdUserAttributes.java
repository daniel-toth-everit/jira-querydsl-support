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
 * QCwdUserAttributes is a Querydsl query type for QCwdUserAttributes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdUserAttributes extends com.querydsl.sql.RelationalPathBase<QCwdUserAttributes> {

    private static final long serialVersionUID = 1434343130;

    public static final QCwdUserAttributes cwdUserAttributes = new QCwdUserAttributes("CWD_USER_ATTRIBUTES");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerAttributeValue = createString("lowerAttributeValue");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCwdUserAttributes> sysIdx196 = createPrimaryKey(id);

    public QCwdUserAttributes(String variable) {
        super(QCwdUserAttributes.class, forVariable(variable), "PUBLIC", "CWD_USER_ATTRIBUTES");
        addMetadata();
    }

    public QCwdUserAttributes(String variable, String schema, String table) {
        super(QCwdUserAttributes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdUserAttributes(Path<? extends QCwdUserAttributes> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_USER_ATTRIBUTES");
        addMetadata();
    }

    public QCwdUserAttributes(PathMetadata metadata) {
        super(QCwdUserAttributes.class, metadata, "PUBLIC", "CWD_USER_ATTRIBUTES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("ATTRIBUTE_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(attributeValue, ColumnMetadata.named("ATTRIBUTE_VALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(3).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(lowerAttributeValue, ColumnMetadata.named("LOWER_ATTRIBUTE_VALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(userId, ColumnMetadata.named("USER_ID").withIndex(2).ofType(Types.BIGINT));
    }

}

