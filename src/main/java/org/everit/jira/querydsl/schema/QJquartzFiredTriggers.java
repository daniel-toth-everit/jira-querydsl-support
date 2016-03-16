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
 * QJquartzFiredTriggers is a Querydsl query type for QJquartzFiredTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzFiredTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzFiredTriggers> {

    private static final long serialVersionUID = 1089220476;

    public static final QJquartzFiredTriggers jquartzFiredTriggers = new QJquartzFiredTriggers("JQUARTZ_FIRED_TRIGGERS");

    public final StringPath entryId = createString("entryId");

    public final NumberPath<Long> firedTime = createNumber("firedTime", Long.class);

    public final StringPath instanceName = createString("instanceName");

    public final BooleanPath isNonconcurrent = createBoolean("isNonconcurrent");

    public final BooleanPath isStateful = createBoolean("isStateful");

    public final BooleanPath isUpdateData = createBoolean("isUpdateData");

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final BooleanPath requestsRecovery = createBoolean("requestsRecovery");

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> schedTime = createNumber("schedTime", Long.class);

    public final StringPath state = createString("state");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzFiredTriggers> sysIdx110 = createPrimaryKey(entryId);

    public QJquartzFiredTriggers(String variable) {
        super(QJquartzFiredTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public QJquartzFiredTriggers(String variable, String schema, String table) {
        super(QJquartzFiredTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzFiredTriggers(Path<? extends QJquartzFiredTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public QJquartzFiredTriggers(PathMetadata metadata) {
        super(QJquartzFiredTriggers.class, metadata, "PUBLIC", "JQUARTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entryId, ColumnMetadata.named("ENTRY_ID").withIndex(2).ofType(Types.VARCHAR).withSize(95).notNull());
        addMetadata(firedTime, ColumnMetadata.named("FIRED_TIME").withIndex(7).ofType(Types.NUMERIC).withSize(13));
        addMetadata(instanceName, ColumnMetadata.named("INSTANCE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(200));
        addMetadata(isNonconcurrent, ColumnMetadata.named("IS_NONCONCURRENT").withIndex(14).ofType(Types.BOOLEAN));
        addMetadata(isStateful, ColumnMetadata.named("IS_STATEFUL").withIndex(13).ofType(Types.BOOLEAN));
        addMetadata(isUpdateData, ColumnMetadata.named("IS_UPDATE_DATA").withIndex(15).ofType(Types.BOOLEAN));
        addMetadata(isVolatile, ColumnMetadata.named("IS_VOLATILE").withIndex(5).ofType(Types.BOOLEAN));
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(priority, ColumnMetadata.named("PRIORITY").withIndex(9).ofType(Types.NUMERIC).withSize(9));
        addMetadata(requestsRecovery, ColumnMetadata.named("REQUESTS_RECOVERY").withIndex(16).ofType(Types.BOOLEAN));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(schedTime, ColumnMetadata.named("SCHED_TIME").withIndex(8).ofType(Types.NUMERIC).withSize(13));
        addMetadata(state, ColumnMetadata.named("STATE").withIndex(10).ofType(Types.VARCHAR).withSize(16));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(200));
    }

}

