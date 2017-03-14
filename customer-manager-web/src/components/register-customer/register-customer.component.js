import template from './register-customer.template.html'
import registerCustomerServiceModule from './register-customer.service'

let RegisterCustomerController = function (registerCustomerService, $mdDialog) {
  const vm = this

  vm.registerNewCustomer = function (customer) {
    registerCustomerService.registerNewCustomer(customer).then(data => {
      $mdDialog.show(
        $mdDialog.alert()
          .parent(angular.element(document.querySelector('#popupContainer')))
          .clickOutsideToClose(true)
          .title('Successfully')
          .textContent('Customer registered successfully.')
          .ok('Thanks')
      );
    })
  }
}

export default angular.module('registerCustomer.component', [
  registerCustomerServiceModule
]).component('registerCustomer', {
  controller: RegisterCustomerController,
  controllerAs: 'vm',
  template: template
}).name
