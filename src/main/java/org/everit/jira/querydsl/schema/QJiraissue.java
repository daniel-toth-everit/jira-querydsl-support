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
 * QJiraissue is a Querydsl query type for QJiraissue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJiraissue extends com.querydsl.sql.RelationalPathBase<QJiraissue> {

    private static final long serialVersionUID = 809853619;

    public static final QJiraissue jiraissue = new QJiraissue("JIRAISSUE");

    public final StringPath assignee = createString("assignee");

    public final NumberPath<Long> component = createNumber("component", Long.class);

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath creator = createString("creator");

    public final StringPath description = createString("description");

    public final DateTimePath<java.sql.Timestamp> duedate = createDateTime("duedate", java.sql.Timestamp.class);

    public final StringPath environment = createString("environment");

    public final NumberPath<Long> fixfor = createNumber("fixfor", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issuenum = createNumber("issuenum", Long.class);

    public final StringPath issuestatus = createString("issuestatus");

    public final StringPath issuetype = createString("issuetype");

    public final StringPath pkey = createString("pkey");

    public final StringPath priority = createString("priority");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath reporter = createString("reporter");

    public final StringPath resolution = createString("resolution");

    public final DateTimePath<java.sql.Timestamp> resolutiondate = createDateTime("resolutiondate", java.sql.Timestamp.class);

    public final NumberPath<Long> security = createNumber("security", Long.class);

    public final StringPath summary = createString("summary");

    public final NumberPath<Long> timeestimate = createNumber("timeestimate", Long.class);

    public final NumberPath<Long> timeoriginalestimate = createNumber("timeoriginalestimate", Long.class);

    public final NumberPath<Long> timespent = createNumber("timespent", Long.class);

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final NumberPath<Long> votes = createNumber("votes", Long.class);

    public final NumberPath<Long> watches = createNumber("watches", Long.class);

    public final NumberPath<Long> workflowId = createNumber("workflowId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJiraissue> sysIdx100 = createPrimaryKey(id);

    public QJiraissue(String variable) {
        super(QJiraissue.class, forVariable(variable), "PUBLIC", "JIRAISSUE");
        addMetadata();
    }

    public QJiraissue(String variable, String schema, String table) {
        super(QJiraissue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraissue(Path<? extends QJiraissue> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAISSUE");
        addMetadata();
    }

    public QJiraissue(PathMetadata metadata) {
        super(QJiraissue.class, metadata, "PUBLIC", "JIRAISSUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assignee, ColumnMetadata.named("ASSIGNEE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(component, ColumnMetadata.named("COMPONENT").withIndex(27).ofType(Types.BIGINT));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(15).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(creator, ColumnMetadata.named("CREATOR").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(duedate, ColumnMetadata.named("DUEDATE").withIndex(17).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(environment, ColumnMetadata.named("ENVIRONMENT").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fixfor, ColumnMetadata.named("FIXFOR").withIndex(26).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issuenum, ColumnMetadata.named("ISSUENUM").withIndex(3).ofType(Types.BIGINT));
        addMetadata(issuestatus, ColumnMetadata.named("ISSUESTATUS").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pkey, ColumnMetadata.named("PKEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(priority, ColumnMetadata.named("PRIORITY").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(4).ofType(Types.BIGINT));
        addMetadata(reporter, ColumnMetadata.named("REPORTER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(resolution, ColumnMetadata.named("RESOLUTION").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(resolutiondate, ColumnMetadata.named("RESOLUTIONDATE").withIndex(18).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(security, ColumnMetadata.named("SECURITY").withIndex(25).ofType(Types.BIGINT));
        addMetadata(summary, ColumnMetadata.named("SUMMARY").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeestimate, ColumnMetadata.named("TIMEESTIMATE").withIndex(22).ofType(Types.BIGINT));
        addMetadata(timeoriginalestimate, ColumnMetadata.named("TIMEORIGINALESTIMATE").withIndex(21).ofType(Types.BIGINT));
        addMetadata(timespent, ColumnMetadata.named("TIMESPENT").withIndex(23).ofType(Types.BIGINT));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(16).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(votes, ColumnMetadata.named("VOTES").withIndex(19).ofType(Types.BIGINT));
        addMetadata(watches, ColumnMetadata.named("WATCHES").withIndex(20).ofType(Types.BIGINT));
        addMetadata(workflowId, ColumnMetadata.named("WORKFLOW_ID").withIndex(24).ofType(Types.BIGINT));
    }

}

