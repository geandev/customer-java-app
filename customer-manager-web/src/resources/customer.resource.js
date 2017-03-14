import config from './config/api.config'

let customerResource = function ($http) {
  const url = config.URL + 'customer'
  const http = $http

  return {
    getAll: getAll,
    add: add
  }

  function getAll() {
    return http.get(url, {
      transformResponse: [
        angular.fromJson
      ]
    })
  }
  function add(customer) {
    return http.post(url, customer)
  }
}

export default angular.module('customerResource.module', [])
  .factory('customerResource', customerResource)
  .name
