/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.microsoft.azure.cognitiveservices.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.faceapi.models.PersonGroupResult;
import com.microsoft.azure.cognitiveservices.faceapi.models.TrainingStatus;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PersonGroups.
 */
public interface PersonGroups {
    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String personGroupId);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String personGroupId, final ServiceCallback<Void> serviceCallback);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String personGroupId);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String personGroupId);
    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String personGroupId, String name, String userData);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String personGroupId, String name, String userData, final ServiceCallback<Void> serviceCallback);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String personGroupId, String name, String userData);

    /**
     * Create a new person group with specified personGroupId, name and user-provided userData.
     *
     * @param personGroupId User-provided personGroupId as a string.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String personGroupId, String name, String userData);

    /**
     * Delete an existing person group. Persisted face images of all people in the person group will also be deleted.
     *
     * @param personGroupId The personGroupId of the person group to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String personGroupId);

    /**
     * Delete an existing person group. Persisted face images of all people in the person group will also be deleted.
     *
     * @param personGroupId The personGroupId of the person group to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String personGroupId, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete an existing person group. Persisted face images of all people in the person group will also be deleted.
     *
     * @param personGroupId The personGroupId of the person group to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String personGroupId);

    /**
     * Delete an existing person group. Persisted face images of all people in the person group will also be deleted.
     *
     * @param personGroupId The personGroupId of the person group to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String personGroupId);

    /**
     * Retrieve the information of a person group, including its name and userData.
     *
     * @param personGroupId personGroupId of the target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersonGroupResult object if successful.
     */
    PersonGroupResult get(String personGroupId);

    /**
     * Retrieve the information of a person group, including its name and userData.
     *
     * @param personGroupId personGroupId of the target person group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PersonGroupResult> getAsync(String personGroupId, final ServiceCallback<PersonGroupResult> serviceCallback);

    /**
     * Retrieve the information of a person group, including its name and userData.
     *
     * @param personGroupId personGroupId of the target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersonGroupResult object
     */
    Observable<PersonGroupResult> getAsync(String personGroupId);

    /**
     * Retrieve the information of a person group, including its name and userData.
     *
     * @param personGroupId personGroupId of the target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersonGroupResult object
     */
    Observable<ServiceResponse<PersonGroupResult>> getWithServiceResponseAsync(String personGroupId);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String personGroupId);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String personGroupId, final ServiceCallback<Void> serviceCallback);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String personGroupId);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String personGroupId);
    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String personGroupId, String name, String userData);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String personGroupId, String name, String userData, final ServiceCallback<Void> serviceCallback);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String personGroupId, String name, String userData);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId personGroupId of the person group to be updated.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String personGroupId, String name, String userData);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId personGroupId of target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrainingStatus object if successful.
     */
    TrainingStatus getTrainingStatus(String personGroupId);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId personGroupId of target person group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrainingStatus> getTrainingStatusAsync(String personGroupId, final ServiceCallback<TrainingStatus> serviceCallback);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId personGroupId of target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrainingStatus object
     */
    Observable<TrainingStatus> getTrainingStatusAsync(String personGroupId);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId personGroupId of target person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrainingStatus object
     */
    Observable<ServiceResponse<TrainingStatus>> getTrainingStatusWithServiceResponseAsync(String personGroupId);

    /**
     * List person groups and their information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PersonGroupResult&gt; object if successful.
     */
    List<PersonGroupResult> list();

    /**
     * List person groups and their information.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PersonGroupResult>> listAsync(final ServiceCallback<List<PersonGroupResult>> serviceCallback);

    /**
     * List person groups and their information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersonGroupResult&gt; object
     */
    Observable<List<PersonGroupResult>> listAsync();

    /**
     * List person groups and their information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersonGroupResult&gt; object
     */
    Observable<ServiceResponse<List<PersonGroupResult>>> listWithServiceResponseAsync();
    /**
     * List person groups and their information.
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PersonGroupResult&gt; object if successful.
     */
    List<PersonGroupResult> list(String start, Integer top);

    /**
     * List person groups and their information.
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PersonGroupResult>> listAsync(String start, Integer top, final ServiceCallback<List<PersonGroupResult>> serviceCallback);

    /**
     * List person groups and their information.
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersonGroupResult&gt; object
     */
    Observable<List<PersonGroupResult>> listAsync(String start, Integer top);

    /**
     * List person groups and their information.
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersonGroupResult&gt; object
     */
    Observable<ServiceResponse<List<PersonGroupResult>>> listWithServiceResponseAsync(String start, Integer top);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Target person group to be trained.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void train(String personGroupId);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Target person group to be trained.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> trainAsync(String personGroupId, final ServiceCallback<Void> serviceCallback);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Target person group to be trained.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> trainAsync(String personGroupId);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Target person group to be trained.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> trainWithServiceResponseAsync(String personGroupId);

}
