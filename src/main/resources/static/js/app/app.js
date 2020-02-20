var app = angular.module('MoviesApp', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
     $routeProvider.when('/movie', {
        templateUrl: '/views/movies.html'
     }).otherwise({
        redirectTo: '/'
     });
}]);