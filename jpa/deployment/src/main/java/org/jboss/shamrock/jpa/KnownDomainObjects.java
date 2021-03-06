/*
 * Copyright 2018 Red Hat, Inc.
 *
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
 */

package org.jboss.shamrock.jpa;

import java.util.Set;

/**
 * Internal model to represent which objects are likely needing enhancement
 * via HibernateEntityEnhancer
 */
public interface KnownDomainObjects {

    /**
     * @param className
     * @return false only when it is safe to skip enhancement on the named class.
     */
    boolean contains(String className);

    Set<String> getClassNames();
}
