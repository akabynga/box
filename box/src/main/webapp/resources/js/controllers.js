var boxControllers = angular.module('boxControllers', []);

boxControllers.controller('ExchangeRateCtrl', [ '$scope', '$http',
		function($scope, $http) {
			$http.get('exchangeRate/?amount=5&skip=0').success(function(data) {
				$scope.rates = data;
			});
			// $scope.orderProp = 'age';
		} ]);

boxControllers.controller('PhoneDetailCtrl', [ '$scope', '$routeParams',
		function($scope, $routeParams) {
			$scope.rateId = $routeParams.rateId;
		} ]);