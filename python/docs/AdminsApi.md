# swagger_client.AdminsApi

All URIs are relative to *https://virtserver.swaggerhub.com/kisita162/cassie_test/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_inventory**](AdminsApi.md#add_inventory) | **POST** /inventory | adds an inventory item

# **add_inventory**
> add_inventory(request_id, body=body, accept=accept)

adds an inventory item

Adds an item to the system

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AdminsApi()
request_id = 'request_id_example' # str | 
body = swagger_client.InventoryItem() # InventoryItem | Inventory item to add (optional)
accept = 'accept_example' # str |  (optional)

try:
    # adds an inventory item
    api_instance.add_inventory(request_id, body=body, accept=accept)
except ApiException as e:
    print("Exception when calling AdminsApi->add_inventory: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **str**|  | 
 **body** | [**InventoryItem**](InventoryItem.md)| Inventory item to add | [optional] 
 **accept** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

