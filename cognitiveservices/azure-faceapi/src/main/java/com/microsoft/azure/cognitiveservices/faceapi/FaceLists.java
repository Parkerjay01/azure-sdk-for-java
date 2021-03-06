/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.microsoft.azure.cognitiveservices.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.faceapi.models.GetFaceListResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FaceLists.
 */
public interface FaceLists {
    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String faceListId);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String faceListId, final ServiceCallback<Void> serviceCallback);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String faceListId);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String faceListId);
    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String faceListId, String name, String userData);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String faceListId, String name, String userData, final ServiceCallback<Void> serviceCallback);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String faceListId, String name, String userData);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String faceListId, String name, String userData);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GetFaceListResult object if successful.
     */
    GetFaceListResult get(String faceListId);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a Face List.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GetFaceListResult> getAsync(String faceListId, final ServiceCallback<GetFaceListResult> serviceCallback);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GetFaceListResult object
     */
    Observable<GetFaceListResult> getAsync(String faceListId);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GetFaceListResult object
     */
    Observable<ServiceResponse<GetFaceListResult>> getWithServiceResponseAsync(String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String faceListId, final ServiceCallback<Void> serviceCallback);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String faceListId);
    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String faceListId, String name, String userData);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String faceListId, String name, String userData, final ServiceCallback<Void> serviceCallback);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String faceListId, String name, String userData);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a Face List.
     * @param name Name of the face list, maximum length is 128.
     * @param userData Optional user defined data for the face list. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String faceListId, String name, String userData);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a Face List.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String faceListId, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String faceListId);

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;GetFaceListResult&gt; object if successful.
     */
    List<GetFaceListResult> list();

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<GetFaceListResult>> listAsync(final ServiceCallback<List<GetFaceListResult>> serviceCallback);

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;GetFaceListResult&gt; object
     */
    Observable<List<GetFaceListResult>> listAsync();

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;GetFaceListResult&gt; object
     */
    Observable<ServiceResponse<List<GetFaceListResult>>> listWithServiceResponseAsync();

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId faceListId of an existing face list.
     * @param persistedFaceId persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteFace(String faceListId, String persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId faceListId of an existing face list.
     * @param persistedFaceId persistedFaceId of an existing face.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteFaceAsync(String faceListId, String persistedFaceId, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId faceListId of an existing face list.
     * @param persistedFaceId persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteFaceAsync(String faceListId, String persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId faceListId of an existing face list.
     * @param persistedFaceId persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteFaceWithServiceResponseAsync(String faceListId, String persistedFaceId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addFace(String faceListId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addFaceAsync(String faceListId, final ServiceCallback<Void> serviceCallback);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addFaceAsync(String faceListId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addFaceWithServiceResponseAsync(String faceListId);
    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addFace(String faceListId, String userData, String targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addFaceAsync(String faceListId, String userData, String targetFace, final ServiceCallback<Void> serviceCallback);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addFaceAsync(String faceListId, String userData, String targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addFaceWithServiceResponseAsync(String faceListId, String userData, String targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addFaceFromStream(String faceListId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addFaceFromStreamAsync(String faceListId, final ServiceCallback<Void> serviceCallback);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addFaceFromStreamAsync(String faceListId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addFaceFromStreamWithServiceResponseAsync(String faceListId);
    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addFaceFromStream(String faceListId, String userData, String targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addFaceFromStreamAsync(String faceListId, String userData, String targetFace, final ServiceCallback<Void> serviceCallback);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addFaceFromStreamAsync(String faceListId, String userData, String targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a Face List.
     * @param userData User-specified data about the face list for any purpose. The  maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added into the face list, in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addFaceFromStreamWithServiceResponseAsync(String faceListId, String userData, String targetFace);

}
