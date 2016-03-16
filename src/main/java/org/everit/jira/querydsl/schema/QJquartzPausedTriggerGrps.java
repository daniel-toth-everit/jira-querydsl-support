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
 * QJquartzPausedTriggerGrps is a Querydsl query type for QJquartzPausedTriggerGrps
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzPausedTriggerGrps extends com.querydsl.sql.RelationalPathBase<QJquartzPausedTriggerGrps> {

    private static final long serialVersionUID = 326546731;

    public static final QJquartzPausedTriggerGrps jquartzPausedTriggerGrps = new QJquartzPausedTriggerGrps("JQUARTZ_PAUSED_TRIGGER_GRPS");

    public final StringPath schedName = createString("schedName");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final com.querydsl.sql.PrimaryKey<QJquartzPausedTriggerGrps> sysIdx114 = createPrimaryKey(triggerGroup);

    public QJquartzPausedTriggerGrps(String variable) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(String variable, String schema, String table) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(Path<? extends QJquartzPausedTriggerGrps> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(PathMetadata metadata) {
        super(QJquartzPausedTriggerGrps.class, metadata, "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

