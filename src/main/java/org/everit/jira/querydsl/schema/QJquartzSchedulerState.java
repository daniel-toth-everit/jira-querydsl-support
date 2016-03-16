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
 * QJquartzSchedulerState is a Querydsl query type for QJquartzSchedulerState
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzSchedulerState extends com.querydsl.sql.RelationalPathBase<QJquartzSchedulerState> {

    private static final long serialVersionUID = 1551810627;

    public static final QJquartzSchedulerState jquartzSchedulerState = new QJquartzSchedulerState("JQUARTZ_SCHEDULER_STATE");

    public final NumberPath<Long> checkinInterval = createNumber("checkinInterval", Long.class);

    public final StringPath instanceName = createString("instanceName");

    public final NumberPath<Long> lastCheckinTime = createNumber("lastCheckinTime", Long.class);

    public final StringPath schedName = createString("schedName");

    public final com.querydsl.sql.PrimaryKey<QJquartzSchedulerState> sysIdx115 = createPrimaryKey(instanceName);

    public QJquartzSchedulerState(String variable) {
        super(QJquartzSchedulerState.class, forVariable(variable), "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public QJquartzSchedulerState(String variable, String schema, String table) {
        super(QJquartzSchedulerState.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSchedulerState(Path<? extends QJquartzSchedulerState> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public QJquartzSchedulerState(PathMetadata metadata) {
        super(QJquartzSchedulerState.class, metadata, "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(checkinInterval, ColumnMetadata.named("CHECKIN_INTERVAL").withIndex(4).ofType(Types.NUMERIC).withSize(13));
        addMetadata(instanceName, ColumnMetadata.named("INSTANCE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(lastCheckinTime, ColumnMetadata.named("LAST_CHECKIN_TIME").withIndex(3).ofType(Types.NUMERIC).withSize(13));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

