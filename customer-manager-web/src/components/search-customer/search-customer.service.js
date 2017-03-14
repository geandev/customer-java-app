import customerResourceModule from 'resources/customer.resource'

let searchCustomerService = function (customerResource, $q) {

  const resource = customerResource
  const promise = $q

  return {
    getAll: getAll
  }

  function getAll() {
    return promise(resolve => {
      resource.getAll().then(response => {
        resolve(Object.assign(response.data, {}))
      })
    })
  }
}

export default angular.module('searchCustomer.service', [
  customerResourceModule
])
  .factory('searchCustomerService', searchCustomerService)
  .name
