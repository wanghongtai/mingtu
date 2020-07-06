/**
 * Created by Hunter on 2020-07-06.
 */
var contextPath=getRootPath();
//console.log(contextPath);

function getRootPath() {
    var pathName = window.location.pathname.substring(1);
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
    return window.location.protocol + '//' + window.location.host + '/' + webName + '/';
}