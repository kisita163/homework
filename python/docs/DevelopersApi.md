# swagger_client.DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/kisita162/cassie_test/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prerequisite_prerequisite_id_get**](DevelopersApi.md#prerequisite_prerequisite_id_get) | **GET** /prerequisite/{prerequisite_id} | 
[**search_inventory**](DevelopersApi.md#search_inventory) | **GET** /inventory | searches inventory

# **prerequisite_prerequisite_id_get**
> list[PrerequisitesResponse] prerequisite_prerequisite_id_get(request_id, prerequisite_id, accept=accept)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DevelopersApi()
request_id = 'request_id_example' # str | 
prerequisite_id = 'prerequisite_id_example' # str | 
accept = 'accept_example' # str |  (optional)

try:
    api_response = api_instance.prerequisite_prerequisite_id_get(request_id, prerequisite_id, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DevelopersApi->prerequisite_prerequisite_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **str**|  | 
 **prerequisite_id** | **str**|  | 
 **accept** | **str**|  | [optional] 

### Return type

[**list[PrerequisitesResponse]**](PrerequisitesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_inventory**
> list[InventoryItem] search_inventory(request_id, search_string=search_string, skip=skip, limit=limit, accept=accept)

searches inventory

By passing in the appropriate options, you can search for available inventory in the system 

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DevelopersApi()
request_id = 'request_id_example' # str | 
search_string = 'search_string_example' # str | pass an optional search string for looking up inventory (optional)
skip = 56 # int | number of records to skip for pagination (optional)
limit = 56 # int | maximum number of records to return (optional)
accept = 'accept_example' # str |  (optional)

try:
    # searches inventory
    api_response = api_instance.search_inventory(request_id, search_string=search_string, skip=skip, limit=limit, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DevelopersApi->search_inventory: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **str**|  | 
 **search_string** | **str**| pass an optional search string for looking up inventory | [optional] 
 **skip** | **int**| number of records to skip for pagination | [optional] 
 **limit** | **int**| maximum number of records to return | [optional] 
 **accept** | **str**|  | [optional] 

### Return type

[**list[InventoryItem]**](InventoryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

