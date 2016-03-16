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
 * QCwdDirectoryAttribute is a Querydsl query type for QCwdDirectoryAttribute
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdDirectoryAttribute extends com.querydsl.sql.RelationalPathBase<QCwdDirectoryAttribute> {

    private static final long serialVersionUID = -1929047545;

    public static final QCwdDirectoryAttribute cwdDirectoryAttribute = new QCwdDirectoryAttribute("CWD_DIRECTORY_ATTRIBUTE");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCwdDirectoryAttribute> sysIdx68 = createPrimaryKey(attributeName, directoryId);

    public QCwdDirectoryAttribute(String variable) {
        super(QCwdDirectoryAttribute.class, forVariable(variable), "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public QCwdDirectoryAttribute(String variable, String schema, String table) {
        super(QCwdDirectoryAttribute.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectoryAttribute(Path<? extends QCwdDirectoryAttribute> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public QCwdDirectoryAttribute(PathMetadata metadata) {
        super(QCwdDirectoryAttribute.class, metadata, "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("ATTRIBUTE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(attributeValue, ColumnMetadata.named("ATTRIBUTE_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(1).ofType(Types.BIGINT).notNull());
    }

}

