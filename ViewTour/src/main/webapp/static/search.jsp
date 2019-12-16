<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>逛吃逛吃</title>
    <link rel="stylesheet" href="../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="shortcut icon" href="../images/favicon.png"/>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <style>
        .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
            width: 200px;
            height: 65px;
        }

    </style>
</head>
<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row"
         style=" border-bottom: 1px solid #cccccc;">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
            <a class="navbar-brand brand-logo" href="../index.html"><img src="../images/logo.png" alt="logo"></a>
        </div>
        <div class="navbar-menu-wrapper d-flex align-items-stretch">
            <div class="search-field d-none d-md-block">
                <form class="d-flex align-items-center h-100" action="#">
                    <div class="input-group">
                    </div>
                </form>
            </div>
            <ul class="navbar-nav navbar-nav-right">
                <li class="nav-item nav-profile dropdown">
                    <a class="nav-link dropdown-toggle" id="profileDropdown" href="#" data-toggle="dropdown"
                       aria-expanded="false">
                        <div class="nav-profile-img">
                            <img src="../images/faces/face1.jpg" alt="image">
                            <span class="availability-status online"></span>
                        </div>
                        <div class="nav-profile-text">
                            <p class="mb-0 text-black">个人中心</p>
                        </div>
                    </a>
                    <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                        <a class="dropdown-item" href="../static/login/login.html">
                            <i class="mdi mdi-cached mr-2 text-success"></i>
                            登录
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">
                            <i class="mdi mdi-logout mr-2 text-primary"></i>
                            退出
                        </a>
                    </div>
                </li>
                <li class="nav-item d-none d-lg-block full-screen-link">
                    <a class="nav-link">
                        <i class="mdi mdi-fullscreen" id="fullscreen-button"></i>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#"
                       data-toggle="dropdown" aria-expanded="false">
                        <i class="mdi mdi-email-outline"></i>
                        <span class="count-symbol bg-warning"></span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
                         aria-labelledby="messageDropdown">
                        <h6 class="p-3 mb-0">消息中心</h6>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <img src="../images/faces/face4.jpg" alt="image" class="profile-pic">
                            </div>
                            <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                                <h6 class="preview-subject ellipsis mb-1 font-weight-normal">发送消息</h6>
                                <p class="text-gray mb-0">
                                    1 Minutes ago
                                </p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <img src="../images/faces/face3.jpg" alt="image" class="profile-pic">
                            </div>
                            <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                                <h6 class="preview-subject ellipsis mb-1 font-weight-normal">发送消息</h6>
                                <p class="text-gray mb-0">
                                    18 Minutes ago
                                </p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <h6 class="p-3 mb-0 text-center">4 new messages</h6>
                    </div>
                </li>
                <li class="nav-item nav-settings d-none d-lg-block">
                    <a class="nav-link" href="#">
                        <i class="mdi mdi-format-line-spacing"></i>
                    </a>
                </li>
            </ul>
            <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button"
                    data-toggle="offcanvas">
                <span class="mdi mdi-menu"></span>
            </button>
        </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->
        <nav class="sidebar sidebar-offcanvas" id="sidebar">
            <ul class="nav">
                <li class="nav-item nav-profile">
                    <a href="#" class="nav-link">
                        <div class="nav-profile-image">
                            <img src="../images/faces/face1.jpg" alt="profile">
                            <span class="login-status online"></span>
                        </div>
                        <div class="nav-profile-text d-flex flex-column">
                            <span class="font-weight-bold mb-2">小本</span>
                            <span class="text-secondary text-small">管理员</span>
                        </div>
                        <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../index.html">
                        <span class="menu-title">首页</span>
                        <i class="mdi mdi-home menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false"
                       aria-controls="ui-basic">
                        <span class="menu-title">景点管理</span>
                        <i class="menu-arrow"></i>
                        <i class="mdi mdi-crosshairs-gps menu-icon"></i>
                    </a>
                    <div class="collapse" id="ui-basic">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"><a class="nav-link" href="../static/view/list_view.html">景点列表</a></li>
                            <li class="nav-item"><a class="nav-link" href="../static/view/add_view.html">添加景点</a></li>
                            <li class="nav-item"><a class="nav-link" href="../static/view/modify_view.jsp">删改景点</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../static/router/router_curd.jsp">
                        <span class="menu-title">旅游路线管理</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../static/food/around_foods.jsp">
                        <span class="menu-title">周边饮食管理</span>
                        <i class="mdi mdi-heart-box-outline menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../static/around_view/around_views.jsp">
                        <span class="menu-title">周边景点管理</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../static/hotel/around_hotel.jsp">
                        <span class="menu-title">周边住宿管理</span>
                        <i class="mdi mdi-apps menu-icon"></i>
                    </a>
                </li>
            </ul>
        </nav>
        <!-- partial -->
        <div class="main-panel">
            <div class="content-wrapper">
                <div class="page-header">
                    <h3 class="page-title">
              <span class="page-title-icon bg-gradient-danger text-white mr-2">
                <i class="mdi mdi-star-circle icon-md"></i>
              </span>
                        <span id="view_name"></span>
                    </h3>
                    <nav aria-label="breadcrumb">
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item active" aria-current="page">
                                <h4 style="display: inline"><a href="javascript:history.back(-1)">返回</a></h4>

                            </li>
                        </ul>
                    </nav>
                </div>
                <div id="view_info">

                </div>
                <div class="col-md-11 grid-margin stretch-card"
                     style="display: inline-block;padding-right: 3px;padding-left: 13px;">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title text-primary">周边景点推荐</h5>
                            <p class="card-description">
                                beautiful scenery
                            </p>
                            <div class="row">
                                <div class="col-12 grid-margin">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title"></h4>
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead>
                                                    <tr>
                                                        <th>
                                                            #
                                                        </th>
                                                        <th>
                                                            景点名
                                                        </th>
                                                        <th>
                                                            地理位置
                                                        </th>
                                                        <th>
                                                            距离
                                                        </th>
                                                        <th>
                                                            门票价钱
                                                        </th>
                                                        <th>
                                                            推荐原因
                                                        </th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="arView">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title text-danger">景点路线推荐</h5>
                            <p class="card-description">
                                Perfect travel route
                            </p>
                            <div class="row">
                                <div class="col-12 grid-margin">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title"></h4>
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead>
                                                    <tr>
                                                        <th>
                                                            #
                                                        </th>
                                                        <th>
                                                            推荐路线
                                                        </th>
                                                        <th>
                                                            推荐原因
                                                        </th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="router">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title text-warning">美食推荐</h5>
                            <p class="card-description">
                                Delicious food
                            </p>
                            <div class="row">
                                <div class="col-12 grid-margin">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title"></h4>
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead>
                                                    <tr>
                                                        <th>
                                                            #
                                                        </th>
                                                        <th>
                                                            名称
                                                        </th>
                                                        <th>
                                                            地理位置
                                                        </th>
                                                        <th>
                                                            距离
                                                        </th>
                                                        <th>
                                                            人均消费
                                                        </th>
                                                        <th>
                                                            推荐原因
                                                        </th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="food">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title text-success">住宿推荐</h5>
                            <p class="card-description">
                                Good accommodation
                            </p>
                            <div class="row">
                                <div class="col-12 grid-margin">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title"></h4>
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead>
                                                    <tr>
                                                        <th>
                                                            #
                                                        </th>
                                                        <th>
                                                            名称
                                                        </th>
                                                        <th>
                                                            地理位置
                                                        </th>
                                                        <th>
                                                            距离
                                                        </th>
                                                        <th>
                                                            价格
                                                        </th>
                                                        <th>
                                                            酒店评分
                                                        </th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="hotel">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

            <footer class="footer">
                <div class="d-sm-flex justify-content-center justify-content-sm-between">
                    <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2019 <a
                            href="" target="_blank">逛吃去哪儿</a>. All rights reserved. </span>
                    <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">welcome you</span>
                </div>
            </footer>
        </div>
    </div>
</div>

<script>
    $(function(){
        load();
    });
    function load(e) {
        $.ajax({
            url: 'http://localhost:8080/tour/search' + window.location.search,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                if (data.data!== null) {
                    loadAll(data.data);
                    // console.log(data.data.view.viewName);
                    console.log(data.data.view.viewName);
                }
                else {
                    $('.content-wrapper').html("<div style=\"margin: 20px;text-align: center\">\n" +
                        "                    <h4 align=\"center\" style=\"display:inline-block\">无相关景点信息</h4>\n" +
                        "                    <a href=\"javascript:history.back(-1)\">返回</a>\n" +
                        "                    </div>");
                }
            }
        })
    }

    function loadAll(data) {

        $('#view_name').text(`${'${data.view.viewName}'}`);
        var info = $(`
                <div class="col-md-6 grid-margin stretch-card" style="display: inline-block;padding-right: 3px;padding-left: 13px;">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">beautiful as a painting</h4>
                            <div class="media">
                                <img src="${'${data.view.viewImg}'}" width="100%" height="330">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-5 grid-margin stretch-card" style="height:330px;box-sizing:border-box;display: inline-block;padding-right: 3px;padding-left: 13px;">
                    <div class="card" id="desc" style="padding-bottom:0 !important;">
                        <div class="card-body" style="min-height: 200px">
                            <h4 class="card-title">About</h4>
                            <blockquote class="blockquote">
                                <p class="mb-0">${'${data.view.viewDesc}'}</p>
                            </blockquote>
                        </div>
                        <div class="card-body" style="padding-top:0 !important;">
                            <ul class="list-star">
                                <li>${'${data.view.viewPrice}'}元</li>
                                <li>${'${data.view.viewAddress}'}</li>
                                <li>${'${data.view.viewDate}'}</li>
                                <li>${'${data.view.viewType}'}</li>

                            </ul>
                        </div>
                    </div>
                </div>`);
        $('#view_info').append(info);

        for (var i = 0; i < data.surroundView.length; i++) {
            var con1 = $(`
            <tr>
                <td>${'${i}'}</td>
                <td>${'${data.surroundView[i].arViewName}'}</td>
                <td>${'${data.surroundView[i].arViewAddress}'}</td>
                <td>${'${data.surroundView[i].arViewDistance}'}</td>
                <td>${'${data.surroundView[i].arViewPrice}'}</td>
                <td>${'${data.surroundView[i].arViewRecommend}'}</td>
            </tr>
        `)
        }
        $('#arView').append(con1);
        for (var i = 0; i < data.viewFood.length; i++) {
            var con2 = $(`
            <tr>
                <td>${'${i}'}</td>
                <td>${'${data.viewFood[i].foodName}'}</td>
                <td>${'${data.viewFood[i].foodAddress}'}</td>
                <td>${'${data.viewFood[i].foodDistance}'}</td>
                <td>${'${data.viewFood[i].foodPrice}'}</td>
                <td>${'${data.viewFood[i].foodRecommend}'}</td>
            </tr>
        `)
        }
        $('#food').append(con2);

        for (var i = 0; i < data.viewHotel.length; i++) {
            var con3 = $(`
            <tr>
                <td>${'${i}'}</td>
                <td>${'${data.viewHotel[i].hotelName}'}</td>
                <td>${'${data.viewHotel[i].hotelAddress}'}</td>
                <td>${'${data.viewHotel[i].hotelDistance}'}</td>
                <td>${'${data.viewHotel[i].hotelPrice}'}</td>
                <td>${'${data.viewHotel[i].hotelRecommend}'}</td>
            </tr>
        `)
        }
        $('#hotel').append(con3);

        for (var i = 0; i < data.viewRouter.length; i++) {
            var con4 = $(`
            <tr>
                <td>${'${i}'}</td>
                <td>${'${data.viewRouter[i].routerLine}'}</td>
                <td>${'${data.viewRouter[i].hotelRecommend}'}</td>
            </tr>
        `)
        }
        $('#router').append(con4);
    }
</script>
</body>

</html>
