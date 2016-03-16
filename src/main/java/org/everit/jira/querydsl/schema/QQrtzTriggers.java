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
 * QQrtzTriggers is a Querydsl query type for QQrtzTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzTriggers> {

    private static final long serialVersionUID = 1668156794;

    public static final QQrtzTriggers qrtzTriggers = new QQrtzTriggers("QRTZ_TRIGGERS");

    public final StringPath calendarName = createString("calendarName");

    public final DateTimePath<java.sql.Timestamp> endTime = createDateTime("endTime", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> job = createNumber("job", Long.class);

    public final NumberPath<Integer> misfireInstr = createNumber("misfireInstr", Integer.class);

    public final DateTimePath<java.sql.Timestamp> nextFire = createDateTime("nextFire", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerState = createString("triggerState");

    public final StringPath triggerType = createString("triggerType");

    public final com.querydsl.sql.PrimaryKey<QQrtzTriggers> sysIdx173 = createPrimaryKey(id);

    public QQrtzTriggers(String variable) {
        super(QQrtzTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public QQrtzTriggers(String variable, String schema, String table) {
        super(QQrtzTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggers(Path<? extends QQrtzTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public QQrtzTriggers(PathMetadata metadata) {
        super(QQrtzTriggers.class, metadata, "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(endTime, ColumnMetadata.named("END_TIME").withIndex(9).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(job, ColumnMetadata.named("JOB").withIndex(4).ofType(Types.BIGINT));
        addMetadata(misfireInstr, ColumnMetadata.named("MISFIRE_INSTR").withIndex(11).ofType(Types.INTEGER));
        addMetadata(nextFire, ColumnMetadata.named("NEXT_FIRE").withIndex(5).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(startTime, ColumnMetadata.named("START_TIME").withIndex(8).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerState, ColumnMetadata.named("TRIGGER_STATE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerType, ColumnMetadata.named("TRIGGER_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

