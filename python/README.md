# swagger-client
This is a simple API

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
request_id = 'request_id_example' # str | 
body = swagger_client.InventoryItem() # InventoryItem | Inventory item to add (optional)
accept = 'accept_example' # str |  (optional)

try:
    # adds an inventory item
    api_instance.add_inventory(request_id, body=body, accept=accept)
except ApiException as e:
    print("Exception when calling AdminsApi->add_inventory: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/kisita162/cassie_test/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminsApi* | [**add_inventory**](docs/AdminsApi.md#add_inventory) | **POST** /inventory | adds an inventory item
*DevelopersApi* | [**prerequisite_prerequisite_id_get**](docs/DevelopersApi.md#prerequisite_prerequisite_id_get) | **GET** /prerequisite/{prerequisite_id} | 
*DevelopersApi* | [**search_inventory**](docs/DevelopersApi.md#search_inventory) | **GET** /inventory | searches inventory

## Documentation For Models

 - [InventoryItem](docs/InventoryItem.md)
 - [Manufacturer](docs/Manufacturer.md)
 - [PrerequisitesResponse](docs/PrerequisitesResponse.md)

## Documentation For Authorization

 All endpoints do not require authorization.


## Author

hugues.kisitankebi@belfius.be