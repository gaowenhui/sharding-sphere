/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.parsing.antlr.sql.segment;

import java.util.HashMap;
import java.util.Map;

import io.shardingsphere.core.parsing.antlr.sql.segment.condition.OrConditionSegment;
import lombok.Getter;
import lombok.Setter;

/**
 * From where segment.
 * 
 * @author duhongjun
 */
@Getter
public final class FromWhereSegment implements SQLSegment {
    
    private final Map<String, String> tableAliases = new HashMap<>();
    
    private final OrConditionSegment conditions = new OrConditionSegment();
    
    @Setter
    private Integer paramenterCount;
}
