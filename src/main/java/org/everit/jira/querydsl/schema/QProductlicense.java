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
 * QProductlicense is a Querydsl query type for QProductlicense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProductlicense extends com.querydsl.sql.RelationalPathBase<QProductlicense> {

    private static final long serialVersionUID = -1140067158;

    public static final QProductlicense productlicense = new QProductlicense("productlicense");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath license = createString("license");

    public final com.querydsl.sql.PrimaryKey<QProductlicense> productlicensePk = createPrimaryKey(id);

    public QProductlicense(String variable) {
        super(QProductlicense.class, forVariable(variable), "public", "productlicense");
        addMetadata();
    }

    public QProductlicense(String variable, String schema, String table) {
        super(QProductlicense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProductlicense(Path<? extends QProductlicense> path) {
        super(path.getType(), path.getMetadata(), "public", "productlicense");
        addMetadata();
    }

    public QProductlicense(PathMetadata metadata) {
        super(QProductlicense.class, metadata, "public", "productlicense");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(license, ColumnMetadata.named("license").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

