'use strict'
app.factory('Movie', ['$http', function($http) {
    return {
        findAll: function() {
            return $http.get('/movie/all');
        },

    };
}]);