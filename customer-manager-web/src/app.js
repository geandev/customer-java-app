import 'angular-material/angular-material.css'
import 'font-awesome/css/font-awesome.css'
import angular from 'angular'
import angularMaterial from 'angular-material'

import searchCustomerModule from './components/search-customer/search-customer.module'
import registerCustomerModule from './components/register-customer/register-customer.module'

export default angular.module('app', [
  searchCustomerModule,
  registerCustomerModule,
  angularMaterial
])
