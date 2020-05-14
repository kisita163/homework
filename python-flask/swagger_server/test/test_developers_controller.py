# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inventory_item import InventoryItem  # noqa: E501
from swagger_server.models.prerequisites_response import PrerequisitesResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDevelopersController(BaseTestCase):
    """DevelopersController integration test stubs"""

    def test_prerequisite_prerequisite_id_get(self):
        """Test case for prerequisite_prerequisite_id_get

        
        """
        headers = [('accept', 'accept_example'),
                   ('request_id', 'request_id_example')]
        response = self.client.open(
            '/kisita162/cassie_test/1.0.0/prerequisite/{prerequisite_id}'.format(prerequisite_id='prerequisite_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_inventory(self):
        """Test case for search_inventory

        searches inventory
        """
        query_string = [('search_string', 'search_string_example'),
                        ('skip', 1),
                        ('limit', 50)]
        headers = [('accept', 'accept_example'),
                   ('request_id', 'request_id_example')]
        response = self.client.open(
            '/kisita162/cassie_test/1.0.0/inventory',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
