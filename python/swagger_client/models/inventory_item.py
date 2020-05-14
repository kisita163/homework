# coding: utf-8

"""
    Simple Inventory API for me

    This is a simple API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: hugues.kisitankebi@belfius.be
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six


class InventoryItem(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'str',
        'name': 'str',
        'release_date': 'datetime',
        'manufacturer': 'Manufacturer'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'release_date': 'releaseDate',
        'manufacturer': 'manufacturer'
    }

    def __init__(self, id=None, name=None, release_date=None, manufacturer=None):  # noqa: E501
        """InventoryItem - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._name = None
        self._release_date = None
        self._manufacturer = None
        self.discriminator = None
        self.id = id
        self.name = name
        self.release_date = release_date
        self.manufacturer = manufacturer

    @property
    def id(self):
        """Gets the id of this InventoryItem.  # noqa: E501


        :return: The id of this InventoryItem.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this InventoryItem.


        :param id: The id of this InventoryItem.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this InventoryItem.  # noqa: E501


        :return: The name of this InventoryItem.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this InventoryItem.


        :param name: The name of this InventoryItem.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def release_date(self):
        """Gets the release_date of this InventoryItem.  # noqa: E501


        :return: The release_date of this InventoryItem.  # noqa: E501
        :rtype: datetime
        """
        return self._release_date

    @release_date.setter
    def release_date(self, release_date):
        """Sets the release_date of this InventoryItem.


        :param release_date: The release_date of this InventoryItem.  # noqa: E501
        :type: datetime
        """
        if release_date is None:
            raise ValueError("Invalid value for `release_date`, must not be `None`")  # noqa: E501

        self._release_date = release_date

    @property
    def manufacturer(self):
        """Gets the manufacturer of this InventoryItem.  # noqa: E501


        :return: The manufacturer of this InventoryItem.  # noqa: E501
        :rtype: Manufacturer
        """
        return self._manufacturer

    @manufacturer.setter
    def manufacturer(self, manufacturer):
        """Sets the manufacturer of this InventoryItem.


        :param manufacturer: The manufacturer of this InventoryItem.  # noqa: E501
        :type: Manufacturer
        """
        if manufacturer is None:
            raise ValueError("Invalid value for `manufacturer`, must not be `None`")  # noqa: E501

        self._manufacturer = manufacturer

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(InventoryItem, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InventoryItem):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
