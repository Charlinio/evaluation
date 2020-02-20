'use strict'
app.controller('MovieController', ['$scope', 'Movie', function($scope, Movie) {

     $scope.movie = {
        id : null,
        genre: null,
        picture: null,
        synopsis: null,
        title: null
     };

     $scope.movies = [];

    function all() {
        Movie.findAll().then((response) => {
            $scope.movies = response.data;
        });
    }

    all();

}]);