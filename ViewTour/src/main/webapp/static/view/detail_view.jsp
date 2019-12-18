<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>景点详情</title>
    <link rel="stylesheet" href="../../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="shortcut icon" href="../../images/favicon.png" />
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <style>
        .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
            width: 200px;
            height: 65px;
        }
        .blockquote{
            margin: 10px 0;
        }
        .blockquote p{
            display: inline-block;
            font-size: .9375rem;
            line-height: 1.5;
        }
        .card-body{
            position: relative;
        }
        .media-body{
            margin-left:20px;
        }
        .card_item{
            border: 1px solid #cccccc;
        }
        .card_item .card_item_body{
            padding: 1.5rem;
        }
        .card-description{
           margin: 5px 0;
        }
        .card .card-description {
            margin-bottom: 0;
            font-family: "ubuntu-regular", sans-serif;
            color: #76838f;
        }
        .recommend_item{
            display: inline-block;
            padding-left: 5px;
        }
        #view_details img{
            width: 360px;
            height: 220px;
        }
    </style>
</head>
<body>
<nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row" style=" border-bottom: 1px solid #cccccc;">
    <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo" href="../../index.jsp"><img src="../../images/logo.png" alt="logo"/></a>
        <a class="navbar-brand brand-logo-mini" href="../../index.jsp"></a>
    </div>
    <div class="navbar-menu-wrapper d-flex align-items-stretch">
        <div class="search-field d-none d-md-block">
            <form class="d-flex align-items-center h-100" action="#">
                <div class="input-group">
                    <div class="input-group-prepend bg-transparent">
                        <i class="input-group-text border-0 mdi mdi-magnify"></i>
                    </div>
                    <input type="text" id="search" value="" class="form-control bg-transparent border-0" placeholder="按照景点名搜索" onkeydown="load()">
                </div>
            </form>
        </div>
        <ul class="navbar-nav navbar-nav-right">
            <li class="nav-item nav-profile dropdown">
                <a class="nav-link dropdown-toggle" id="profileDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                    <div class="nav-profile-img">
                        <img src="../../images/faces/face1.jpg" alt="image">
                        <span class="availability-status online"></span>
                    </div>
                    <div class="nav-profile-text">
                        <p class="mb-0 text-black">个人中心</p>
                    </div>
                </a>
                <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                    <a class="dropdown-item" href="../login/login.jsp">
                        <i class="mdi mdi-cached mr-2 text-success"></i>
                        个人中心
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
                <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                    <i class="mdi mdi-email-outline"></i>
                    <span class="count-symbol bg-warning"></span>
                </a>
                <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                    <h6 class="p-3 mb-0">消息中心</h6>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item preview-item">
                        <div class="preview-thumbnail">
                            <img src="../../images/faces/face4.jpg" alt="image" class="profile-pic">
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
                            <img src="../../images/faces/face3.jpg" alt="image" class="profile-pic">
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
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
            <span class="mdi mdi-menu"></span>
        </button>
    </div>
</nav>
<div class="container-fluid page-body-wrapper">
    <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
            <li class="nav-item nav-profile">
                <a href="#" class="nav-link">
                    <div class="nav-profile-image">
                        <img src="../../images/faces/face1.jpg" alt="profile">
                        <span class="login-status online"></span>
                    </div>
                    <div class="nav-profile-text d-flex flex-column">
                        <span class="font-weight-bold mb-2">${sessionScope.user}</span>
                        <span class="text-secondary text-small">管理员</span>
                    </div>
                    <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../../index.jsp">
                    <span class="menu-title">首页</span>
                    <i class="mdi mdi-home menu-icon"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                    <span class="menu-title">景点管理</span>
                    <i class="menu-arrow"></i>
                    <i class="mdi mdi-crosshairs-gps menu-icon"></i>
                </a>
                <div class="collapse" id="ui-basic">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="list_view.jsp">景点列表</a></li>
                        <li class="nav-item"> <a class="nav-link" href="add_view.jsp">添加景点</a></li>
                        <li class="nav-item"> <a class="nav-link" href="modify_view.jsp">删改景点</a></li>
                    </ul>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../router/router_curd.jsp">
                    <span class="menu-title">旅游路线管理</span>
                    <i class="mdi mdi-assistant menu-icon"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../food/around_foods.jsp">
                    <span class="menu-title">周边饮食管理</span>
                    <i class="mdi mdi-heart-box-outline menu-icon"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../around_view/around_views.jsp">
                    <span class="menu-title">周边景点管理</span>
                    <i class="mdi mdi-assistant menu-icon"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../hotel/around_hotel.jsp">
                    <span class="menu-title">周边住宿管理</span>
                    <i class="mdi mdi-apps menu-icon"></i>
                </a>
            </li>
        </ul>
    </nav>
    <div class="main-panel">
        <div class="content-wrapper">
         <div class="page-header">
                <h3 class="page-title">
                    景点详情
                </h3>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">景点详情</a></li>
                        <li class="breadcrumb-item active" aria-current="page">景点列表</li>
                    </ol>
                </nav>
            </div>
         <div class="col-md-12 grid-margin stretch-card">
            <div class="card">
                <div class="card-body"  style="margin-top: 20px" id="view_container">

                </div>
                <div class="card-body" id="view_details" style="width: 100%;height:  300px;">
                    <h5>景点展示</h5><br>

                </div>
                <div class="card-body" id="around_view">
                    <h5>周边景点</h5>
                    <hr>

                </div>
                <div class="card-body" id="around_food">
                    <h5>周边美食</h5>
                    <hr>

                </div>
                <div class="card-body" id="around_hotel">
                    <h5>周边住宿</h5>
                    <hr>

                </div>
            </div>
          </div>
        </div>
    </div>
</div>
<script>
    //TODO  获取当前景点的详情
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/tour/viewInfo'+window.location.search,
            dataType:"json",
            success:function (data) {
                //TODO  数据由四部分组成
                container_load(data.view);//得到请求的介绍数据  动态加载
                view_load(data.surroundViews); //周边景点数据
                food_load(data.foods);//周边美食数据
                hotel_load(data.hotels);//周边住宿数据
            }
        });
    });
    //加载介绍部分
    function container_load(data) {
        var con = $(`   <h4 class="card-title text-info">${'${data.viewName}'}</h4>
                <h4 style="float: right;position: relative;top: -10%;"><a href="javascript:history.back(-1)">返回</a></h4>
                <hr>
                <div class="desc_more">
                    <h5>景点介绍</h5>
                    <blockquote class="blockquote">
                        <p class="mb-0">
                            ${'${data.viewDesc}'}
                        </p>
                    </blockquote>
                </div>`);
        $('#view_container').append(con);
        var con1 = $(` <img src="../../images/all/${'${data.viewImg}'}" width="300" href="200">
                    <div class="col-md-8 grid-margin stretch-card" style="display: inline-block;position: absolute;top:16%;">
                        <div class="card" >
                            <div class="card-body">
                            <h4 class="card-title">${'${data.viewName}'}</h4>
                            <hr>
                            <ul class="list-ticked">
                                <li>开放时间 &nbsp;&nbsp;${'${data.openTime}'}</li>
                                <li>票务信息 &nbsp;&nbsp;${'${data.ticketInfo}'}</li>
                                <li>公交路线&nbsp;&nbsp;${'${data.busRouter}'}</li>
                                <li>官方网站&nbsp;&nbsp;${'${data.netLocate}'}</li>
                                <li>联系地址&nbsp;&nbsp;${'${data.connectAddress}'}</li>
                            </ul>
                        </div>`);
        $('#view_details').append(con1);
    }
    //加载周边景点
    function view_load(data) {
        for(var i =0;i< data.length;i++){
            var con = $(`     <div class="col-md-5 grid-margin stretch-card recommend_item">
                    <div class="card card_item">
                        <div class="card-body card_item_body">
                            <h6>${'${data[i].arViewName}'}</h6>
                            <div class="media">
                                <img src="../../images/all/${'${data[i].arViewImg}'}" width="60" height="60"/>
                                <div class="media-body">
                                    <p class="card-description">
                                        距离：<code>${'${data[i].arViewDistance}'}</code>, 票价：<code>${'${data[i].arViewPrice}'}元/人</code>
                                    </p>
                                    <p class="card-description">
                                        推荐指数：<code class="text-warning">${'${data[i].arViewRecommend}'}</code>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>`);
            $('#around_view').append(con);
        }

    }
    //加载周边美食
    function food_load(data) {
        for(var i =0;i< data.length;i++){
            var con = $(`
             <div class="col-md-5 grid-margin stretch-card recommend_item">
                        <div class="card card_item">
                            <div class="card-body card_item_body">
                                <h6>${'${data[i].foodName}'}</h6>
                                <div class="media">
                                    <img src="../../images/all/${'${data[i].foodImg}'}" width="60" height="60"/>
                                    <div class="media-body">
                                        <p class="card-description">
                                            距离：<code>${'${data[i].foodDistance}'}公里</code>, 票价：<code>${'${data[i].foodPrice}'}元/人</code>
                                        </p>
                                        <p class="card-description">
                                            推荐指数：<code class="text-warning">${'${data[i].foodRecommend}'}</code>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>`);
            $('#around_food').append(con);
        }
    }
    //加载周边住宿
    function hotel_load(data) {
        for(var i =0;i< data.length;i++) {
            var con = $(` <div class="col-md-5 grid-margin stretch-card recommend_item">
                        <div class="card card_item">
                            <div class="card-body card_item_body">
                                <h6>${'${data[i].hotelName}'}</h6>
                                <div class="media">
                                    <img src="../../images/all/${'${data[i].hotelImg}'}" width="60" height="60"/>
                                    <div class="media-body">
                                        <p class="card-description">
                                            距离：<code>${'${data[i].hotelDistance}'}公里</code>, 票价：<code>${'${data[i].hotelPrice}'}元/人</code>
                                        </p>
                                        <p class="card-description">
                                            推荐指数：<code class="text-warning">${'${data[i].hotelScore}'}</code>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>`);
            $('#around_hotel').append(con);
        }
    }
</script>
<script src="../../js/search.js"></script>
<script src="../../vendors/js/vendor.bundle.base.js"></script>
<script src="../../vendors/js/vendor.bundle.addons.js"></script>
</body>
</html>