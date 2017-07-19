/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.implementation;

import com.microsoft.azure.management.servicefabric.AvailableOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available operation list result.
 */
public class OperationResultInner {
    /**
     * Result name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Dispaly of the result.
     */
    @JsonProperty(value = "display")
    private AvailableOperationDisplay display;

    /**
     * Origin result.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display value.
     *
     * @return the display value
     */
    public AvailableOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withDisplay(AvailableOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin value.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin value.
     *
     * @param origin the origin value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}