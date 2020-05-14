import connexion
import six

from swagger_server.models.inventory_item import InventoryItem  # noqa: E501
from swagger_server.models.prerequisites_response import PrerequisitesResponse  # noqa: E501
from swagger_server import util


def prerequisite_prerequisite_id_get(request_id, prerequisite_id, accept=None):  # noqa: E501
    """prerequisite_prerequisite_id_get

     # noqa: E501

    :param request_id: 
    :type request_id: str
    :param prerequisite_id: 
    :type prerequisite_id: str
    :param accept: 
    :type accept: str

    :rtype: List[PrerequisitesResponse]
    """
    return 'do some magic!'


def search_inventory(request_id, search_string=None, skip=None, limit=None, accept=None):  # noqa: E501
    """searches inventory

    By passing in the appropriate options, you can search for available inventory in the system  # noqa: E501

    :param request_id: 
    :type request_id: str
    :param search_string: pass an optional search string for looking up inventory
    :type search_string: str
    :param skip: number of records to skip for pagination
    :type skip: int
    :param limit: maximum number of records to return
    :type limit: int
    :param accept: 
    :type accept: str

    :rtype: List[InventoryItem]
    """
    return 'do some magic!'
