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
 * QVotehistory is a Querydsl query type for QVotehistory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVotehistory extends com.querydsl.sql.RelationalPathBase<QVotehistory> {

    private static final long serialVersionUID = 1795107122;

    public static final QVotehistory votehistory = new QVotehistory("votehistory");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final DateTimePath<java.sql.Timestamp> timestamp = createDateTime("timestamp", java.sql.Timestamp.class);

    public final NumberPath<Long> votes = createNumber("votes", Long.class);

    public final com.querydsl.sql.PrimaryKey<QVotehistory> votehistoryPk = createPrimaryKey(id);

    public QVotehistory(String variable) {
        super(QVotehistory.class, forVariable(variable), "public", "votehistory");
        addMetadata();
    }

    public QVotehistory(String variable, String schema, String table) {
        super(QVotehistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVotehistory(Path<? extends QVotehistory> path) {
        super(path.getType(), path.getMetadata(), "public", "votehistory");
        addMetadata();
    }

    public QVotehistory(PathMetadata metadata) {
        super(QVotehistory.class, metadata, "public", "votehistory");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueid, ColumnMetadata.named("issueid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(timestamp, ColumnMetadata.named("timestamp").withIndex(4).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(votes, ColumnMetadata.named("votes").withIndex(3).ofType(Types.NUMERIC).withSize(18));
    }

}

