# coding: utf-8

"""
    Simple Inventory API for me

    This is a simple API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: hugues.kisitankebi@belfius.be
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class AdminsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def add_inventory(self, request_id, **kwargs):  # noqa: E501
        """adds an inventory item  # noqa: E501

        Adds an item to the system  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_inventory(request_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str request_id: (required)
        :param InventoryItem body: Inventory item to add
        :param str accept:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.add_inventory_with_http_info(request_id, **kwargs)  # noqa: E501
        else:
            (data) = self.add_inventory_with_http_info(request_id, **kwargs)  # noqa: E501
            return data

    def add_inventory_with_http_info(self, request_id, **kwargs):  # noqa: E501
        """adds an inventory item  # noqa: E501

        Adds an item to the system  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_inventory_with_http_info(request_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str request_id: (required)
        :param InventoryItem body: Inventory item to add
        :param str accept:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['request_id', 'body', 'accept']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method add_inventory" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'request_id' is set
        if ('request_id' not in params or
                params['request_id'] is None):
            raise ValueError("Missing the required parameter `request_id` when calling `add_inventory`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}
        if 'accept' in params:
            header_params['Accept'] = params['accept']  # noqa: E501
        if 'request_id' in params:
            header_params['Request-ID'] = params['request_id']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/inventory', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
