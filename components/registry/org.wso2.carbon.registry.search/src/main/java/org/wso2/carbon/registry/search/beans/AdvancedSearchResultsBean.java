/*
 * Copyright (c) 2006, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.registry.search.beans;

import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import org.wso2.carbon.registry.common.ResourceData;
import org.wso2.carbon.registry.common.TermData;

@SuppressWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class AdvancedSearchResultsBean {

    private ResourceData [] resourceDataList;

    protected String errorMessage;

    private TermData[] searchTermsList;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ResourceData [] getResourceDataList() {
        return resourceDataList;
    }

    public void setResourceDataList(ResourceData [] resourceDataList) {
        this.resourceDataList = resourceDataList;
    }

    /**
     * This method is used to get SearchTerm list.
     *
     * @return SearchTerm list
     */
    public TermData[] getSearchTermsList() {
        return searchTermsList;
    }

    /**
     * This method is used to get SearchTerm list.
     *
     * @param searchTermsList SearchTerm list
     */
    public void setSearchTermsList(TermData[] searchTermsList) {
        this.searchTermsList = searchTermsList;
    }
}
