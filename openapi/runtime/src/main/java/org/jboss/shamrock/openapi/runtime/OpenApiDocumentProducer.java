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

package org.jboss.shamrock.openapi.runtime;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import io.smallrye.openapi.api.OpenApiDocument;

/**
 * @author Ken Finnigan
 */
@ApplicationScoped
public class OpenApiDocumentProducer {
    private OpenApiDocument document;

    @Produces
    @Dependent
    OpenApiDocument openApiDocument() {
        return this.document;
    }

    void setDocument(OpenApiDocument document) {
        this.document = document;
    }
}
