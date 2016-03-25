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
 * QClusterlockstatus is a Querydsl query type for QClusterlockstatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClusterlockstatus extends com.querydsl.sql.RelationalPathBase<QClusterlockstatus> {

    private static final long serialVersionUID = -552483041;

    public static final QClusterlockstatus clusterlockstatus = new QClusterlockstatus("clusterlockstatus");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lockedByNode = createString("lockedByNode");

    public final StringPath lockName = createString("lockName");

    public final NumberPath<Long> updateTime = createNumber("updateTime", Long.class);

    public final com.querydsl.sql.PrimaryKey<QClusterlockstatus> clusterlockstatusPk = createPrimaryKey(id);

    public QClusterlockstatus(String variable) {
        super(QClusterlockstatus.class, forVariable(variable), "public", "clusterlockstatus");
        addMetadata();
    }

    public QClusterlockstatus(String variable, String schema, String table) {
        super(QClusterlockstatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusterlockstatus(Path<? extends QClusterlockstatus> path) {
        super(path.getType(), path.getMetadata(), "public", "clusterlockstatus");
        addMetadata();
    }

    public QClusterlockstatus(PathMetadata metadata) {
        super(QClusterlockstatus.class, metadata, "public", "clusterlockstatus");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lockedByNode, ColumnMetadata.named("locked_by_node").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(lockName, ColumnMetadata.named("lock_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updateTime, ColumnMetadata.named("update_time").withIndex(4).ofType(Types.NUMERIC).withSize(18));
    }

}

