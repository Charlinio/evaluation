var app = angular.module('MoviesApp', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
     $routeProvider.when('/movies', {
        templateUrl: '/views/movies.html'
     }).otherwise({
        redirectTo: '/'
     });
}]);