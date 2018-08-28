/**
 *  on 13-12-25.
 */


/**
 *  on 13-12-24.
 * 客户服务
 */
controllers.controller('supportCtrl',
    ['$scope', '$modalInstance',
        function($scope, $modalInstance) {

            $scope.ok = function () {
                $modalInstance.close();
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);