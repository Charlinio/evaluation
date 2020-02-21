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

    $scope.setMovie = (movie) => {
        $scope.movie = movie;
    }

    function all() {
        Movie.findAll().then((response) => {
            $scope.movies = response.data;
        });
    }

    $scope.add = (movie) => {
        Movie.add().then((response) => {
            $scope.movie = {}
        });
    }

    //Modals
    $('#addModal').on('shown.bs.modal', function () {
        $('#myInput').trigger('focus');
    });
    $('#editModal').on('shown.bs.modal', function () {
        $('#myInput').trigger('focus');
    });
    $('#deleteModal').on('shown.bs.modal', function () {
        $('#myInput').trigger('focus');
    });

    all();

}]);