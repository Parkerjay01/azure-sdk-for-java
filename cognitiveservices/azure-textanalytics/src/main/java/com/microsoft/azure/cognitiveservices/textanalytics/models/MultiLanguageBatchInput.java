/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.textanalytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MultiLanguageBatchInput model.
 */
public class MultiLanguageBatchInput {
    /**
     * The documents property.
     */
    @JsonProperty(value = "documents")
    private List<MultiLanguageInput> documents;

    /**
     * Get the documents value.
     *
     * @return the documents value
     */
    public List<MultiLanguageInput> documents() {
        return this.documents;
    }

    /**
     * Set the documents value.
     *
     * @param documents the documents value to set
     * @return the MultiLanguageBatchInput object itself.
     */
    public MultiLanguageBatchInput withDocuments(List<MultiLanguageInput> documents) {
        this.documents = documents;
        return this;
    }

}
