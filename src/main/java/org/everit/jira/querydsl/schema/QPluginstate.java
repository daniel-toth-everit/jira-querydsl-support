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
 * QPluginstate is a Querydsl query type for QPluginstate
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPluginstate extends com.querydsl.sql.RelationalPathBase<QPluginstate> {

    private static final long serialVersionUID = -1304711162;

    public static final QPluginstate pluginstate = new QPluginstate("pluginstate");

    public final StringPath pluginenabled = createString("pluginenabled");

    public final StringPath pluginkey = createString("pluginkey");

    public final com.querydsl.sql.PrimaryKey<QPluginstate> pluginstatePk = createPrimaryKey(pluginkey);

    public QPluginstate(String variable) {
        super(QPluginstate.class, forVariable(variable), "public", "pluginstate");
        addMetadata();
    }

    public QPluginstate(String variable, String schema, String table) {
        super(QPluginstate.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPluginstate(Path<? extends QPluginstate> path) {
        super(path.getType(), path.getMetadata(), "public", "pluginstate");
        addMetadata();
    }

    public QPluginstate(PathMetadata metadata) {
        super(QPluginstate.class, metadata, "public", "pluginstate");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pluginenabled, ColumnMetadata.named("pluginenabled").withIndex(2).ofType(Types.VARCHAR).withSize(60));
        addMetadata(pluginkey, ColumnMetadata.named("pluginkey").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
    }

}

