import customerResourceModule from 'resources/customer.resource'

let RegisterCustomerService = function (customerResource, $q) {
  const resource = customerResource
  const promise = $q

  return {
    registerNewCustomer: registerNewCustomer
  }

  function registerNewCustomer(customer) {
    return promise(resolve => {
      resource.add(customer).then(response => {
        resolve(Object.assign(response.data, {}))
      })
    })
  }
}

export default angular.module('registerCustomer.service', [
  customerResourceModule
])
  .factory('registerCustomerService', RegisterCustomerService)
  .name
