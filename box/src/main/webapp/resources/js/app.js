var boxApp = angular.module('boxApp', [ 'ngRoute', 'boxControllers' ]);

boxApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/rates', {
		templateUrl : 'partials/rates-list.html',
		controller : 'ExchangeRateCtrl'
	}).when('/rates/:rateId', {
		templateUrl : 'partials/rate-detail.html',
		controller : 'ExchangeRateCtrl'
	}).otherwise({
		redirectTo : '/rates'
	});
} ]);