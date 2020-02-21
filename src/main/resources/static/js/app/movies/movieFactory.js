'use strict'
app.factory('Movie', ['$http', function($http) {
    return {
        findAll: function() {
            return $http.get('/movie/all');
        },
        add: function(movie) {
            return $http.post('/movie/add', movie);
        },
        update: function(movie) {
            return $http.put('/movie/update/' + movie.id, movie);
        },
        delete: function(movie) {
            return $http.delete('/movie/delete/' + movie.id);
        }

    };
}]);