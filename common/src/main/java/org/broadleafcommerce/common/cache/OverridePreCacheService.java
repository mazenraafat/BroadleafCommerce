/*
 * #%L
 * broadleaf-multitenant-singleschema
 * %%
 * Copyright (C) 2009 - 2017 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.common.cache;

import org.broadleafcommerce.common.extension.StandardCacheItem;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jeff Fischer
 */
public interface OverridePreCacheService {

    List<StandardCacheItem> findElements(String... cacheKeys);

    boolean isActiveForType(String type);

    void groomCacheBySiteOverride(String entityType, Long cloneId, boolean isRemove);

    void groomCacheByTargetEntity(final String entityType, final Serializable id);

    void refreshCache();

}