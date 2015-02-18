/**
 * Copyright 2015 DuraSpace, Inc.
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
package org.fcrepo.sword.core;

import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.model.Feed;
import org.swordapp.server.AuthCredentials;
import org.swordapp.server.CollectionListManager;
import org.swordapp.server.SwordAuthException;
import org.swordapp.server.SwordConfiguration;
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;

/**
 * @author claussni
 */
public class CollectionListManagerImpl implements CollectionListManager {
    /**
     * @param collectionIRI
     * @param auth
     * @param config
     * @return
     * @throws SwordServerException
     * @throws SwordAuthException
     * @throws SwordError
     */
    @Override
    public Feed listCollectionContents(
            final IRI collectionIRI,
            final AuthCredentials auth,
            final SwordConfiguration config) throws SwordServerException, SwordAuthException, SwordError {
        throw new UnsupportedOperationException();
    }
}
