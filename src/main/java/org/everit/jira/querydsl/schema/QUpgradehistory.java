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
 * QUpgradehistory is a Querydsl query type for QUpgradehistory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUpgradehistory extends com.querydsl.sql.RelationalPathBase<QUpgradehistory> {

    private static final long serialVersionUID = -990590160;

    public static final QUpgradehistory upgradehistory = new QUpgradehistory("UPGRADEHISTORY");

    public final StringPath downgradetaskrequired = createString("downgradetaskrequired");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath status = createString("status");

    public final StringPath targetbuild = createString("targetbuild");

    public final StringPath upgradeclass = createString("upgradeclass");

    public final com.querydsl.sql.PrimaryKey<QUpgradehistory> sysIdx192 = createPrimaryKey(upgradeclass);

    public QUpgradehistory(String variable) {
        super(QUpgradehistory.class, forVariable(variable), "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public QUpgradehistory(String variable, String schema, String table) {
        super(QUpgradehistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUpgradehistory(Path<? extends QUpgradehistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public QUpgradehistory(PathMetadata metadata) {
        super(QUpgradehistory.class, metadata, "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(downgradetaskrequired, ColumnMetadata.named("DOWNGRADETASKREQUIRED").withIndex(5).ofType(Types.CHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(targetbuild, ColumnMetadata.named("TARGETBUILD").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(upgradeclass, ColumnMetadata.named("UPGRADECLASS").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

