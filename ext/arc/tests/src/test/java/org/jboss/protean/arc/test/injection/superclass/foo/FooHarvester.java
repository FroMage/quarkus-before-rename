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

package org.jboss.protean.arc.test.injection.superclass.foo;

import javax.inject.Inject;

import org.jboss.protean.arc.test.injection.superclass.SuperclassInjectionTest.Head;
import org.jboss.protean.arc.test.injection.superclass.SuperclassInjectionTest.SuperHarvester;

public abstract class FooHarvester extends SuperHarvester {

    private Head head3;

    @Inject
    Head head4;

    @Inject
    void setHead3(Head head) {
        this.head3 = head;
    }

    public Head getHead3() {
        return head3;
    }

    public Head getHead4() {
        return head4;
    }

}
