/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing facial emotion.
 */
public class EmotionProperties {
    /**
     * The anger property.
     */
    @JsonProperty(value = "anger")
    private Double anger;

    /**
     * The contempt property.
     */
    @JsonProperty(value = "contempt")
    private Double contempt;

    /**
     * The disgust property.
     */
    @JsonProperty(value = "disgust")
    private Double disgust;

    /**
     * The fear property.
     */
    @JsonProperty(value = "fear")
    private Double fear;

    /**
     * The happiness property.
     */
    @JsonProperty(value = "happiness")
    private Double happiness;

    /**
     * The neutral property.
     */
    @JsonProperty(value = "neutral")
    private Double neutral;

    /**
     * The sadness property.
     */
    @JsonProperty(value = "sadness")
    private Double sadness;

    /**
     * The surprise property.
     */
    @JsonProperty(value = "surprise")
    private Double surprise;

    /**
     * Get the anger value.
     *
     * @return the anger value
     */
    public Double anger() {
        return this.anger;
    }

    /**
     * Set the anger value.
     *
     * @param anger the anger value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withAnger(Double anger) {
        this.anger = anger;
        return this;
    }

    /**
     * Get the contempt value.
     *
     * @return the contempt value
     */
    public Double contempt() {
        return this.contempt;
    }

    /**
     * Set the contempt value.
     *
     * @param contempt the contempt value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withContempt(Double contempt) {
        this.contempt = contempt;
        return this;
    }

    /**
     * Get the disgust value.
     *
     * @return the disgust value
     */
    public Double disgust() {
        return this.disgust;
    }

    /**
     * Set the disgust value.
     *
     * @param disgust the disgust value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withDisgust(Double disgust) {
        this.disgust = disgust;
        return this;
    }

    /**
     * Get the fear value.
     *
     * @return the fear value
     */
    public Double fear() {
        return this.fear;
    }

    /**
     * Set the fear value.
     *
     * @param fear the fear value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withFear(Double fear) {
        this.fear = fear;
        return this;
    }

    /**
     * Get the happiness value.
     *
     * @return the happiness value
     */
    public Double happiness() {
        return this.happiness;
    }

    /**
     * Set the happiness value.
     *
     * @param happiness the happiness value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withHappiness(Double happiness) {
        this.happiness = happiness;
        return this;
    }

    /**
     * Get the neutral value.
     *
     * @return the neutral value
     */
    public Double neutral() {
        return this.neutral;
    }

    /**
     * Set the neutral value.
     *
     * @param neutral the neutral value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withNeutral(Double neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * Get the sadness value.
     *
     * @return the sadness value
     */
    public Double sadness() {
        return this.sadness;
    }

    /**
     * Set the sadness value.
     *
     * @param sadness the sadness value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withSadness(Double sadness) {
        this.sadness = sadness;
        return this;
    }

    /**
     * Get the surprise value.
     *
     * @return the surprise value
     */
    public Double surprise() {
        return this.surprise;
    }

    /**
     * Set the surprise value.
     *
     * @param surprise the surprise value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withSurprise(Double surprise) {
        this.surprise = surprise;
        return this;
    }

}
