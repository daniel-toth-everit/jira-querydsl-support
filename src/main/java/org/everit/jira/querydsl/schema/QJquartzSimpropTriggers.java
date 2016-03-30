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
 * QJquartzSimpropTriggers is a Querydsl query type for QJquartzSimpropTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzSimpropTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzSimpropTriggers> {

    private static final long serialVersionUID = 1987710600;

    public static final QJquartzSimpropTriggers jquartzSimpropTriggers = new QJquartzSimpropTriggers("jquartz_simprop_triggers");

    public final BooleanPath boolProp1 = createBoolean("boolProp1");

    public final BooleanPath boolProp2 = createBoolean("boolProp2");

    public final NumberPath<java.math.BigDecimal> decProp1 = createNumber("decProp1", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> decProp2 = createNumber("decProp2", java.math.BigDecimal.class);

    public final NumberPath<Integer> intProp1 = createNumber("intProp1", Integer.class);

    public final NumberPath<Integer> intProp2 = createNumber("intProp2", Integer.class);

    public final NumberPath<Long> longProp1 = createNumber("longProp1", Long.class);

    public final NumberPath<Long> longProp2 = createNumber("longProp2", Long.class);

    public final StringPath schedName = createString("schedName");

    public final StringPath strProp1 = createString("strProp1");

    public final StringPath strProp2 = createString("strProp2");

    public final StringPath strProp3 = createString("strProp3");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzSimpropTriggers> jquartzSimpropTriggersPk = createPrimaryKey(triggerName, triggerGroup);

    public QJquartzSimpropTriggers(String variable) {
        super(QJquartzSimpropTriggers.class, forVariable(variable), "public", "jquartz_simprop_triggers");
        addMetadata();
    }

    public QJquartzSimpropTriggers(String variable, String schema, String table) {
        super(QJquartzSimpropTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSimpropTriggers(Path<? extends QJquartzSimpropTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_simprop_triggers");
        addMetadata();
    }

    public QJquartzSimpropTriggers(PathMetadata metadata) {
        super(QJquartzSimpropTriggers.class, metadata, "public", "jquartz_simprop_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boolProp1, ColumnMetadata.named("bool_prop_1").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(boolProp2, ColumnMetadata.named("bool_prop_2").withIndex(14).ofType(Types.BIT).withSize(1));
        addMetadata(decProp1, ColumnMetadata.named("dec_prop_1").withIndex(11).ofType(Types.NUMERIC).withSize(13).withDigits(4));
        addMetadata(decProp2, ColumnMetadata.named("dec_prop_2").withIndex(12).ofType(Types.NUMERIC).withSize(13).withDigits(4));
        addMetadata(intProp1, ColumnMetadata.named("int_prop_1").withIndex(7).ofType(Types.NUMERIC).withSize(9));
        addMetadata(intProp2, ColumnMetadata.named("int_prop_2").withIndex(8).ofType(Types.NUMERIC).withSize(9));
        addMetadata(longProp1, ColumnMetadata.named("long_prop_1").withIndex(9).ofType(Types.NUMERIC).withSize(18));
        addMetadata(longProp2, ColumnMetadata.named("long_prop_2").withIndex(10).ofType(Types.NUMERIC).withSize(18));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(strProp1, ColumnMetadata.named("str_prop_1").withIndex(4).ofType(Types.VARCHAR).withSize(512));
        addMetadata(strProp2, ColumnMetadata.named("str_prop_2").withIndex(5).ofType(Types.VARCHAR).withSize(512));
        addMetadata(strProp3, ColumnMetadata.named("str_prop_3").withIndex(6).ofType(Types.VARCHAR).withSize(512));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

