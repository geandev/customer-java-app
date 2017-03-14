import template from './search-customer.template.html'
import searchCustomerServiceModule from './search-customer.service'

let SearchCustomerController = function (searchCustomerService) {
  const vm = this

  vm.customers = []

  vm.getAllCustomers = function () {
    searchCustomerService.getAll().then(customers => {
      vm.customers = customers
    })
  }

  vm.$onInit = function () {
    vm.getAllCustomers()
  }
}

export default angular.module('searchCustomer.component', [
  searchCustomerServiceModule
]).component('searchCustomer', {
  controller: SearchCustomerController,
  controllerAs: 'vm',
  template: template
}).name
