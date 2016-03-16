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
 * QJquartzCalendars is a Querydsl query type for QJquartzCalendars
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzCalendars extends com.querydsl.sql.RelationalPathBase<QJquartzCalendars> {

    private static final long serialVersionUID = 690627880;

    public static final QJquartzCalendars jquartzCalendars = new QJquartzCalendars("JQUARTZ_CALENDARS");

    public final SimplePath<byte[]> calendar = createSimple("calendar", byte[].class);

    public final StringPath calendarName = createString("calendarName");

    public final StringPath schedName = createString("schedName");

    public final com.querydsl.sql.PrimaryKey<QJquartzCalendars> sysIdx108 = createPrimaryKey(calendarName);

    public QJquartzCalendars(String variable) {
        super(QJquartzCalendars.class, forVariable(variable), "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public QJquartzCalendars(String variable, String schema, String table) {
        super(QJquartzCalendars.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzCalendars(Path<? extends QJquartzCalendars> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public QJquartzCalendars(PathMetadata metadata) {
        super(QJquartzCalendars.class, metadata, "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendar, ColumnMetadata.named("CALENDAR").withIndex(3).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

